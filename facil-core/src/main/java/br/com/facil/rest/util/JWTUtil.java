package br.com.facil.rest.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;

import javax.security.auth.login.LoginException;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jwt.SignedJWT;

import br.com.facil.rest.deserializadores.PrincipalDeserializer;
import br.com.facil.rest.jwt.InformacoesApi;

public class JWTUtil {

	public static Gson obterInstanciaGson() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Principal.class, new PrincipalDeserializer());
		return gsonBuilder.create();
	}

	public static Principal extrairUsuarioToken(SignedJWT signedJWT) throws LoginException {
		try {
			String usuarioBase64 = signedJWT.getJWTClaimsSet().getStringClaim("usuario");
			if (usuarioBase64 == null || usuarioBase64.isEmpty() || !Base64.isBase64(usuarioBase64)) {
				return null;
			}

			byte[] jsonUsuario = Base64.decodeBase64(usuarioBase64);
			Gson gson = obterInstanciaGson();

			return (Principal) gson.fromJson(new String(jsonUsuario, "UTF-8"), Principal.class);
		} catch (IOException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		} catch (ParseException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		}
	}

	public static InformacoesApi extraiInformacoesApiToken(SignedJWT signedJWT) throws LoginException {
		try {
			String aplicacaoBase64 = signedJWT.getJWTClaimsSet().getStringClaim("aplicacao");
			if (aplicacaoBase64 == null || aplicacaoBase64.isEmpty() || !Base64.isBase64(aplicacaoBase64)) {
				throw new LoginException("[Token Inválido] JWT não possui o Claim aplicacao");
			}

			byte[] jsonAplicacao = Base64.decodeBase64(aplicacaoBase64);
			return new InformacoesApi(new String(jsonAplicacao));
		} catch (ParseException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		}
	}

	public static SignedJWT extraiJWT(String tokenJwt) throws LoginException {
		try {
			InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream("wso2carbon.jks");
			KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
			keystore.load(file, "wso2carbon".toCharArray());
			Certificate cert = keystore.getCertificate("wso2carbon");
			RSAPublicKey publicKey = (RSAPublicKey) cert.getPublicKey();
			RSASSAVerifier rSASSAVerifier = new RSASSAVerifier(publicKey);
			SignedJWT signedJWT = SignedJWT.parse(tokenJwt);

			if (!signedJWT.verify(rSASSAVerifier)) {
				throw new LoginException("[Token Inválido] Erro ao extrair token JWT: " + tokenJwt);
			}

			return signedJWT;
		} catch (KeyStoreException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		} catch (NoSuchAlgorithmException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		} catch (CertificateException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		} catch (IOException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		} catch (ParseException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		} catch (JOSEException e) {
			throw new LoginException("Erro ao extrair token JWT: " + e.getMessage());
		}
	}

}

package br.com.facil.rest.deserializadores;

import java.lang.reflect.Type;
import java.security.Principal;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class PrincipalDeserializer extends Object implements JsonDeserializer<Principal> {
	

	@Override
	public Principal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		JsonObject jsonObject = json.getAsJsonObject();
		JsonObject resultado = jsonObject.get("resultado").getAsJsonObject();

		return null;
	}

}

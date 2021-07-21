package br.com.facil.rest.interceptors;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import javax.annotation.Priority;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

import br.com.facil.rest.anotacoes.FacilCompressaoGZIP;

@Provider
@Priority(1)
@FacilCompressaoGZIP
public class FacilRestGzipInterceptor implements WriterInterceptor {

	@Override
	public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
		OutputStream outputStream = context.getOutputStream();

		context.setOutputStream(new GZIPOutputStream(outputStream));

		context.proceed();
	}

}

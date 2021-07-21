package br.com.facil.rest.aplicacao;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

@ApplicationPath("/api")
public class FacilRestAplicacao extends Application {

	public FacilRestAplicacao(@Context ServletContext servletContext) {

	}

}

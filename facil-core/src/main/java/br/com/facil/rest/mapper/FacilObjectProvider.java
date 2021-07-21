package br.com.facil.rest.mapper;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@Named
@Provider
@Produces({ "application/json", "application/*+json" })
@Consumes({ "application/json", "application/*+json" })
public class FacilObjectProvider extends Object implements ContextResolver<ObjectMapper> {

	private ObjectMapper mapper;

	public FacilObjectProvider() {
		this.mapper = (new ObjectMapper()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
				.configure(SerializationFeature.WRAP_ROOT_VALUE, false)
				.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		this.mapper.registerModule(new Hibernate5Module());
	}

	@Override
	public ObjectMapper getContext(Class<?> type) {
		return this.mapper;
	}

}

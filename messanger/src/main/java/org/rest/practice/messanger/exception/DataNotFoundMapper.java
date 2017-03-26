package org.rest.practice.messanger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.rest.practice.messanger.modals.ErrorMessage;

@Provider
public class DataNotFoundMapper implements ExceptionMapper<DataNotFound>{

	@Override
	public Response toResponse(DataNotFound arg0) {
		ErrorMessage em=new ErrorMessage(arg0.getMessage(), "Visit documentaon page", Status.NOT_FOUND.getStatusCode());
		return Response.status(Status.NOT_FOUND)
				.entity(em) 
				.build(); 
	}


}

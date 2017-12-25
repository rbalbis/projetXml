package project.http.response;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class CustomResponse {

	public static Response xml(String objectARetourner){
		
		return Response
			 .status(Status.OK)
			.entity(objectARetourner)
			.build();
	}
	
	public static Response fail(){
		return Response
				 .status(Status.EXPECTATION_FAILED)
				.build();
	}
	
}

package com.jersey.controller;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/userService")
public class UserController {
	
	@GET
	@Path("/getAllUsers")
	@Produces("application/json")	
	public Response getAllUsers() throws JSONException {
		 
		JSONObject jsonObject = new JSONObject();		
		List<String> users=new ArrayList<String>();
		users.add("Anup");
		users.add("Akash");
		users.add("Chiku");
		jsonObject.put("data", users.toString());		
		return Response.status(Status.OK).entity(jsonObject.toString()).build();
	  }

}

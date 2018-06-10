package pl.korbeldaniel.erp2.access;

import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/generics")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GenericCrudRest {
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") @Min(0) Integer id) {
		String test = "initial test";
		System.out.println(test);
		return Response.ok("generic |" + test + "| " + id).build();
	}
	
	@GET
	public Response get() {
		String test = "initial test";
		System.out.println(test);
        return Response.ok("generic |" + test + "| " + " get all generics").build();
	}
	
	@POST
	public Response create() {
		return Response.ok("generic |" + " create " + "| " + " generics").build();
	}
	
	@PUT
	public Response update() {
		return Response.ok("generic |" + " update " + "| " + " generics").build();
	}
	
	@PATCH
	public Response updateParameter() {
		return Response.ok("generic |" + " update " + "| " + " generics").build();
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") @Min(0) Integer id) {
        return Response.ok("generic |" + " delete " + "| " + " generics").build();
	}

}

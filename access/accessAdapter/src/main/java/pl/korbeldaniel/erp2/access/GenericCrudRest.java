package pl.korbeldaniel.erp2.access;

import javax.ws.rs.core.Response;

public class GenericCrudRest implements IGenericCrudRestController {

	public Response get(Integer id) {
		String test = "initial test";
		System.out.println(test);
		return Response.ok("generic |" + test + "| " + id).build();
	}
	
	public Response get() {
		String test = "initial test";
		System.out.println(test);
        return Response.ok("generic |" + test + "| " + " get all generics").build();
	}
	
	public Response create() {
		return Response.ok("generic |" + " create " + "| " + " generics").build();
	}
	
	public Response update() {
		return Response.ok("generic |" + " update " + "| " + " generics").build();
	}
	
	public Response updateParameter() {
		return Response.ok("generic |" + " update " + "| " + " generics").build();
	}
	
	public Response delete(Long id) {
        return Response.ok("generic |" + " delete " + "| " + " generics").build();
	}

}

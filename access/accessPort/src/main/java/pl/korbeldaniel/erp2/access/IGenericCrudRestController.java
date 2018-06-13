package pl.korbeldaniel.erp2.access;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
public interface IGenericCrudRestController {
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") @Min(0) Integer id);

	@GET
	public Response get();

	@POST
	public Response create();

	@PUT
	public Response update();

	@PATCH
	public Response updateParameter();

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") @Min(0) @NotNull Long id);
}

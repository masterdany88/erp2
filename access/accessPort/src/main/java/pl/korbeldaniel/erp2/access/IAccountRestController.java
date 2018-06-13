package pl.korbeldaniel.erp2.access;

import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/accounts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IAccountRestController {
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") @Min(0) Integer id);

	@GET
	public Response get();
}

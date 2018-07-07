package pl.korbeldaniel.erp2.access;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import pl.korbeldaniel.erp2.logic.IAccountLogic;

public class AccountController implements IAccountRestController {

	@Inject
	private IAccountLogic accountLogic;

	public Response get(Integer id) {
		String test = "initial test";
		test = accountLogic.getTest();
		System.out.println(test);
		return Response.ok("reservation |" + test + "| ---------- " + id).build();
	}
	
	public Response get() {
		String test = "initial test  22";
		test = accountLogic.getTest();
		System.out.println(test);
        return Response.ok("reservation |" + test + "| " + " get all accounts 33" ).build();
	}

}
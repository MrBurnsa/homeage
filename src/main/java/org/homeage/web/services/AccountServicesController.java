package org.homeage.web.services;

import org.homeage.web.requests.CreateAccountRequest;
import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.requests.UpdateAccountRequest;
import org.homeage.web.responses.Response;
import org.homeage.web.services.business.CreateAccountService;
import org.homeage.web.services.business.GetAccountService;
import org.homeage.web.services.business.UpdateAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class AccountServicesController implements AccountServices {
	@Autowired
	private CreateAccountService createAccountService;

	@Autowired
	private GetAccountService getAccountService;

	@Autowired
	private UpdateAccountService updateAccountService;

	@Override
	@RequestMapping("/createAccount")
	public Response createAccount(@RequestBody final CreateAccountRequest request) {
		return createAccountService.execute(request);
	}

	@Override
	@RequestMapping("/getAccount")
	public Response getAccount(@RequestBody final GetAccountRequest request) {
		return getAccountService.execute(request);
	}

	@Override
	@RequestMapping("/getAccountLoyaltyHistory")
	public void getAccountLoyaltyHistory() {
		System.out.println("Getting account loyalty history.");
	}

	@Override
	@RequestMapping("/updateAccount")
	public Response updateAccount(@RequestBody final UpdateAccountRequest request) {
		return updateAccountService.execute(request);
	}
}
package org.homeage.web.services;

import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.responses.Response;
import org.homeage.web.services.business.GetAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class AccountServicesController implements AccountServices {
	@Autowired
	private GetAccountService getAccountService;

	@Override
	@RequestMapping("/createAccount")
	public void createAccount() {
		System.out.println("Creating account.");
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
	public void updateAccount() {
		System.out.println("Updating account.");
	}
}
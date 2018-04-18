package org.homeage.web.services;

import org.homeage.web.requests.GetAccountRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class AccountServicesController implements AccountServices {

	@Override
	@RequestMapping("/createAccount")
	public void createAccount() {
		System.out.println("Creating account.");
	}

	@Override
	@RequestMapping("/getAccount")
	public void getAccount(@RequestBody final GetAccountRequest request) {
		System.out.println("Getting account: " + request.getAccountNumber());
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
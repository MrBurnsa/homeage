package org.homeage.web.services;

import org.homeage.web.requests.CreateAccountRequest;
import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.requests.UpdateAccountRequest;
import org.homeage.web.responses.Response;

public interface AccountServices {
	Response createAccount(CreateAccountRequest request);

	Response getAccount(GetAccountRequest request);

	void getAccountLoyaltyHistory();

	Response updateAccount(UpdateAccountRequest request);
}
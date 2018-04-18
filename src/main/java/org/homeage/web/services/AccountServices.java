package org.homeage.web.services;

import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.responses.Response;

public interface AccountServices {
	void createAccount();

	Response getAccount(GetAccountRequest request);

	void getAccountLoyaltyHistory();

	void updateAccount();
}
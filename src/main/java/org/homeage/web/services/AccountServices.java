package org.homeage.web.services;

import org.homeage.web.requests.GetAccountRequest;

public interface AccountServices {
	void createAccount();

	void getAccount(GetAccountRequest request);

	void getAccountLoyaltyHistory();

	void updateAccount();
}
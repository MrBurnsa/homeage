package org.homeage.web.responses;

import org.homeage.business.Account;

public final class GetAccountResponse extends Response {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(final Account account) {
		this.account = account;
	}
}
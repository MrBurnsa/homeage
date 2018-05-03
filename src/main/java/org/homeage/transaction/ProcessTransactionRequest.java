package org.homeage.transaction;

import org.homeage.web.dto.AccountDTO;
import org.homeage.web.requests.Request;

public final class ProcessTransactionRequest implements Request {
	private AccountDTO accountDTO;
	private TransactionDTO transactionDTO;

	public void setAccountDTO(final AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}

	public void setTransactionDTO(final TransactionDTO transactionDTO) {
		this.transactionDTO = transactionDTO;
	}

	public AccountDTO getAccountDTO() {
		return accountDTO;
	}

	public TransactionDTO getTransactionDTO() {
		return transactionDTO;
	}
}
package org.homeage.web.controller;

import org.homeage.transaction.ProcessTransactionRequest;
import org.homeage.transaction.ProcessTransactionResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transactions")
public final class TransactionServicesController implements TransactionServices {
	@Override
	public ProcessTransactionResponse processTransaction(final ProcessTransactionRequest request) {
		return null;
	}
}
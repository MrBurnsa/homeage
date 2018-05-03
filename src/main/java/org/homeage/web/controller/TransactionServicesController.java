package org.homeage.web.controller;

import org.homeage.transaction.ProcessTransactionRequest;
import org.homeage.transaction.ProcessTransactionResponse;
import org.homeage.transaction.ProcessTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transactions")
public final class TransactionServicesController implements TransactionServices {
	private final ProcessTransactionService processService;

	@Autowired
	public TransactionServicesController(final ProcessTransactionService processService) {
		this.processService = processService;
	}

	@Override
	@RequestMapping("/processTransaction")
	public ProcessTransactionResponse processTransaction(@RequestBody final ProcessTransactionRequest request) {
		return processService.execute(request);
	}
}
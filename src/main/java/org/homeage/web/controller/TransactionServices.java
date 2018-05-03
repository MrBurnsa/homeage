package org.homeage.web.controller;

import org.homeage.transaction.ProcessTransactionRequest;
import org.homeage.transaction.ProcessTransactionResponse;

public interface TransactionServices {
	ProcessTransactionResponse processTransaction(ProcessTransactionRequest request);
}
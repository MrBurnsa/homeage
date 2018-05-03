package org.homeage.transaction.campaign;

import org.homeage.transaction.TransactionDTO;
import org.homeage.web.dto.AccountDTO;

public interface CampaignEngine {
	void setAccountForDecisioning(AccountDTO accountForDecisioning);

	void setTransactionForDecisioning(TransactionDTO transactionForDecisioning);

	void execute();
}
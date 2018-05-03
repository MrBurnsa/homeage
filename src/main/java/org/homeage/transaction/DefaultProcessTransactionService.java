package org.homeage.transaction;

import org.homeage.transaction.campaign.CampaignEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class DefaultProcessTransactionService implements ProcessTransactionService {
	private final TransactionRepository repository;
	private final ProcessTransactionResponse response;
	private final CampaignEngine campaignEngine;

	private ProcessTransactionRequest request;

	@Autowired
	public DefaultProcessTransactionService(final TransactionRepository repository,
			final ProcessTransactionResponse response, final CampaignEngine campaignEngine) {
		this.repository = repository;
		this.response = response;
		this.campaignEngine = campaignEngine;
	}

	@Override
	public ProcessTransactionResponse execute(final ProcessTransactionRequest request) {
		this.request = request;
		setDTOsForDecisioning();
		executeCampaignEngine();
		return response;
	}

	private void setDTOsForDecisioning() {
		campaignEngine.setAccountForDecisioning(request.getAccountDTO());
		campaignEngine.setTransactionForDecisioning(request.getTransactionDTO());
	}

	private void executeCampaignEngine() {
		campaignEngine.execute();
	}
}
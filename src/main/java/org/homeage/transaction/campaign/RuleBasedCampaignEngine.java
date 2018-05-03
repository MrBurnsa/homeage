package org.homeage.transaction.campaign;

import org.homeage.transaction.TransactionDTO;
import org.homeage.web.dto.AccountDTO;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

final class RuleBasedCampaignEngine implements CampaignEngine {
	private static final String SESSION_NAME = "ksession-rules";
	private AccountDTO accountForDecisioning;
	private TransactionDTO transactionForDecisioning;
	private final KieSession kSession;

	{
		kSession = createKSession();
	}

	@Override
	public void setAccountForDecisioning(final AccountDTO accountForDecisioning) {
		this.accountForDecisioning = accountForDecisioning;
	}

	@Override
	public void setTransactionForDecisioning(final TransactionDTO transactionForDecisioning) {
		this.transactionForDecisioning = transactionForDecisioning;
	}

	@Override
	public void execute() {
		insertDTOsForDecisioning();
		kSession.fireAllRules();
	}

	private KieSession createKSession() {
		final KieServices ks = KieServices.Factory.get();
		final KieContainer kContainer = ks.getKieClasspathContainer();
		return kContainer.newKieSession(SESSION_NAME);
	}

	private void insertDTOsForDecisioning() {
		kSession.insert(accountForDecisioning);
		kSession.insert(transactionForDecisioning);
	}
}
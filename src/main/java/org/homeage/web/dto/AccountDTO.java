package org.homeage.web.dto;

public final class AccountDTO {
	private boolean canEarn;
	private int portfolioId;

	public boolean canEarn() {
		return canEarn;
	}

	public int getPortfolioId() {
		return portfolioId;
	}
}
package org.homeage.certificate;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.homeage.web.dto.AbstractDTO;

public final class CertificateDTO extends AbstractDTO {
	@NotNull
	@Positive
	private BigDecimal amount;
	@NotNull
	@Positive
	private BigDecimal balance;

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

	public void setBalance(final BigDecimal balance) {
		this.balance = balance;
	}
}
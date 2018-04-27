package org.homeage.certificate;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public final class Certificate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CertificateStatus certificateStatus = CertificateStatus.Issued;

	@Column(nullable = false)
	private BigDecimal amount;

	@Column(nullable = false)
	private BigDecimal balance;

	@Column(nullable = false)
	private BigDecimal forfeitedAmount = BigDecimal.ZERO;

	@Version
	private Integer version;

	protected Certificate() {
	}

	public Certificate(final CertificateDTO dto) {
		this.amount = dto.getAmount();
		this.balance = dto.getBalance();
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public boolean isIssued() {
		return certificateStatus == CertificateStatus.Issued;
	}

	public boolean isRedeemed() {
		return certificateStatus == CertificateStatus.Redeemed;
	}

	public void redeem() {
		certificateStatus = CertificateStatus.Redeemed;
		forfeitPoints();
	}

	public void revert() {
		certificateStatus = CertificateStatus.Issued;
		revertForfeitedPoints();
	}

	private void forfeitPoints() {
		forfeitedAmount = balance;
		balance = BigDecimal.ZERO;
	}

	private void revertForfeitedPoints() {
		balance = forfeitedAmount;
		forfeitedAmount = BigDecimal.ZERO;
	}
}
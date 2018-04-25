package org.homeage.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.homeage.web.requests.AccountRequest;

@Entity
public final class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String acctNumber;

	@Column(unique = true)
	private String emailAddress;

	@Column(unique = true)
	private String phoneNumber;

	protected Account() {
	}

	public Account(final AccountRequest request) {
		acctNumber = request.getAccountNumber();
		emailAddress = request.getEmailAddress();
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
package org.homeage.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.homeage.web.requests.CreateAccountRequest;

@Entity
public final class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String acctNumber;

	@Column(unique = true)
	private String emailAddress;

	protected Account() {
	}

	public Account(final CreateAccountRequest request) {
		acctNumber = request.getAccountNumber();
		emailAddress = request.getEmailAddress();
	}

	public String getAcctNumber() {
		return acctNumber;
	}
}
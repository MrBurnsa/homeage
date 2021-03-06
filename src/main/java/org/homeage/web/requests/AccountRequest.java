package org.homeage.web.requests;

import java.util.Date;

public abstract class AccountRequest implements Request {
	private String accountNumber;
	private String emailAddress;
	private Date enrollmentDate;

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
}
package org.homeage.web.requests;

import java.util.Date;

public final class CreateAccountRequest {
	private String accountNumber;
	private Date enrollmentDate;

	public String getAccountNumber() {
		return accountNumber;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
}
package org.homeage.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String acctNumber;

	protected Account() {
	}

	public String getAcctNumber() {
		return acctNumber;
	}
}
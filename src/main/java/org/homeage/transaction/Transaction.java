package org.homeage.transaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class Transaction {
	@GeneratedValue
	@Id
	private Long id;
	@Column(nullable = false)
	private Long clientId;
	@Column(nullable = false)
	private Long accountId;
	private String category;
	private String type;
	private String subType;
	@Column(nullable = false, unique = true)
	private String transactionXref;
}
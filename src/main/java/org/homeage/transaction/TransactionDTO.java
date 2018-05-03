package org.homeage.transaction;

import java.util.Collection;

public final class TransactionDTO {
	private Long clientId;
	private String accountNumber;
	private String category;
	private String type;
	private String subType;
	private String transactionXref;
	private Collection<TransactionItemDTO> transactionItemDTOs;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(final Long clientId) {
		this.clientId = clientId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(final String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(final String subType) {
		this.subType = subType;
	}

	public Collection<TransactionItemDTO> getTransactionItemDTOs() {
		return transactionItemDTOs;
	}

	public void setTransactionItemDTOs(final Collection<TransactionItemDTO> transactionItemDTOs) {
		this.transactionItemDTOs = transactionItemDTOs;
	}

	public String getTransactionXref() {
		return transactionXref;
	}

	public void setTransactionXref(final String transactionXref) {
		this.transactionXref = transactionXref;
	}

}
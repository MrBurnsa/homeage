package org.homeage.client;

public final class ClientDTO {
	private String clientCode;
	private String name;

	public void setClientCode(final String clientCode) {
		this.clientCode = clientCode;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getClientCode() {
		return clientCode;
	}

	public String getName() {
		return name;
	}
}

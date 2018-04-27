package org.homeage.client;

import org.homeage.web.requests.Request;

public final class CreateClientRequest implements Request {
	private ClientDTO clientDTO;

	public ClientDTO getClientDTO() {
		return clientDTO;
	}

	public void setClientDTO(final ClientDTO clientDTO) {
		this.clientDTO = clientDTO;
	}
}
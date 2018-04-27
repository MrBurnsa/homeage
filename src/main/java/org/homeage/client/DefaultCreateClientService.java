package org.homeage.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class DefaultCreateClientService implements CreateClientService {
	private final ClientRepository repository;
	private final CreateClientResponse response;

	@Autowired
	public DefaultCreateClientService(final ClientRepository repository, final CreateClientResponse response) {
		this.repository = repository;
		this.response = response;
	}

	@Override
	public CreateClientResponse execute(final CreateClientRequest request) {
		final ClientDTO clientDTO = request.getClientDTO();
		final Client newClient = new Client(clientDTO);
		repository.save(newClient);
		return response;
	}
}
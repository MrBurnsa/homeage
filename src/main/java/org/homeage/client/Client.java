package org.homeage.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class Client {
	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 10, nullable = false, unique = true)
	private String clientCode;

	@Column(nullable = false, unique = true)
	private String name;

	protected Client() {
	}

	public Client(final ClientDTO dto) {
		clientCode = dto.getClientCode();
		name = dto.getName();
	}
}
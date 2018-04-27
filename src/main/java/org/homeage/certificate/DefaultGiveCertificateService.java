package org.homeage.certificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class DefaultGiveCertificateService implements GiveCertificateService {
	private final CertificateRepository repository;
	private final GiveCertificateResponse response = new GiveCertificateResponse();

	@Autowired
	public DefaultGiveCertificateService(final CertificateRepository repository) {
		this.repository = repository;
	}

	public GiveCertificateResponse execute(final GiveCertificateRequest request) {
		final CertificateDTO dto = request.getCertificateDTO();
		if (dto.isValid()) {
			final Certificate newCertificate = new Certificate(dto);
			repository.save(newCertificate);
		}
		return response;
	}
}
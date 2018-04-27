package org.homeage.certificate.reversion;

import java.util.Optional;

import org.homeage.certificate.Certificate;
import org.homeage.certificate.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class DefaultRevertCertificateService implements RevertCertificateService {
	private final CertificateRepository repository;
	private final RevertCertificateResponse response;

	@Autowired
	public DefaultRevertCertificateService(final CertificateRepository repository,
			final RevertCertificateResponse response) {
		this.repository = repository;
		this.response = response;
	}

	@Override
	public RevertCertificateResponse execute(final RevertCertificateRequest request) {
		final Optional<Certificate> optional = repository.findById(request.getCertificateId());
		if (optional.isPresent()) {
			final Certificate targetCertificate = optional.get();
			
			targetCertificate.revert();
			repository.save(targetCertificate);
		}
		return response;
	}
}
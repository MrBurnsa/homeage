package org.homeage.certificate.redemption;

import java.util.Optional;

import org.homeage.certificate.Certificate;
import org.homeage.certificate.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class DefaultRedeemCertificateService implements RedeemCertificateService {
	private final CertificateRepository repository;
	private final RedeemCertificateResponse response = new RedeemCertificateResponse();

	@Autowired
	public DefaultRedeemCertificateService(final CertificateRepository repository) {
		this.repository = repository;
	}

	@Override
	public RedeemCertificateResponse execute(final RedeemCertificateRequest request) {
		final Optional<Certificate> optional = repository.findById(request.getCertificateId());
		if (optional.isPresent()) {
			final Certificate targetCertificate = optional.get();
			if (targetCertificate.isIssued()) {
				targetCertificate.redeem();
				repository.save(targetCertificate);
			}
		}
		return response;
	}
}
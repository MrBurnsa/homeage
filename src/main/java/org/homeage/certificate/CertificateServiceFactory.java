package org.homeage.certificate;

import org.homeage.certificate.redemption.RedeemCertificateService;
import org.homeage.certificate.reversion.RevertCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
final class CertificateServiceFactory {
	private final GiveCertificateService giveService;
	private final RedeemCertificateService redeemService;
	private final RevertCertificateService revertService;

	@Autowired
	public CertificateServiceFactory(final GiveCertificateService giveService,
			final RedeemCertificateService redeemService, final RevertCertificateService revertService) {
		this.giveService = giveService;
		this.redeemService = redeemService;
		this.revertService = revertService;
	}

	public GiveCertificateService getGiveCertificateService() {
		return giveService;
	}

	public RedeemCertificateService getRedeemCertificateService() {
		return redeemService;
	}

	public RevertCertificateService getRevertCertificateService() {
		return revertService;
	}
}
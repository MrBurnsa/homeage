package org.homeage.certificate;

import org.homeage.certificate.redemption.RedeemCertificateRequest;
import org.homeage.certificate.redemption.RedeemCertificateResponse;
import org.homeage.certificate.redemption.RedeemCertificateService;
import org.homeage.certificate.reversion.RevertCertificateRequest;
import org.homeage.certificate.reversion.RevertCertificateResponse;
import org.homeage.certificate.reversion.RevertCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/certificates")
public final class CertificateServicesController implements CertificateServices {
	private final CertificateServiceFactory services;

	@Autowired
	public CertificateServicesController(final CertificateServiceFactory services) {
		this.services = services;
	}

	@Override
	@RequestMapping("/giveCertificate")
	public GiveCertificateResponse giveCertificate(@RequestBody final GiveCertificateRequest request) {
		final GiveCertificateService service = services.getGiveCertificateService();
		return service.execute(request);
	}

	@Override
	@RequestMapping("/redeemCertificate")
	public RedeemCertificateResponse redeemCertificate(@RequestBody final RedeemCertificateRequest request) {
		final RedeemCertificateService service = services.getRedeemCertificateService();
		return service.execute(request);
	}

	@Override
	@RequestMapping("/revertCertificate")
	public RevertCertificateResponse revertCertificate(@RequestBody final RevertCertificateRequest request) {
		final RevertCertificateService service = services.getRevertCertificateService();
		return service.execute(request);
	}
}
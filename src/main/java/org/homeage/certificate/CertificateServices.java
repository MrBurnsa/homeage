package org.homeage.certificate;

import org.homeage.certificate.redemption.RedeemCertificateRequest;
import org.homeage.certificate.redemption.RedeemCertificateResponse;
import org.homeage.certificate.reversion.RevertCertificateRequest;
import org.homeage.certificate.reversion.RevertCertificateResponse;

public interface CertificateServices {
	GiveCertificateResponse giveCertificate(GiveCertificateRequest request);

	RedeemCertificateResponse redeemCertificate(RedeemCertificateRequest request);

	RevertCertificateResponse revertCertificate(RevertCertificateRequest request);
}
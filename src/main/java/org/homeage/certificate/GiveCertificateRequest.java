package org.homeage.certificate;

import org.homeage.web.requests.Request;

public final class GiveCertificateRequest implements Request {
	private CertificateDTO certificateDTO;

	public CertificateDTO getCertificateDTO() {
		return certificateDTO;
	}
}
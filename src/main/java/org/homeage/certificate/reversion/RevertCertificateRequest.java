package org.homeage.certificate.reversion;

import org.homeage.web.requests.Request;

public final class RevertCertificateRequest implements Request {
	private Long certificateId;

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(final Long certificateId) {
		this.certificateId = certificateId;
	}
}
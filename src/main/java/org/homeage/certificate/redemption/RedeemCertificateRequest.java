package org.homeage.certificate.redemption;

import org.homeage.web.requests.Request;

public final class RedeemCertificateRequest implements Request {
	private Long certificateId;

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(final Long certificateId) {
		this.certificateId = certificateId;
	}
}
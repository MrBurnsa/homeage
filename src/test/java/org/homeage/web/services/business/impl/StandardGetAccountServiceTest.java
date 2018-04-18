package org.homeage.web.services.business.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.GetAccountRequest;

public final class StandardGetAccountServiceTest {
	@Test
	public void isValidWithNullAccountNumber() {
		final StandardGetAccountService service = new StandardGetAccountService();
		final GetAccountRequest request = new GetAccountRequest();
		request.setAccountNumber(null);
		final ResponseDetails details = service.isValid(request);
		assertFalse(details.getWasSuccessful());
		assertEquals(details.getStatusCode(), StatusCode.MISSING_DATA);
	}
}
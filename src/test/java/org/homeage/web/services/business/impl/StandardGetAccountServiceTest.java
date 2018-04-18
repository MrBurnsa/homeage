package org.homeage.web.services.business.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.Assert.*;

import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.GetAccountRequest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
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
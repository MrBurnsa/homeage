package org.homeage.web.services.business.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.responses.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class StandardGetAccountServiceIntegrationTest {
	@Autowired
	private StandardGetAccountService service;

	@Test
	public void testNullAccountNumber() {
		final GetAccountRequest request = new GetAccountRequest();
		request.setAccountNumber(null);
		final Response response = service.execute(request);
		assertNotNull(response);
		final ResponseDetails details = response.getResponseDetails();
		assertNotNull(details);
		assertFalse(details.getWasSuccessful());
		assertEquals(details.getStatusCode(), StatusCode.MISSING_DATA);
	}
}
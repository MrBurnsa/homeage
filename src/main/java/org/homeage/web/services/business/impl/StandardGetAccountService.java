package org.homeage.web.services.business.impl;

import org.homeage.domain.repositories.AccountRepository;
import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.responses.Response;
import org.homeage.web.services.business.GetAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class StandardGetAccountService implements GetAccountService {
	private final Response response = new Response();

	@Autowired
	private AccountRepository repository;

	@Override
	public Response execute(final GetAccountRequest request) {
		response.setResponseDetails(isValid(request));
		return response;
	}

	public ResponseDetails isValid(final GetAccountRequest request) {
		ResponseDetails details = ResponseDetails.createSuccessfulStatus();
		if (request.getAccountNumber() == null) {
			details = ResponseDetails.createFailedStatus(StatusCode.MISSING_DATA, "No account number was provided.");
		} else {
			if (repository.getByAcctNumber(request.getAccountNumber()) != null) {
				System.out.println(request.getAccountNumber() + " found!");
			}
		}
		return details;
	}
}
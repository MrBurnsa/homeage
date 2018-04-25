package org.homeage.web.services.business.impl;

import org.homeage.business.Account;
import org.homeage.domain.repositories.AccountRepository;
import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.CreateAccountRequest;
import org.homeage.web.responses.Response;
import org.homeage.web.services.business.CreateAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class StandardCreateAccountService implements CreateAccountService {
	private final Response response = new Response();

	@Autowired
	private AccountRepository repository;

	@Override
	public Response execute(final CreateAccountRequest request) {
		final ResponseDetails details = validate(request);
		response.setResponseDetails(details);
		if (details.getWasSuccessful()) {
			final Account account = new Account(request);
			repository.save(account);
		}
		return response;
	}

	@Override
	public ResponseDetails validate(final CreateAccountRequest request) {
		ResponseDetails details;
		if (repository.existsByEmailAddress(request.getEmailAddress())) {
			details = ResponseDetails.createFailedStatus(StatusCode.DUPLICATE_KEY,
					"That email address is already registered.");
		} else if (repository.existsByAcctNumber(request.getAccountNumber())) {
			details = ResponseDetails.createFailedStatus(StatusCode.DUPLICATE_KEY,
					"That account number already exists.");
		} else {
			details = ResponseDetails.createSuccessfulStatus();
		}
		return details;
	}
}
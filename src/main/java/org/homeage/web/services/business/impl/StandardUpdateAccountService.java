package org.homeage.web.services.business.impl;

import java.util.Optional;

import org.homeage.business.Account;
import org.homeage.domain.repositories.AccountRepository;
import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.CreateAccountRequest;
import org.homeage.web.requests.UpdateAccountRequest;
import org.homeage.web.responses.Response;
import org.homeage.web.responses.UpdateAccountResponse;
import org.homeage.web.services.business.CreateAccountService;
import org.homeage.web.services.business.UpdateAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class StandardUpdateAccountService implements UpdateAccountService {
	private final UpdateAccountResponse response = new UpdateAccountResponse();

	@Autowired
	private AccountRepository repository;

	@Override
	public UpdateAccountResponse execute(final UpdateAccountRequest request) {
		final ResponseDetails details = validate(request);
		response.setResponseDetails(details);
		if (details.getWasSuccessful()) {
			final Optional<Account> optional = repository.getByAcctNumber(request.getAccountNumber());
			if (optional.isPresent()) {
				final Account account = optional.get();
				account.setEmailAddress(request.getEmailAddress());
				repository.save(account);
			}
		}
		return response;
	}

	@Override
	public ResponseDetails validate(final UpdateAccountRequest request) {
		final ResponseDetails details;
		if (repository.existsByAcctNumber(request.getAccountNumber())) {
			details = ResponseDetails.createSuccessfulStatus();
		} else {
			details = ResponseDetails.createFailedStatus(StatusCode.MISSING_DATA, "Missing account number.");
		}
		return details;
	}
}
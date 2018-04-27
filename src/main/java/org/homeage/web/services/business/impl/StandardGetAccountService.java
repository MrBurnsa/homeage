package org.homeage.web.services.business.impl;

import java.util.Optional;

import org.homeage.business.Account;
import org.homeage.domain.repositories.AccountRepository;
import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.dto.StatusCode;
import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.responses.GetAccountResponse;
import org.homeage.web.services.business.GetAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class StandardGetAccountService implements GetAccountService {
	private final GetAccountResponse response = new GetAccountResponse();

	private final AccountRepository repository;

	@Autowired
	public StandardGetAccountService(final AccountRepository repository) {
		this.repository = repository;
	}

	@Override
	public GetAccountResponse execute(final GetAccountRequest request) {
		response.setResponseDetails(validate(request));
		final Optional<Account> account = repository.getByAcctNumber(request.getAccountNumber());
		if (account.isPresent()) {
			response.setAccount(account.get());
		}
		return response;
	}

	@Override
	public ResponseDetails validate(final GetAccountRequest request) {
		final ResponseDetails details;
		if (request.getAccountNumber() == null) {
			details = ResponseDetails.createFailedStatus(StatusCode.MISSING_DATA, "No account number was provided.");
		} else {
			details = ResponseDetails.createSuccessfulStatus();
		}
		return details;
	}
}
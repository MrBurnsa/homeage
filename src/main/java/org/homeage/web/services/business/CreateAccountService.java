package org.homeage.web.services.business;

import org.homeage.web.requests.CreateAccountRequest;
import org.homeage.web.requests.GetAccountRequest;
import org.homeage.web.responses.Response;

public interface CreateAccountService extends AccountService<CreateAccountRequest,Response> {
}
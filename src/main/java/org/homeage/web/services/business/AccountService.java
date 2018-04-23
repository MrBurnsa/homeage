package org.homeage.web.services.business;

import org.homeage.web.dto.ResponseDetails;
import org.homeage.web.requests.Request;
import org.homeage.web.responses.Response;

public interface AccountService<T extends Request, X extends Response> {
	X execute(T request);

	ResponseDetails validate(T request);
}
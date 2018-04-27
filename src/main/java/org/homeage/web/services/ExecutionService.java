package org.homeage.web.services;

import org.homeage.web.requests.Request;
import org.homeage.web.responses.Response;

public interface ExecutionService<T extends Request, X extends Response> {
	X execute(T request);
}
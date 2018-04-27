package org.homeage.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public final class ClientServicesController implements ClientServices {
	private final CreateClientService createService;

	@Autowired
	public ClientServicesController(final CreateClientService createService) {
		this.createService = createService;
	}

	@Override
	@RequestMapping("/createClient")
	public CreateClientResponse createClient(@RequestBody final CreateClientRequest request) {
		return createService.execute(request);
	}
}
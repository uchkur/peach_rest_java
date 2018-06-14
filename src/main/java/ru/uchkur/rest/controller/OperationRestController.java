package ru.uchkur.rest.controller;

import ru.uchkur.model.Operation;
import ru.uchkur.rest.controller.base.CrudController;
import ru.uchkur.services.OperationService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST Webservices controller for Operations. All supported WS methods are mapped to this controller.
 * 
 * @author Ignas
 * 
 */
@Controller
@RequestMapping("/operation")
public class OperationRestController extends CrudController<Operation> {

    /** Injected service. */
    @Autowired
    private OperationService operationService;

	/**
	 * {@inheritdoc}
	 */
	@Override
	public Service<Operation> getService() {
		return operationService;
	}

}

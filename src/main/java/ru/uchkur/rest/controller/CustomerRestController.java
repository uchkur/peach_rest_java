package ru.uchkur.rest.controller;

import ru.uchkur.model.Customer;
import ru.uchkur.rest.controller.base.CrudController;
import ru.uchkur.services.CustomerService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST Webservices controller for Customers. All supported WS methods are mapped to this controller.
 * 
 * @author Ignas
 * 
 */
@Controller
@RequestMapping("/customer")
public class CustomerRestController extends CrudController<Customer> {

    /** Injected service. */
    @Autowired
    private CustomerService customerService;

	/**
	 * {@inheritdoc}
	 */
	@Override
	public Service<Customer> getService() {
		return customerService;
	}

}

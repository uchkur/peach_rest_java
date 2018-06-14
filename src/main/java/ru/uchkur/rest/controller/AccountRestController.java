package ru.uchkur.rest.controller;

import ru.uchkur.model.Account;
import ru.uchkur.rest.controller.base.CrudController;
import ru.uchkur.services.AccountService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST Webservices controller for Accounts. All supported WS methods are mapped to this controller.
 * 
 * @author Ignas
 * 
 */
@Controller
@RequestMapping("/account")
public class AccountRestController extends CrudController<Account> {

    /** Injected service. */
    @Autowired
    private AccountService accountService;


	/**
	 * {@inheritdoc}
	 */
	@Override
	public Service<Account> getService() {
		return accountService;
	}

}

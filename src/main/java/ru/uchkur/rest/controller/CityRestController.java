package ru.uchkur.rest.controller;

import ru.uchkur.model.City;
import ru.uchkur.rest.controller.base.CrudController;
import ru.uchkur.services.CityService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST Webservices controller for Cities. All supported WS methods are mapped to this controller.
 * 
 * @author Ignas
 * 
 */
@Controller
@RequestMapping("/city")
public class CityRestController extends CrudController<City> {

    /** Injected service. */
    @Autowired
    private CityService cityService;

	/**
	 * {@inheritdoc}
	 */
	@Override
	public Service<City> getService() {
		return cityService;
	}

}

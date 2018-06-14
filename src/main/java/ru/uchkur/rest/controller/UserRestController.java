package ru.uchkur.rest.controller;

import ru.uchkur.model.User;
import ru.uchkur.rest.controller.base.CrudController;
import ru.uchkur.services.UserService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UserRestController extends CrudController<User> {
    @Autowired
    private UserService userService;
    @Override
    public Service<User> getService(){
        return userService;
    }
}



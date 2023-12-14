package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;
import web.service.UserServiceImpl;

@Controller

public class UsersController {
    @Autowired
    UserService userService = new UserServiceImpl();

}

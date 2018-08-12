package ru.home.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.home.service.repositories.UsersRepository;

@Controller
public class UsersController {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {

        model.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";
    }
}

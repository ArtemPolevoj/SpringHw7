package spring.hw7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.hw7.service.PersonService;


@Controller
@RequiredArgsConstructor
public class AuthController {

    private final PersonService service;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/persons")
    public String listRegisteredUsers(Model model){
        model.addAttribute("persons", service.findAllPersons());
        return "persons";
    }
}

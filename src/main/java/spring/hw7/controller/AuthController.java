package spring.hw7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import spring.hw7.model.Person;
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

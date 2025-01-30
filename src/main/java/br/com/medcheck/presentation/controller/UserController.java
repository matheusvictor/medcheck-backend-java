package br.com.medcheck.presentation.controller;

import br.com.medcheck.application.dto.UserResponseDTO;
import br.com.medcheck.application.usecases.LoginService;
import br.com.medcheck.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private LoginService service;

    @GetMapping
    public UserResponseDTO getUser(
            @RequestParam final String email,
            @RequestParam final String password) throws NotFoundException {
        return service.doLogin(email, password);
    }


}

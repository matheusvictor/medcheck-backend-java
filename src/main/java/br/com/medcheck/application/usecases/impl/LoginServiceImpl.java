package br.com.medcheck.application.usecases.impl;

import br.com.medcheck.application.dto.UserResponseDTO;
import br.com.medcheck.application.usecases.LoginService;
import br.com.medcheck.domain.repositories.UserRepository;
import br.com.medcheck.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO doLogin(final String email, final String password) throws UserNotFoundException {
        return userRepository.findByEmailAndPassword(email, password);
    }
}

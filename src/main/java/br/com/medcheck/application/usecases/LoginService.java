package br.com.medcheck.application.usecases;

import br.com.medcheck.application.dto.UserResponseDTO;
import br.com.medcheck.exception.UserNotFoundException;

public interface LoginService {

    UserResponseDTO doLogin(final String email, final String password) throws UserNotFoundException;
}

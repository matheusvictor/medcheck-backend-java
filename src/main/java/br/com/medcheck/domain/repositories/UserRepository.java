package br.com.medcheck.domain.repositories;

import br.com.medcheck.application.dto.UserResponseDTO;
import br.com.medcheck.domain.models.User;
import br.com.medcheck.exception.UserNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    UserResponseDTO findByEmailAndPassword(final String email, final String password) throws UserNotFoundException;
}

package br.com.medcheck.domain.repositories;

import br.com.medcheck.application.dto.UserResponseDTO;
import br.com.medcheck.domain.entities.User;
import br.com.medcheck.exception.NotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    UserResponseDTO findByEmailAndPassword(final String email, final String password) throws NotFoundException;
}

package dio.desafio.agregador.domain.repository;

import dio.desafio.agregador.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

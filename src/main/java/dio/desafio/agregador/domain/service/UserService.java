package dio.desafio.agregador.domain.service;

import dio.desafio.agregador.domain.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User create(User user);
    User findById(Long id);
}

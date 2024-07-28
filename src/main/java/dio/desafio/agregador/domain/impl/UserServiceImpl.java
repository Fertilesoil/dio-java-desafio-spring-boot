package dio.desafio.agregador.domain.impl;

import dio.desafio.agregador.domain.model.User;
import dio.desafio.agregador.domain.repository.UserRepository;
import dio.desafio.agregador.domain.service.UserService;
import jakarta.persistence.JoinColumn;
import org.hibernate.mapping.Join;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository _userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this._userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(_userRepository.findAll());
    }

    @Override
    public User create(User user) {
        return _userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        var user = _userRepository.findById(id);
        return user.orElse(null);
    }
}

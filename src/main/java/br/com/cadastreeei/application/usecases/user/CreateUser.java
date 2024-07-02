package br.com.cadastreeei.application.usecases.user;

import br.com.cadastreeei.application.gateways.user.UserRepository;
import br.com.cadastreeei.domain.dto.user.UserDTO;
import br.com.cadastreeei.domain.user.User;

public class CreateUser {
    private final UserRepository userRepository;

    public CreateUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO execute(User user) {
        return userRepository.save(user);
    }
}

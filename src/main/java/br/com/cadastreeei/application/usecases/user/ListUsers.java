package br.com.cadastreeei.application.usecases.user;

import br.com.cadastreeei.application.gateways.user.UserRepository;
import br.com.cadastreeei.domain.dto.user.UserDTO;

import java.util.List;

public class ListUsers {
    private final UserRepository userRepository;

    public ListUsers(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> execute() {
        return userRepository.findAll();
    }
}

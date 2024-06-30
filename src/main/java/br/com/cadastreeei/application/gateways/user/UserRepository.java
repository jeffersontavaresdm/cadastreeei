package br.com.cadastreeei.application.gateways.user;

import br.com.cadastreeei.domain.dto.user.UserDTO;
import br.com.cadastreeei.domain.user.User;

import java.util.List;

public interface UserRepository {

    UserDTO save(User user);

    List<UserDTO> findAll();
}

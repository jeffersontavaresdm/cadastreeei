package br.com.cadastreeei.infra.service;

import br.com.cadastreeei.application.gateways.user.UserService;
import br.com.cadastreeei.application.usecases.user.CreateUser;
import br.com.cadastreeei.application.usecases.user.ListUsers;
import br.com.cadastreeei.domain.dto.user.UserDTO;
import br.com.cadastreeei.domain.user.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final ListUsers listUsers;
    private final CreateUser createUser;

    public UserServiceImpl(CreateUser createUser, ListUsers listUsers) {
        this.createUser = createUser;
        this.listUsers = listUsers;
    }

    public List<UserDTO> listUsers() {
        return listUsers.execute();
    }

    public UserDTO createUser(User user) {
        return createUser.execute(user);
    }
}

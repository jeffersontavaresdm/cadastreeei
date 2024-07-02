package br.com.cadastreeei.config.user;

import br.com.cadastreeei.application.gateways.user.UserRepository;
import br.com.cadastreeei.application.gateways.user.UserService;
import br.com.cadastreeei.application.usecases.user.CreateUser;
import br.com.cadastreeei.application.usecases.user.ListUsers;
import br.com.cadastreeei.infra.gateways.user.UserJPARepository;
import br.com.cadastreeei.infra.persistence.UserEntityRepository;
import br.com.cadastreeei.infra.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserJPARepository userJPARepository(UserEntityRepository userEntityRepository) {
        return new UserJPARepository(userEntityRepository);
    }

    @Bean
    public UserService userService(CreateUser createUser, ListUsers listUsers) {
        return new UserServiceImpl(createUser, listUsers);
    }

    @Bean
    public CreateUser executeCreateUser(UserRepository userRepository) {
        return new CreateUser(userRepository);
    }

    @Bean
    public ListUsers executeListUsers(UserRepository userRepository) {
        return new ListUsers(userRepository);
    }
}
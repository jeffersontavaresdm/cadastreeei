package br.com.cadastreeei.infra.gateways.user;

import br.com.cadastreeei.application.gateways.user.UserRepository;
import br.com.cadastreeei.domain.dto.user.UserDTO;
import br.com.cadastreeei.domain.entity.UserEntity;
import br.com.cadastreeei.domain.mapper.UserMapper;
import br.com.cadastreeei.domain.user.User;
import br.com.cadastreeei.infra.persistence.UserEntityRepository;

import java.util.List;

public class UserJPARepository implements UserRepository {

    private final UserEntityRepository userEntityRepository;

    public UserJPARepository(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public UserDTO save(User user) {
        UserEntity savedUser = userEntityRepository.save(UserMapper.toEntity(user));
        return UserMapper.toDTO(savedUser);
    }

    @Override
    public List<UserDTO> findAll() {
        return userEntityRepository
            .findAll()
            .stream()
            .map(UserMapper::toDTO)
            .toList();
    }
}
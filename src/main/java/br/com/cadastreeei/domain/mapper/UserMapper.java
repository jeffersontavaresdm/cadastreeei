package br.com.cadastreeei.domain.mapper;

import br.com.cadastreeei.domain.dto.user.UserDTO;
import br.com.cadastreeei.domain.entity.UserEntity;
import br.com.cadastreeei.domain.user.User;

public class UserMapper {

    public static User toDomain(UserEntity entity) {
        return User
            .builder()
            .withName(entity.getName())
            .withEmail(entity.getEmail())
            .withPassword(entity.getPassword())
            .build();
    }

    public static UserEntity toEntity(User user) {
        return UserEntity
            .builder()
            .withName(user.getName())
            .withEmail(user.getEmail())
            .withPassword(user.getPassword())
            .build();
    }

    public static void updateEntity(User user, UserEntity entity) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
    }

    public static UserDTO toDTO(UserEntity user) {
        return new UserDTO(
            user.getId(),
            user.getName(),
            user.getEmail()
        );
    }

    public static UserDTO toDTO(User user) {
        return new UserDTO(
            null,
            user.getName(),
            user.getEmail()
        );
    }
}

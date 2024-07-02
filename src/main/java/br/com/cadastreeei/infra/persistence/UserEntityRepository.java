package br.com.cadastreeei.infra.persistence;

import br.com.cadastreeei.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> { }
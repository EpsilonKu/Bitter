package kz.VastPink.Bitter.repository;

import kz.VastPink.Bitter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}

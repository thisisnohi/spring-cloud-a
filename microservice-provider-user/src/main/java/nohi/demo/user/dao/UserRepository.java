package nohi.demo.user.dao;

import nohi.demo.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nohi on 2018/5/16.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

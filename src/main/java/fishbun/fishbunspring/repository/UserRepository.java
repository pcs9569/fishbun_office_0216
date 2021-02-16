package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);
    //    Optional<User> findByEmail(String u_email);
    User findByEmail(String u_email);
    //    Optional<User> findByName(String u_name);
    List<User> findAll();
    User updateUser(User user);

    void deleteUser(User user);

}

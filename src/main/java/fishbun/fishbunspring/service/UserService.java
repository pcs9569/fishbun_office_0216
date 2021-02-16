package fishbun.fishbunspring.service;

import fishbun.fishbunspring.domain.Member;
import fishbun.fishbunspring.domain.User;
import fishbun.fishbunspring.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User join(User user){
        userRepository.save(user);
        System.out.println("--------------------" + "service" + "-------------------------------");
        System.out.println(user.getU_email());
        System.out.println(user.getU_name());
        System.out.println(user.getU_pw());

        return user;
    }

    public User modify(User user){
        //userRepository.findByEmail(user.getU_email());
        userRepository.updateUser(user);

        System.out.println("--------------------" + "service" + "-------------------------------");
        System.out.println(user.getU_email());
        System.out.println(user.getU_name());
        System.out.println(user.getU_pw());
        System.out.println(user.getU_level());

        return user;
    }

    public void delete(User user){
        userRepository.deleteUser(user);
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }
    public User findOne(String u_email) {
        return userRepository.findByEmail(u_email);
    }
}

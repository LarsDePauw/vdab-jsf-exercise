package be.vdab;

import be.vdab.domain.Fortune;
import be.vdab.domain.User;
import be.vdab.repository.FortuneRepository;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UserController {
    @Inject
    private UserRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findUserById(id);

    }
}

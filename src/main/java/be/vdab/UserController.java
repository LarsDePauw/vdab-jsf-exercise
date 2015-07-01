package be.vdab;

import be.vdab.domain.Fortune;
import be.vdab.domain.User;
import be.vdab.repository.FortuneRepository;
import be.vdab.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class UserController {
    private User user = new User();

    public User getUser() {
        return user;
    }

    @Inject
    private UserRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findUserById(id);
    }

    public String saveUser(){
        userRepository.addUser(user);
        return "table";
    }

    public void remove(int id){
        userRepository.remove(id);
    }
}

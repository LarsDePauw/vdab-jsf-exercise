package be.vdab.repository;

import be.vdab.domain.User;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Named
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User findUserById(int id) {
        return entityManager.find(User.class, id);
    }

    public void save(User user) {
        entityManager.merge(user);
}

    public void remove(int id) {
        entityManager.remove(entityManager.getReference(User.class, id));
    }

    public void addUser(User user) {
        entityManager.merge(user);
    }
}

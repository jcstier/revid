package com.mummyhead.revid.repositories;

import com.mummyhead.revid.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Spring data repository for the {@link com.mummyhead.revid.models.User} model.
 */
@Service("userRepository")
@Repository
@Transactional
public class UserRepository {
    private Logger logger = LoggerFactory.getLogger(UserRepository.class);

    @PersistenceContext
    private EntityManager em;

    public User getUserByUsername(String username){
        TypedQuery<User> tq = em.createQuery("select u from User u where u.username = :username",User.class);
        tq.setParameter("username", username);
        User user = tq.getSingleResult();
        logger.info("Got user {}", user.getUsername());
        return user;
    }
}

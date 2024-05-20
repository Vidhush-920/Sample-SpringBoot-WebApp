package com.trialapp.appone.aorepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trialapp.appone.aomodel.User;

@EnableJpaRepositories
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    
    public User findByUsernameAndPassword(String username, String password);

}

package com.trialapp.appone.aoservices;

import java.util.ArrayList;
import java.util.List;
// import java.util.Optional;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.trialapp.appone.aomodel.User;
import com.trialapp.appone.aorepository.UserRepository;

@Service
@Transactional
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveMyUser(User user) {
        userRepository.save(user);
    }

    public List<User> showAllUsers() {
        List<User> users = new ArrayList<User>();
        for(User user:userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    public User editUser(int id) {
        return userRepository.findById(id).get();
    }

    public void deleteMyUser(int id) {
        userRepository.deleteById(id);
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

}

package com.asparagus.MixLearn.services;


import com.asparagus.MixLearn.exception.UserNotFoundException;
import com.asparagus.MixLearn.model.User;
import com.asparagus.MixLearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findOne(Long id) {
        Optional<User> foundPerson = userRepository.findById(id);
        return foundPerson;
    }

    public Optional<User> findByUsername(String username) {
        Optional<User> person = userRepository.findByUsername(username);
        return person;
    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }


}

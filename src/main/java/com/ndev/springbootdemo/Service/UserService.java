package com.ndev.springbootdemo.Service;

import com.ndev.springbootdemo.model.User;
import com.ndev.springbootdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        Optional <User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new RuntimeException("No user by Id " + id);
    }

    public List<User> findAll (){
        return userRepository.findAll();
    }

    public User saveUser (User user) {
        return userRepository.save(user);
    }

    public void deleteById (Long id){
        userRepository.deleteById(id);
    }
}

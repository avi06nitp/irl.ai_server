package com.irl.ai.irl_ai.ServiceImplementation;
import com.irl.ai.irl_ai.Config.*;

import com.irl.ai.irl_ai.Entities.User;
import com.irl.ai.irl_ai.Payloads.UserDTO;
import com.irl.ai.irl_ai.Repositories.UserRepo;
import com.irl.ai.irl_ai.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserDTO findByUsername(String username) {
        User user=this.userRepo.findByUsername(username);
        UserDTO userDTO=this.modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = this.modelMapper.map(userDTO, User.class);
        User savedUser = this.userRepo.save(user);
        return this.modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public UserDTO updateUser(String username) {
        return null;
    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public List<UserDTO> findAllUsers() {
        return List.of();
    }
}

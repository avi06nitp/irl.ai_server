package com.irl.ai.irl_ai.Services.ServiceImplementation;

import com.irl.ai.irl_ai.Entities.User;
import com.irl.ai.irl_ai.Exception.ResourceNotFoundException;
import com.irl.ai.irl_ai.Payloads.UserDTO;
import com.irl.ai.irl_ai.Repositories.UserRepo;
import com.irl.ai.irl_ai.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDTO findByUserid(Long userId) {
        User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","UserId",String.valueOf(userId)));
        return this.modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = this.modelMapper.map(userDTO, User.class);
        String hashedPassword=passwordEncoder.encode(user.getPasswordHash());
        user.setPasswordHash(hashedPassword);
        User savedUser = this.userRepo.save(user);
        return this.modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Long userId) {
        User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "Id", String.valueOf(userId)));
        User savedUser = this.userRepo.save(user);
        return this.modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public void deleteUserById(Long id) {
        User user = userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "Id", String.valueOf(id)));
        userRepo.delete(user);
    }

    @Override
    public List<UserDTO> findAllUsers() {
        List<User> users=this.userRepo.findAll();
        List<UserDTO> userDTOs=new ArrayList<>();
        for(User user:users){
            userDTOs.add(this.modelMapper.map(user, UserDTO.class));
        }
        return userDTOs;
    }


}

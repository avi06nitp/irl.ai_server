package com.irl.ai.irl_ai.Services;
import com.irl.ai.irl_ai.Payloads.UserDTO;

import java.util.List;


public interface UserService {
    UserDTO findByUsername(String username);
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(String username);
    void deleteUser(String username);
    List<UserDTO> findAllUsers();

}

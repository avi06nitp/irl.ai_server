package com.irl.ai.irl_ai.Services;
import com.irl.ai.irl_ai.Payloads.UserDTO;

import java.util.List;


public interface UserService {
    UserDTO findByUserid(Long userId);
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO, Long userId);
    void deleteUserById(Long userId);
    List<UserDTO> findAllUsers();


}

package com.irl.ai.irl_ai.Controllers;

import com.irl.ai.irl_ai.Entities.User;
import com.irl.ai.irl_ai.Payloads.UserDTO;
import com.irl.ai.irl_ai.Repositories.UserRepo;
import com.irl.ai.irl_ai.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO createdUser = this.userService.createUser(userDTO);
        return new ResponseEntity<>(createdUser, CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserByUserid(@PathVariable Long id) {
        UserDTO userDTO=this.userService.findByUserid(id);
        return ResponseEntity.ok(userDTO);

    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long userId) {
        UserDTO userDTO1=this.userService.updateUser(userDTO, userId);
        return ResponseEntity.ok(userDTO1);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<UserDTO> deleteUser(@PathVariable String username) {
        this.userService.deleteUser(username);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<UserDTO>> findAllUsers() {
        List<UserDTO> userDTOs=this.userService.findAllUsers();
        return ResponseEntity.ok(userDTOs);

    }



}

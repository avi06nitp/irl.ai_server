package com.irl.ai.irl_ai.Controllers;


import com.irl.ai.irl_ai.Payloads.FriendRequestDTO;
import com.irl.ai.irl_ai.Services.FriendRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/friend_request")
public class FriendRequest {

    private  FriendRequestService friendRequestService;

    public FriendRequest(FriendRequestService friendRequestService) {
        this.friendRequestService = friendRequestService;
    }

    @GetMapping
    public ResponseEntity<List<FriendRequestDTO>> getFriendRequests() {
        List<FriendRequestDTO> friendRequests = friendRequestService.getAllFriendRequest();
        return new ResponseEntity<>(friendRequests, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FriendRequestDTO> createFriendRequest(@RequestBody FriendRequestDTO friendRequestDTO) {
        friendRequestService.createFriendRequestDTO(friendRequestDTO);
        return new ResponseEntity<>(friendRequestDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FriendRequestDTO> deleteFriendRequest(@PathVariable Long id) {
        friendRequestService.deleteFriendRequestDTO(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<FriendRequestDTO> setFriendRequest(@PathVariable Long id, @RequestBody FriendRequestDTO friendRequestDTO) {
        friendRequestService.setFriendRequestDTO(friendRequestDTO, id);
        return new ResponseEntity<>(friendRequestDTO, HttpStatus.OK);
    }





}

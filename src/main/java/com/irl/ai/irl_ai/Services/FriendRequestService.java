package com.irl.ai.irl_ai.Services;

import com.irl.ai.irl_ai.Payloads.FriendRequestDTO;

import java.util.List;

public interface FriendRequestService {
    List<FriendRequestDTO> getAllFriendRequest();
    FriendRequestDTO setFriendRequestDTO(FriendRequestDTO friendRequestDTO, Long id);
    void deleteFriendRequestDTO(Long id);
    FriendRequestDTO createFriendRequestDTO(FriendRequestDTO friendRequestDTO);
}
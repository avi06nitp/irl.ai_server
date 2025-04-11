package com.irl.ai.irl_ai.Services.ServiceImplementation;

import com.irl.ai.irl_ai.Entities.FriendRequest;
import com.irl.ai.irl_ai.Exception.ResourceNotFoundException;
import com.irl.ai.irl_ai.Payloads.FriendRequestDTO;
import com.irl.ai.irl_ai.Repositories.FriendRequestRepo;
import com.irl.ai.irl_ai.Services.FriendRequestService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendRequestImpl implements FriendRequestService {

    @Autowired
    private final FriendRequestRepo friendRequestRepo;
    @Autowired
    private final ModelMapper modelMapper;

    @Autowired
    public FriendRequestImpl(FriendRequestRepo friendRequestRepo, ModelMapper modelMapper) {
        this.friendRequestRepo = friendRequestRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public FriendRequestDTO createFriendRequestDTO(FriendRequestDTO friendRequestDTO) {
        FriendRequest friendRequest=modelMapper.map(friendRequestDTO, FriendRequest.class);
        FriendRequest updatedFriendRequest = friendRequestRepo.save(friendRequest);
        return modelMapper.map(updatedFriendRequest, FriendRequestDTO.class);
    }

    @Override
    public FriendRequestDTO setFriendRequestDTO(FriendRequestDTO friendRequestDTO, Long id) {
        friendRequestRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Friend Request", "id", String.valueOf(id)));
        FriendRequest friendRequest=modelMapper.map(friendRequestDTO, FriendRequest.class);
        FriendRequest updatedFriendRequest = friendRequestRepo.save(friendRequest);
        return modelMapper.map(updatedFriendRequest, FriendRequestDTO.class);
    }

    @Override
    public void deleteFriendRequestDTO(Long id) {
        friendRequestRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Friend Request", "id", String.valueOf(id)));
        friendRequestRepo.deleteById(id);
    }

    @Override
    public List<FriendRequestDTO> getAllFriendRequest() {
        List<FriendRequest> friendRequestServiceList = friendRequestRepo.findAll();
        List<FriendRequestDTO> friendRequestDTOList = new ArrayList<>();
        for (FriendRequest friendRequestService : friendRequestServiceList) {
            FriendRequestDTO friendRequestDTO = modelMapper.map(friendRequestService, FriendRequestDTO.class);
            friendRequestDTOList.add(friendRequestDTO);
        }
        return friendRequestDTOList;
    }
}

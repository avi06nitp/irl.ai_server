package com.irl.ai.irl_ai.Services.ServiceImplementation;

import com.irl.ai.irl_ai.Entities.ChatSession;
import com.irl.ai.irl_ai.Exception.ResourceNotFoundException;
import com.irl.ai.irl_ai.Payloads.ChatSessionDTO;
import com.irl.ai.irl_ai.Services.ChatSessionService;
import com.irl.ai.irl_ai.Repositories.ChatServiceRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChatSessionServiceImpl implements ChatSessionService {

    @Autowired
    private ChatServiceRepo chatServiceRepo;

    @Autowired
    private final ModelMapper modelMapper;

    public ChatSessionServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ChatSessionDTO createChatSession(ChatSessionDTO chatSessionDTO) {
        ChatSession chatSession = modelMapper.map(chatSessionDTO, ChatSession.class);
        ChatSession savedChatSession= chatServiceRepo.save(chatSession);
        return modelMapper.map(savedChatSession, ChatSessionDTO.class);
    }

    @Override
    public ChatSessionDTO updateChatSession(ChatSessionDTO chatSessionDTO,Long id) {
         chatServiceRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Chat Session", "Session Id", String.valueOf(id)));
        ChatSession chatSession1= modelMapper.map(chatSessionDTO, ChatSession.class);
        ChatSession savedChatSession= chatServiceRepo.save(chatSession1);
        return modelMapper.map(savedChatSession, ChatSessionDTO.class);
    }

    @Override
    public ChatSessionDTO getChatSessionById(Long id) {
        return null;
    }

    @Override
    public ChatSessionDTO getChatSessionByUsername(String username) {
        return null;
    }

    @Override
    public ChatSessionDTO deleteChatSessionById(Long id) {
        return null;
    }

    @Override
    public ChatSessionDTO deleteChatSessionByUsername(String username) {
        return null;
    }

    @Override
    public List<ChatSessionDTO> getChatSessions() {
        return List.of();
    }
}

package com.irl.ai.irl_ai.Services.ServiceImplementation;

import com.irl.ai.irl_ai.Entities.ChatSession;
import com.irl.ai.irl_ai.Payloads.ChatSessionDTO;
import com.irl.ai.irl_ai.Services.ChatSessionService;
import com.irl.ai.irl_ai.Repositories.ChatServiceRepo;
import com.irl.ai.irl_ai.Services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChatSessionServiceImpl implements ChatSessionService {


    @Override
    public ChatSessionDTO createChatSession(ChatSessionDTO chatSessionDTO) {
        return null;
    }

    @Override
    public ChatSessionDTO updateChatSession(ChatSessionDTO chatSessionDTO) {
        return null;
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

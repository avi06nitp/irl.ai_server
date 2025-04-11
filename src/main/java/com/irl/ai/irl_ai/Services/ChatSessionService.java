package com.irl.ai.irl_ai.Services;

import com.irl.ai.irl_ai.Payloads.ChatSessionDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ChatSessionService {
    ChatSessionDTO createChatSession(ChatSessionDTO chatSessionDTO);
    ChatSessionDTO updateChatSession(ChatSessionDTO chatSessionDTO, Long id);
    ChatSessionDTO getChatSessionById(Long id);
    ChatSessionDTO getChatSessionByUsername(String username);
    ChatSessionDTO deleteChatSessionById(Long id);
    ChatSessionDTO deleteChatSessionByUsername(String username);
    List<ChatSessionDTO> getChatSessions();
}

package com.irl.ai.irl_ai.Repositories;

import com.irl.ai.irl_ai.Entities.ChatSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChatServiceRepo extends JpaRepository<ChatSession, Long> {

}

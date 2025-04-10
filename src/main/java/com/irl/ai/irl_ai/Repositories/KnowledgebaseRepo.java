package com.irl.ai.irl_ai.Repositories;

import com.irl.ai.irl_ai.Entities.Knowledgebase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgebaseRepo extends JpaRepository<Knowledgebase, Long> {
}

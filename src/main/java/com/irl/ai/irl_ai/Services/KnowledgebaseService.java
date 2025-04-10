package com.irl.ai.irl_ai.Services;

import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;

public interface KnowledgebaseService {
    KnowledgebaseDTO createKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO);
    KnowledgebaseDTO updateKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO);
    KnowledgebaseDTO getKnowledgebaseById(Long id);
    KnowledgebaseDTO deleteKnowledgebase(Long id);
}

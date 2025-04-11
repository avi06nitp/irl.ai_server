package com.irl.ai.irl_ai.Services;

import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;

import java.util.List;

public interface KnowledgebaseService {
    KnowledgebaseDTO createKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO);
    KnowledgebaseDTO updateKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO, Long id);
    KnowledgebaseDTO getKnowledgebaseById(Long id);
    void deleteKnowledgebaseById(Long id);
    List<KnowledgebaseDTO> getAllKnowledgebase();

}

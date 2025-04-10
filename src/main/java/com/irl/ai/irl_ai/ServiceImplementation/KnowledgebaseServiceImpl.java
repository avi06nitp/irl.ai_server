package com.irl.ai.irl_ai.ServiceImplementation;
import com.irl.ai.irl_ai.Entities.Knowledgebase;

import com.irl.ai.irl_ai.Entities.Knowledgebase;
import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;
import com.irl.ai.irl_ai.Repositories.KnowledgebaseRepo;
import com.irl.ai.irl_ai.Services.KnowledgebaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KnowledgebaseServiceImpl implements KnowledgebaseService {
    @Autowired
    KnowledgebaseRepo knowledgebaseRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public KnowledgebaseDTO createKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO) {
        Knowledgebase knowledgebase=this.modelMapper.map(knowledgeBaseDTO, Knowledgebase.class);
        Knowledgebase savedKnowledgebase=knowledgebaseRepo.save(knowledgebase);
        return this.modelMapper.map(savedKnowledgebase, KnowledgebaseDTO.class);
    }

    @Override
    public KnowledgebaseDTO updateKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO) {
        return null;
    }

    @Override
    public KnowledgebaseDTO getKnowledgebaseById(Long id) {
        Optional<Knowledgebase> knowledgebase=knowledgebaseRepo.findById(id);
        return this.modelMapper.map(knowledgebase.get(), KnowledgebaseDTO.class);
    }

    @Override
    public KnowledgebaseDTO deleteKnowledgebase(Long id) {
        return null;
    }
}

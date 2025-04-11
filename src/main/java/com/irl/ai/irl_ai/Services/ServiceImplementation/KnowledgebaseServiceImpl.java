package com.irl.ai.irl_ai.Services.ServiceImplementation;
import com.irl.ai.irl_ai.Entities.Knowledgebase;
import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;
import com.irl.ai.irl_ai.Repositories.KnowledgebaseRepo;
import com.irl.ai.irl_ai.Services.KnowledgebaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Knowledgebase knowledgebase=this.modelMapper.map(knowledgeBaseDTO, Knowledgebase.class);
        Knowledgebase savedknowledgebase= knowledgebaseRepo.save(knowledgebase);
        return this.modelMapper.map(savedknowledgebase, KnowledgebaseDTO.class);
    }

    @Override
    public KnowledgebaseDTO getKnowledgebaseById(Long id) {
        Knowledgebase knowledgebase = knowledgebaseRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Knowledgebase not found")); // or any custom exception
        return this.modelMapper.map(knowledgebase, KnowledgebaseDTO.class);
    }


    @Override
    public void deleteKnowledgebaseById(Long id) {
        if (!knowledgebaseRepo.existsById(id)) {
            throw new RuntimeException("Knowledgebase not found");
        }
        knowledgebaseRepo.deleteById(id);
    }
}

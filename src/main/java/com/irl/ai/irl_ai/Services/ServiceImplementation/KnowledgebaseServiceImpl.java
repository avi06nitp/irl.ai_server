package com.irl.ai.irl_ai.Services.ServiceImplementation;
import com.irl.ai.irl_ai.Entities.Knowledgebase;
import com.irl.ai.irl_ai.Exception.ResourceNotFoundException;
import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;
import com.irl.ai.irl_ai.Repositories.KnowledgebaseRepo;
import com.irl.ai.irl_ai.Services.KnowledgebaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnowledgebaseServiceImpl implements KnowledgebaseService {
    @Autowired
    KnowledgebaseRepo knowledgebaseRepo;

    @Autowired
    ModelMapper modelMapper;

    //Create Knowledge base
    @Override
    public KnowledgebaseDTO createKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO) {
        Knowledgebase knowledgebase=this.modelMapper.map(knowledgeBaseDTO, Knowledgebase.class);
        Knowledgebase savedKnowledgebase=knowledgebaseRepo.save(knowledgebase);
        return this.modelMapper.map(savedKnowledgebase, KnowledgebaseDTO.class);
    }

    //Get Knowledge base by id
    @Override
    public KnowledgebaseDTO getKnowledgebaseById(Long id) {
        Knowledgebase knowledgebase = knowledgebaseRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("KnowledgeBase", "KnowledgeBase Id", String.valueOf(id))); // or any custom exception
        return this.modelMapper.map(knowledgebase, KnowledgebaseDTO.class);
    }

    //Update Knowledge base by id
    @Override
    public KnowledgebaseDTO updateKnowledgebase(KnowledgebaseDTO knowledgeBaseDTO, Long id) {
        knowledgebaseRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Knowledgebase", "Id",String.valueOf(id)));
        Knowledgebase knowledgebase=this.modelMapper.map(knowledgeBaseDTO, Knowledgebase.class);
        Knowledgebase savedknowledgebase= knowledgebaseRepo.save(knowledgebase);
        return this.modelMapper.map(savedknowledgebase, KnowledgebaseDTO.class);
    }

    //Delete Knowledge base
    @Override
    public void deleteKnowledgebaseById(Long id) {
        if (!knowledgebaseRepo.existsById(id)) {
            throw new RuntimeException("Knowledgebase not found");
        }
        knowledgebaseRepo.deleteById(id);
    }

    //List of all Knowledge base
    @Override
    public List<KnowledgebaseDTO> getAllKnowledgebase() {
        List<Knowledgebase> knowledgebases=this.knowledgebaseRepo.findAll();
        List<KnowledgebaseDTO> knowledgebaseDTOs=new ArrayList<>();
        for (Knowledgebase knowledgebase : knowledgebases) {
            knowledgebaseDTOs.add(this.modelMapper.map(knowledgebase, KnowledgebaseDTO.class));
        }
        return knowledgebaseDTOs;
    }


}

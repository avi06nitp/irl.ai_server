package com.irl.ai.irl_ai.Controllers;

import com.irl.ai.irl_ai.Entities.Knowledgebase;
import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;
import com.irl.ai.irl_ai.Payloads.UserDTO;
import com.irl.ai.irl_ai.Services.KnowledgebaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/source")
public class KnowledgebaseController {
    private final KnowledgebaseService knowledgebaseService;

    public KnowledgebaseController(KnowledgebaseService knowledgebaseService) {
        this.knowledgebaseService = knowledgebaseService;
    }

    @PostMapping
    public ResponseEntity<KnowledgebaseDTO> createKnowledgebase(@RequestBody KnowledgebaseDTO KnowledgebaseDTO) {

       KnowledgebaseDTO knowledgebaseDTO= knowledgebaseService.createKnowledgebase(KnowledgebaseDTO);
       return new ResponseEntity<>(knowledgebaseDTO, HttpStatus.CREATED);

    }
}

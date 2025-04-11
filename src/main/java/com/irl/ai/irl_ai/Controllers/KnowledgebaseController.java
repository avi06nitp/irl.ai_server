package com.irl.ai.irl_ai.Controllers;

import com.irl.ai.irl_ai.Payloads.KnowledgebaseDTO;
import com.irl.ai.irl_ai.Services.KnowledgebaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<KnowledgebaseDTO> getKnowledgebaseById(@PathVariable Long id) {
        KnowledgebaseDTO knowledgebaseDTO = this.knowledgebaseService.getKnowledgebaseById(id);
        return new ResponseEntity<>(knowledgebaseDTO, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<KnowledgebaseDTO> updateKnowledgebase(@RequestBody KnowledgebaseDTO knowledgebaseDTO) {
        KnowledgebaseDTO knowledgebaseDTO1=knowledgebaseService.updateKnowledgebase(knowledgebaseDTO);
        return new ResponseEntity<>(knowledgebaseDTO1, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteKnowledgebaseById(@PathVariable Long id) {
        knowledgebaseService.deleteKnowledgebaseById(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}

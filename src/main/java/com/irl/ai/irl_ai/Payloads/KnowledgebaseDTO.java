package com.irl.ai.irl_ai.Payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.irl.ai.irl_ai.Entities.RelationType;

@NoArgsConstructor
@Getter
@Setter
public class KnowledgebaseDTO {
    private Long id;
    private RelationType relationType;
    private String content;
}

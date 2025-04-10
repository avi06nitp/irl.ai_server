package com.irl.ai.irl_ai.Payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.RelationType;

@NoArgsConstructor
@Getter
@Setter
public class KnowledgebaseDTO {
    private Long id;
    private RelationType relationType;
    private String content;
}

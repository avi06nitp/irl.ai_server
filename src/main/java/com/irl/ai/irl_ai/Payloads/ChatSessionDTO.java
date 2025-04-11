package com.irl.ai.irl_ai.Payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class ChatSessionDTO {
    private Long id;
    private Long userId;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}

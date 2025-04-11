package com.irl.ai.irl_ai.Payloads;

import com.irl.ai.irl_ai.Entities.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class FriendRequestDTO {
    private Long id;
    private String requesterEmail;
    private Status status;
    private LocalDateTime requestedAt;
    private LocalDateTime respondedAt;
}


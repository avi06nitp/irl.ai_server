package com.irl.ai.irl_ai.Payloads;


import com.irl.ai.irl_ai.Entities.RelationType;
import com.irl.ai.irl_ai.Entities.Status;
import com.irl.ai.irl_ai.Entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String passwordHash;
    private RelationType relationType;
    private Boolean isVerified;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

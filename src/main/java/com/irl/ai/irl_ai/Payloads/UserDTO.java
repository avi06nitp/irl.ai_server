package com.irl.ai.irl_ai.Payloads;


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
    private User.RelationType relationType;
    private User.IsVerified isVerified;
    private User.Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

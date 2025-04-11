package com.irl.ai.irl_ai.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "chatSession")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany
    @JoinColumn(name = "chat_message_id", nullable = false)
    private List<ChatMessage> chatMessages;

    @Column(nullable = false)
    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

}

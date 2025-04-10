package com.irl.ai.irl_ai.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "chatMessage")
@NoArgsConstructor
@AllArgsConstructor@Getter@Setter
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long chat_session_id;
    @Column(nullable = false)
    private Sender sender;
    @Column(nullable = false)
    private String message;
    @Column(nullable = false)
    private LocalDateTime timstamp;
    @Column(nullable = false)
    private Boolean is_useful;




}

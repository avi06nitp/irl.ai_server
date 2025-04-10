package com.irl.ai.irl_ai.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="freiend_request")
public class FreiendRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String requester_email;
    @Column(nullable = false)
    private Status status;
    @Column(nullable = false)
    private LocalDateTime requested_at;
    @Column(nullable = false)
    private LocalDateTime responded_at;
}

package com.irl.ai.irl_ai.Repositories;

import com.irl.ai.irl_ai.Entities.FriendRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRequestRepo extends JpaRepository<FriendRequest, Long> {
}

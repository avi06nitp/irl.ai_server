package com.irl.ai.irl_ai.Repositories;

import com.irl.ai.irl_ai.Entities.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(@NotBlank(message = "Username is mandatory") @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters") String username);
}

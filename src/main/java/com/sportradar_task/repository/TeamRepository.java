package com.sportradar_task.repository;

import com.sportradar_task.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    Optional<Team> findBySlug(String slug);
}

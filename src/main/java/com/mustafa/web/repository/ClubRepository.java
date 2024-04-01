package com.mustafa.web.repository;

import com.mustafa.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club,Long> {
    Optional<Club> findByTitle(String url);
}

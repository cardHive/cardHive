package de.mattaghoni.cardhive.domain.repository;

import de.mattaghoni.cardhive.domain.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    Optional<Game> findByName(String name);
}

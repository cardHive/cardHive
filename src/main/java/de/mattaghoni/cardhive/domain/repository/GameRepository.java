package de.mattaghoni.cardhive.domain.repository;

import de.mattaghoni.cardhive.domain.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}

package de.mattaghoni.cardhive.domain.repository

import de.mattaghoni.cardhive.domain.entity.Game
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import reactor.test.StepVerifier
import spock.lang.Specification

@DataJpaTest
class GameRepositorySpec extends Specification {

    @Autowired
    GameRepository gameRepository

    def setup() {
        gameRepository.deleteAll()
    }

    def "it can store a new game" () {
        given: "there is a new game"
        Game game = new Game(null, "Slay the Spire")

        when: "we save it to the repository"
        def result = gameRepository.saveAndFlush(game)

        then: "the game has a database id"
        result.getId() != null
    }

    def "it can find a game by its name" () {
        given: "there is a game in the database"
        Game game = new Game(null, "Slay the Spire")
        def expected = gameRepository.saveAndFlush(game)

        when: "we load this game from the database"
        def actual = gameRepository.findByName("Slay the Spire").orElseThrow()

        then: "we get the correct game"
        actual == expected
    }
}

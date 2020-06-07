package de.mattaghoni.cardhive.domain.entity

import spock.lang.Specification

class GameSpec extends Specification {
    def game

    def setup() {
        game = new Game("Slay the spire")
    }

    def "it has a name" () {
        expect:
        game.name == "Slay the spire"
    }
}

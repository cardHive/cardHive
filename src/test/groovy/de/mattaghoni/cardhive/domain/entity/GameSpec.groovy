package de.mattaghoni.cardhive.domain.entity

import spock.lang.Specification

class GameSpec extends Specification {
    def game

    def setup() {
        game = new Game(null, "Slay the Spire")
    }

    def "it has a name" () {
        expect:
        game.name == "Slay the Spire"
    }

    def "it can pretty print its contents" () {
        expect:
        game.toString().equals("Game[id: null, name: 'Slay the Spire']")
    }
}

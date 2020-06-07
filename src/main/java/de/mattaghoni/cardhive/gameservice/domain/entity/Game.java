package de.mattaghoni.cardhive.gameservice.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@Getter
@Setter
public class Game {
    @Id
    @Setter
    private Long id;

    @Column
    private final String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Game[id=%d, name='%s']",
                id, name
        );
    }
}

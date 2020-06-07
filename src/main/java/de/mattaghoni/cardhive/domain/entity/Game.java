package de.mattaghoni.cardhive.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column
    private String name;

    @Override
    public String toString() {
        return String.format(
                "Game[id: %d, name: '%s']",
                id, name
        );
    }
}

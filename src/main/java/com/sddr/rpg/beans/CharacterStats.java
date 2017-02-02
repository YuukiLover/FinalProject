package com.sddr.rpg.beans;

import javax.persistence.*;

@Entity
public class CharacterStats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stats_id")
    private int statsId;

}

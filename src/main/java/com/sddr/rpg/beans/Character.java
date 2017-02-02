package com.sddr.rpg.beans;

import javax.persistence.*;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "character_id")
    private int id;
    private String name;
    private int exp;
    private int level;

    @OneToOne(mappedBy = "stats_id")
    private CharacterStats stats;


}

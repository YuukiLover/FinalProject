package com.sddr.rpg.beans;

import javax.persistence.*;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int character_id;
    private String name;
    private int exp;
    private int level;

    @OneToOne
    private CharacterStats stats;


}

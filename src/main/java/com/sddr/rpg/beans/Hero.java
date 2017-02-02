package com.sddr.rpg.beans;

import javax.persistence.*;

@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int character_id;
    private String name;
    private int exp;
    private int level;

    @OneToOne
    private HeroStats stats;


}

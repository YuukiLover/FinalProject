package com.sddr.rpg.beans.hero;

import javax.persistence.*;

@Entity
public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int character_id;
	private String name;
	private int exp;
	private int level;

    @Enumerated(EnumType.STRING)
    private HeroType type;

    @OneToOne
    private HeroStats stats;

    public Hero(){}

    public Hero(String name, HeroType type, HeroStats stats) {
        this.name = name;
        this.stats = stats;
        this.type = type;
    }

    public int getCharacter_id() {
        return character_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public HeroType getType() {
        return type;
    }

    public void setType(HeroType type) {
        this.type = type;
    }

    public HeroStats getStats() {
        return stats;
    }

    public void setStats(HeroStats stats) {
        this.stats = stats;
    }
}

package com.sddr.rpg.beans;

import javax.persistence.*;

@Entity
public class HeroStats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stats_id;

    private int hp;
    private int mp;
    private int atk;
    private int mag;
    private int def;
    private int spr;

    public HeroStats() {

    }

    public HeroStats(int hp, int mp, int atk, int mag, int def, int spr) {
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.mag = mag;
        this.def = def;
        this.spr = spr;
    }

    public int getStats_id() {
        return stats_id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpr() {
        return spr;
    }

    public void setSpr(int spr) {
        this.spr = spr;
    }
}

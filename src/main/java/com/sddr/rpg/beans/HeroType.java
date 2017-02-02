package com.sddr.rpg.beans;

public enum HeroType {
    DPS("Attacker"), DEF("Defender"), SUP("Support"), TNK("Tank");

    private final String type;

    HeroType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}

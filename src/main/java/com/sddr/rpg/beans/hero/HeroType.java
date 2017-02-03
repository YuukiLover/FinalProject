package com.sddr.rpg.beans.hero;

public enum HeroType {
    ATK("Attacker"), DEF("Defender"), SUP("Support");

    private final String type;

    HeroType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}

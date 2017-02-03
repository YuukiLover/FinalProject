package com.sddr.rpg.beans.skill;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ABILITY")
public class AbilitySkill extends Skill {
	
	public AbilitySkill() {
		this.description = "A basic attack";
		this.name="Basical Attack";
	}
	
	public AbilitySkill(String name, String description){
		this.name = name;
		this.description = description;
	}
	

}

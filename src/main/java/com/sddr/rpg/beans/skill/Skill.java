package com.sddr.rpg.beans.skill;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public abstract class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	protected String name;
	protected String description;
	
	public abstract void use();
	
	//TODO prevoir une List<Target> targets. A target is either a Hero either an enemy
	

}

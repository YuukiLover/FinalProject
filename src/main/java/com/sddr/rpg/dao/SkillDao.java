package com.sddr.rpg.dao;

import java.util.List;

import com.sddr.rpg.beans.skill.Skill;

public interface SkillDao extends DAO {
	
	/**
	 * @param id
	 * @return a skill according id
	 */
	Skill getSkill(int id);
	
	/**
	 * @param s the skill to add
	 * 
	 */
	void addSkill(Skill s);
	
	/**
	 * @param s the skill to remove
	 */
	void removeSkill(Skill s);
	
	/**
	 * @return list of all existing skills
	 */
	List<Skill> getAllSkill();
}

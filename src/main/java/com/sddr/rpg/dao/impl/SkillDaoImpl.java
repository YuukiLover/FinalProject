package com.sddr.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.sddr.rpg.beans.skill.Skill;
import com.sddr.rpg.dao.SkillDao;

public class SkillDaoImpl extends DaoImpl implements SkillDao {

	@Override
	public void addSkill(Skill s) {
		openTransaction();
		em.persist(s);
		closeTransaction();
	}

	@Override
	public void removeSkill(Skill s) {
		openTransaction();
		em.remove(s);
		closeTransaction();
	}

	@Override
	public Skill getSkill(int id) {
		openTransaction();
		Skill s = null;
		try {

			TypedQuery<Skill> getSkillQuery = em.createQuery("select s from Skill as s where character_id = :id ",
					Skill.class);
			getSkillQuery.setParameter("id", id);
			s = getSkillQuery.getSingleResult();
		} catch (Exception e) {
			System.err.println("Error while getting a Skill  --> getSkill(" + id + ")");

		} finally {
			closeTransaction();
		}

		return s;
	}

	@Override
	public List<Skill> getAllSkill() {
		List<Skill> skills = new ArrayList<>();

		openTransaction();
		try {
			TypedQuery<Skill> getSkillsQuery = em.createQuery("select s from Skill as s", Skill.class);
			skills = getSkillsQuery.getResultList();

		} catch (Exception e) {
			System.err.println("Error while trying get heroes  --> getAllHero()");
		} finally {
			closeTransaction();
		}

		return skills;
	}

}

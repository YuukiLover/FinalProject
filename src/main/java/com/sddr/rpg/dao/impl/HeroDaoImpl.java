package com.sddr.rpg.dao.impl;

import javax.persistence.TypedQuery;

import com.sddr.rpg.beans.hero.Hero;
import com.sddr.rpg.dao.HeroDao;

public class HeroDaoImpl extends DaoImpl implements HeroDao {

	@Override
	public void addHero(Hero h) {
		
		openTransaction();
		em.persist(h);
		closeTransaction();

	}

	@Override
	public void removeHero(Hero h) {

		openTransaction();
		em.remove(h);
		closeTransaction();
		
	}

	@Override
	public Hero getHero(int id) {
		
		 Hero h = null;
		 try{
			 TypedQuery<Hero> getHeroQuery = em.createQuery("select h from Hero as h", Hero.class);
			 h = getHeroQuery.getSingleResult();
		 }
		 catch(Exception e){
			 System.err.println("Error while getting a super Hero");
			 
		 }
		 return h;
	}
	
	
	
	
	
	

}

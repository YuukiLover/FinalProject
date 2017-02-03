package com.sddr.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.sddr.rpg.beans.Hero;
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
		openTransaction();
		 Hero h = null;
		 try{
			 
			 TypedQuery<Hero> getHeroQuery = em.createQuery("select h from Hero as h where character_id = :id ", Hero.class);
			 getHeroQuery.setParameter("id", id);
			 h = getHeroQuery.getSingleResult();
		 }
		 catch(Exception e){
			 System.err.println("Error while getting a super Hero  --> getHero("+id+")");
			 
		 }
		 finally{
			 closeTransaction(); 
		 }
		 
		 return h;
	}

	@Override
	public List<Hero> getAllHero() {
		
		List<Hero> heroes = new ArrayList<>();
		
		openTransaction();
		try{
			TypedQuery<Hero> getHeroes = em.createQuery("select h from Hero as h", Hero.class);
			heroes = getHeroes.getResultList();
			
		}catch(Exception e){
			 System.err.println("Error while trying get heroes  --> getAllHero()");
		}
		finally{
			closeTransaction();
		}
		
		return heroes;
	}
	
}

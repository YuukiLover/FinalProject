package com.sddr.rpg.dao;

import java.util.List;

import com.sddr.rpg.beans.Hero;

public interface HeroDao extends DAO {

	/**
	 * @param a great Hero
	 * add hero in database
	 */
	void addHero(Hero h);
	/**
	 * @param bad Hero
	 * delete the bad Hero from database
	 */
	void removeHero(Hero h);
	
	
	/**
	 * @return A true Hero not like you or null in case of error
	 * @param a magical number to find your Hero
	 */
	Hero getHero(int id);
	
	/**
	 * @return a list of your favorite heroes.
	 */
	List<Hero> getAllHero();
	
}

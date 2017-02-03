package com.sddr.rpg.FinalProject;

import com.sddr.rpg.beans.hero.Hero;
import com.sddr.rpg.beans.hero.HeroStats;
import com.sddr.rpg.beans.hero.HeroType;
import com.sddr.rpg.connection.ConnectionProvider;
import com.sddr.rpg.dao.HeroDao;
import com.sddr.rpg.dao.impl.HeroDaoImpl;

public class App {

	public static void main(String[] args) {

		HeroDao heroDao = new HeroDaoImpl();

		HeroStats baseStats = new HeroStats();

		heroDao.addHero(new Hero("Lightning", HeroType.ATK, baseStats));
		heroDao.addHero(new Hero("Refia", HeroType.SUP, baseStats));
		heroDao.addHero(new Hero("Snow", HeroType.DEF, baseStats));
		
		Hero h = heroDao.getHero(1);
		
		if(h!=null)
			System.out.println(h.getName());

		ConnectionProvider.closeConnection();
	}

}

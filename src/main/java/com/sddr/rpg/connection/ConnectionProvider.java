package com.sddr.rpg.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionProvider {

	
	private ConnectionProvider(){
		
	}
	
	//Singleton Design Pattern
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	public static EntityManager getConnection(){
		
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("unit-persist");
		}
		
		if(em == null){
			em = emf.createEntityManager();
		}
		
		return em;
	}
	
	public static void closeConnection(){
		
		if(em.isOpen()){
			em.close();
		}
		
		if(emf.isOpen()){
			emf.close();
		}
		
	}
	
	
	
	
}

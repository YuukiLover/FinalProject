package com.sddr.rpg.FinalProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.sddr.rpg.connection.ConnectionProvider;

public class App {

	public static void main(String[] args) {

		
		EntityManager em = ConnectionProvider.getConnection();
		// get and open a new Transaction with database
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		

		tx.commit();
		ConnectionProvider.closeConnection();
	}

}

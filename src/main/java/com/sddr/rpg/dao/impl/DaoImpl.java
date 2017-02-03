package com.sddr.rpg.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.sddr.rpg.connection.ConnectionProvider;
import com.sddr.rpg.dao.DAO;

public abstract class DaoImpl implements DAO {

	protected EntityManager em;
	protected EntityTransaction tx;
	

	public DaoImpl(){
		em = ConnectionProvider.getConnection();
	}
	
	@Override
	public EntityTransaction openTransaction() {

		if (tx == null)
			tx = em.getTransaction();

		try {
			tx.begin();
		} catch (Exception e) {
			System.err.println("Error during begin transaction");

		}
		
		System.out.println("openTransaction -->" + tx.isActive());
		return tx;
	}

	@Override
	public void closeTransaction() {

		if (tx != null) {
			try {
				tx.commit();
			} catch (Exception e) {
				System.err.println("Error during commit transaction");
				tx.rollback();
			}
		}

	}

}

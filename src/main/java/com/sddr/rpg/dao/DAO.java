package com.sddr.rpg.dao;

import javax.persistence.EntityTransaction;

public interface DAO {
	
	EntityTransaction openTransaction();
	void closeTransaction();
	
	
}

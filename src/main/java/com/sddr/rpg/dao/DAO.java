package com.sddr.rpg.dao;

import javax.persistence.Entity;
import javax.transaction.Transaction;

public interface DAO {
	
	Transaction openTransaction();
	void closeTransaction();
	
	Entity findAll();
	
	
}

package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static Sellerdao createSellerDao() {
		return new SellerDaoJDBC();
	}

}

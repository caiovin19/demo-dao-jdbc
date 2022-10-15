package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static Sellerdao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmenteDao createDepartmenteDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}

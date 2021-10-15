package model.dao;

import db.DB;
import db.DbException;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	
}

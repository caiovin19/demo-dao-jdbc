package application;

import model.dao.DaoFactory;
import model.dao.Sellerdao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Sellerdao sellerDao=DaoFactory.createSellerDao();
		Seller seller=sellerDao.findById(3);
		System.out.println(seller);

	}

}

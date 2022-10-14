package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.Sellerdao;
import model.entities.Departmente;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Sellerdao sellerDao=DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById  ===");
		Seller seller=sellerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n=== TEST 2: seller findByDeparmente  ===");
		Departmente departmente=new Departmente(2,null);
		List<Seller>list=sellerDao.findByDepartmente(departmente);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 2: seller findByDeparmente  ===");
		list=sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}

	}

}

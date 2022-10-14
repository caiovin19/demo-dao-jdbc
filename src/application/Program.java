package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.Sellerdao;
import model.entities.Departmente;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
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
		
		System.out.println("\n=== TEST 3: seller findByDeparmente  ===");
		list=sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller INSERT  ===");
		Seller newSeller=new Seller(null,"Greg", "a@gmail.com",new Date(), 3500.00, departmente);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		/*System.out.println("\n=== TEST 5: Update seller  ===");
		seller=sellerDao.findById(1);
		seller.setName("Marta");
		sellerDao.update(seller);
		System.out.println("Update complete");*/
		
		System.out.println("\n=== TEST 6: Delete seller  ===");
		System.out.println(" Chose Seller");
		int idDeleted=sc.nextInt();
		sellerDao.deleteById(idDeleted);
		System.out.println(" Seller deleted "+idDeleted);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

package application;

import java.util.Date;

import model.entities.Departmente;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Departmente obj=new Departmente(1,"Books");
		System.out.println(obj);
		
		Seller seller=new Seller(21,"Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);

	}

}

package application;

import model.dao.DaoFactory;
import model.dao.DepartmenteDao;
import model.entities.Departmente;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmenteDao departmentDao=DaoFactory.createDepartmenteDao();
		
		System.out.println("\n=== TEST 4: seller INSERT  ===");
		Departmente departmente=new Departmente(null, "Advocacia");
		departmentDao.insert(departmente);
		System.out.println("Inserted! New id = " + departmente.getId());
		
		
		

	}

}

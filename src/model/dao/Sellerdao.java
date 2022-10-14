package model.dao;

import java.util.List;

import model.entities.Departmente;
import model.entities.Seller;

public interface Sellerdao {
	
	void insert (Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller>findAll();
	List<Seller>findByDepartmente(Departmente departmente);


}

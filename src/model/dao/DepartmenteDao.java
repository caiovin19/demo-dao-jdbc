package model.dao;

import java.util.List;

import model.entities.Departmente;

public interface DepartmenteDao {
	
	void insert (Departmente obj);
	void update(Departmente obj);
	void deleteById(Integer id);
	Departmente findById(Integer id);
	List<Departmente>findAll();

}

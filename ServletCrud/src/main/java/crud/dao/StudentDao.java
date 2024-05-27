package crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import crud.dto.StudentDto;

public class StudentDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public String insertData(StudentDto dto) {
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		return "Data inserted";
	}
	
	public StudentDto fetchById(int id) {
		StudentDto dto=manager.find(StudentDto.class, id);
		return dto;
	}
	
	public String deleteById(int id) {
		StudentDto dto=manager.find(StudentDto.class, id);
		if(dto!=null) {
			transaction.begin();
			manager.remove(dto);
			transaction.commit();
			return "data is deleted";
		}else {
			return "no data found";
		}
	}
	
	public String deleteAll() {
		Query q=manager.createQuery("select a from StudentDto a");
		List<StudentDto> l=q.getResultList();
		if(l.isEmpty()) {
			return "No data found";
		}else {
			for(StudentDto a:l) {
				transaction.begin();
				manager.remove(a);
				transaction.commit();
			}
			return "Data is deleted";
		}
	}
	
	public List<StudentDto> fetchAll() {
		Query q=manager.createQuery("select a from StudentDto a");
		List<StudentDto> l=q.getResultList();
		return l;
	}
	
	public String update(StudentDto dto) {
		transaction.begin();
		manager.merge(dto);
		transaction.commit();
		return "Data updated";
	}

}

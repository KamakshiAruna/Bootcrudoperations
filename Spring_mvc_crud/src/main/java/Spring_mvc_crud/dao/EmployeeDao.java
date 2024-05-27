package Spring_mvc_crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import Spring_mvc_crud.dto.EmployeeDto;

@Component
public class EmployeeDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void insertData(EmployeeDto employeeDto) {
		transaction.begin();
		manager.persist(employeeDto);
		transaction.commit();
	}

	public EmployeeDto fetchById(int id) {
		EmployeeDto dto = manager.find(EmployeeDto.class, id);
		return dto;
	}
	
    public List<EmployeeDto> fetchAll() {
    	Query q=manager.createQuery("select a from EmployeeDto a");
    	List<EmployeeDto> l=q.getResultList();
    	return l;
    }
    
	public String deletebyid(int id) {
		EmployeeDto dto = manager.find(EmployeeDto.class, id);
		if (dto != null) {
			transaction.begin();
			manager.remove(dto);
			transaction.commit();
			return "Data is deleted";
		} else {
			return "No data found";
		}
	}

	public String deleteAll() {
		Query q = manager.createQuery("select a from EmployeeDto a");
		List<EmployeeDto> l = q.getResultList();
		if (l.isEmpty()) {
			return "No data found";
		} else {
			for (EmployeeDto a : l) {
				transaction.begin();
				manager.remove(a);
				transaction.commit();
			}
			return "Data is deleted";
		}
	}
	
	public String update(EmployeeDto dto) {
		transaction.begin();
		manager.merge(dto);
		transaction.commit();
		return "Data is updated";
	}
}


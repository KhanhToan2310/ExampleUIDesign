package com.task.rentDepartment.Responsitory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.task.rentDepartment.Entity.Department;


@Repository
public interface DepartmentRespository extends JpaRepository<Department, Integer> {
	
	public Long countById(Integer id);
	
	@Query("Select d from Department d where d.name like %?1%")
	public Page<Department> findDepartmentByName(String keyword, Pageable pageable);
	
}

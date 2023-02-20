package com.microservices.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	public Department findDepartmentById(Integer departmentId) {
		return departmentRepository.findById(departmentId).get();
	}
	public Department update(Department department) {
		return departmentRepository.save(department);
	}
	public void deleteById(Integer departmentId) {
		departmentRepository.deleteById(departmentId);
	}

}

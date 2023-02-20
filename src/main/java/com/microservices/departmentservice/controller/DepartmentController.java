package com.microservices.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDeparment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Integer departmentId) {
		return departmentService.findDepartmentById(departmentId);
	}
	@PutMapping("/update")
	public Department update(@RequestBody Department department) {
		return departmentService.update(department);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer departmentId) {
		departmentService.deleteById(departmentId);
	}
}

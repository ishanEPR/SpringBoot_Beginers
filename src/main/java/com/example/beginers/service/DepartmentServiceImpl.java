package com.example.beginers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beginers.entity.Department;
import com.example.beginers.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
	
		 departmentRepository.deleteById(departmentId);
		
	}
	
	

}
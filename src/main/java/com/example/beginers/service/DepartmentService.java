package com.example.beginers.service;

import java.util.List;

import com.example.beginers.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

}

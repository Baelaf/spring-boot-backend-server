package com.backend.backendserver.service;

import com.backend.backendserver.model.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<EmployeeDto> getEmployeeList();
}

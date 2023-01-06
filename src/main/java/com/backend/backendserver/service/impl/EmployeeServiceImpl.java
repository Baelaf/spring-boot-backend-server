package com.backend.backendserver.service.impl;

import com.backend.backendserver.dao.EmployeeDao;
import com.backend.backendserver.model.EmployeeDto;
import com.backend.backendserver.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<EmployeeDto> getEmployeeList() {
        return employeeDao.selectEmployeeList();
    }
}

package com.backend.backendserver.dao;

import com.backend.backendserver.model.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeDao {
    public List<EmployeeDto> selectEmployeeList();
}

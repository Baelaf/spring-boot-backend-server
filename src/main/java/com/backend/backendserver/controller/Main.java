package com.backend.backendserver.controller;

import com.backend.backendserver.dao.MemberDao;
import com.backend.backendserver.model.EmployeeDto;
import com.backend.backendserver.model.MemberDto;
import com.backend.backendserver.service.EmployeeService;
import com.backend.backendserver.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Main {

    @Autowired
    MemberService memberService;

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value="/main")
    public String main() {
        MemberDto member = memberService.getMemberInfo(new MemberDto());

        return member.getMbrId();
    }

    @RequestMapping(value="/employee")
    public List<EmployeeDto> getEmployeeList() {
        List<EmployeeDto> employeeList = employeeService.getEmployeeList();
        return employeeList;
    }
}

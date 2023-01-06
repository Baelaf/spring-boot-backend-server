package com.backend.backendserver.model;

import lombok.Data;

@Data
public class EmployeeDto {
    private int empNo;
    private String empId;
    private String empPwd;
    private String empNm;
    private String identityFront;
    private String identityBack;
}

package com.backend.backendserver.controller;

import com.backend.backendserver.dao.MemberDao;
import com.backend.backendserver.model.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Main {
    @Autowired
    private MemberDao memberDao;

    @GetMapping(value="/main")
    public String main() {
        String memberId = memberDao.selectUserId();
        List<MemberDto> userList = memberDao.selectMemberList();
        return userList.toString();
    }
}

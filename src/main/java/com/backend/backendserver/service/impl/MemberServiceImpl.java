package com.backend.backendserver.service.impl;

import com.backend.backendserver.dao.MemberDao;
import com.backend.backendserver.model.MemberDto;
import com.backend.backendserver.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDao memberDao;

    @Override
    public MemberDto getMemberInfo(MemberDto memberDto) {
        return memberDao.selectMemberInfo(memberDto);
    }
}

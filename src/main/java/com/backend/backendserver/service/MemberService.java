package com.backend.backendserver.service;

import com.backend.backendserver.model.MemberDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    public MemberDto getMemberInfo(MemberDto memberDto);
}

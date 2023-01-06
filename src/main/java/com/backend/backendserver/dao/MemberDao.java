package com.backend.backendserver.dao;

import com.backend.backendserver.model.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {
    public MemberDto selectMemberInfo(MemberDto memberDto);

    public List<MemberDto> selectMemberList();

    public String selectUserId();
}

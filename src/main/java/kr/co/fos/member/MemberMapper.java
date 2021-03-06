package kr.co.fos.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Repository
public interface MemberMapper {
    public int count(Member member) throws Exception;
    public List<Member> list(Member member) throws Exception;
    public Member select(Member member) throws Exception;
    public void insert(Member member) throws Exception;
    public void update(Member member) throws Exception;
    public void delete(Member member) throws Exception;
}
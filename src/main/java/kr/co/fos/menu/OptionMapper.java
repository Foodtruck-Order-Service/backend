package kr.co.fos.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface OptionMapper {
    public int count(Option option) throws Exception;
    public List<Option> list(Option option) throws Exception;
    public Option select(Option option) throws Exception;
    public int insert(Option option) throws Exception;
    public void update(Option option) throws Exception;
    public void delete(Option option) throws Exception;
}
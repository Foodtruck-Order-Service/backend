package kr.co.fos.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface OptionValueMapper {
    public int count(OptionValue optionValue) throws Exception;
    public List<OptionValue> list(OptionValue optionValue) throws Exception;
    public OptionValue select(OptionValue optionValue) throws Exception;
    public void insert(OptionValue optionValue) throws Exception;
    public void update(OptionValue optionValue) throws Exception;
    public void delete(OptionValue optionValue) throws Exception;
}
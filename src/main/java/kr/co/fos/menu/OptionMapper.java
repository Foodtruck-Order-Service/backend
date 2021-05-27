package kr.co.fos.menu;

import java.util.List;

public interface OptionMapper {
    public int count(Option option) throws Exception;
    public List<Option> list(Option option) throws Exception;
    public Option select(Option option) throws Exception;
    public void insert(Option option) throws Exception;
    public void update(Option option) throws Exception;
    public void delete(Option option) throws Exception;
}
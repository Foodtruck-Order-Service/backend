package kr.co.fos.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface MenuMapper {
    public int count(Menu menu) throws Exception;
    public List<Menu> list(Menu menu) throws Exception;
    public Menu select(Menu menu) throws Exception;
    public int insert(Menu menu) throws Exception;
    public boolean update(Menu menu) throws Exception;
    public boolean delete(Menu menu) throws Exception;
}
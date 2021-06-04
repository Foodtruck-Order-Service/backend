package kr.co.fos.order;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface MenuDetailMapper {
    public int count(MenuDetail menuDetail) throws Exception;
    public List<MenuDetail> list(MenuDetail menuDetail) throws Exception;
    public MenuDetail select(MenuDetail menuDetail) throws Exception;
    public int insert(MenuDetail menuDetail) throws Exception;
    public void update(MenuDetail menuDetail) throws Exception;
    public void delete(MenuDetail menuDetail) throws Exception;
}
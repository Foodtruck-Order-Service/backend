package kr.co.fos.menu;

import java.util.List;

public interface MenuDetailMapper {
    public int count(MenuDetail menuDetail) throws Exception;
    public List<MenuDetail> list(MenuDetail menuDetail) throws Exception;
    public MenuDetail select(MenuDetail menuDetail) throws Exception;
    public void insert(MenuDetail menuDetail) throws Exception;
    public void update(MenuDetail menuDetail) throws Exception;
    public void delete(MenuDetail menuDetail) throws Exception;
}
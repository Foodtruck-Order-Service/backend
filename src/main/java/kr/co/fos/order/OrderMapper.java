package kr.co.fos.order;

import java.util.List;

public interface OrderMapper {
    public int count(Order order) throws Exception;
    public List<Order> list(Order order) throws Exception;
    public Order select(Order order) throws Exception;
    public void insert(Order order) throws Exception;
    public void update(Order order) throws Exception;
    public void delete(Order order) throws Exception;
}
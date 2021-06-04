package kr.co.fos.order;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OrderInfoMapper {
    public int count(OrderInfo orderInfo) throws Exception;
    public List<OrderInfo> list(OrderInfo orderInfo) throws Exception;
    public OrderInfo select(OrderInfo orderInfo) throws Exception;
    public int insert(OrderInfo orderInfo) throws Exception;
    public void update(OrderInfo orderInfo) throws Exception;
    public void delete(OrderInfo orderInfo) throws Exception;
}
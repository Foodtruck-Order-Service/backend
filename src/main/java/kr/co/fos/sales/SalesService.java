package kr.co.fos.sales;

import java.util.List;

import kr.co.fos.order.Order;

public interface SalesService {
	public List<Order> salesInquiry(Order order);
}

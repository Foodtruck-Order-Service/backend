package kr.co.fos.order;

import java.util.List;

import kr.co.fos.member.Member;

public interface OrderService {
	public boolean orderRegister(Order order);
	public List<Order> orderListInquiry(Order order);
	public Order orderDetailInquiry(Order order);
	public boolean orderUpdate(Order order);
	public boolean orderCancle(Order order);
	public boolean orderCancleAuth(Order order);
	public int waitTimeInquiry(Order order);
}

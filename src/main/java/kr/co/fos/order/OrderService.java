package kr.co.fos.order;

import java.util.List;

import kr.co.fos.member.Member;

public interface OrderService {
	public boolean orderRegister(Order order);
	public List<Order> orderListInquiry(int no);
	public Order orderDetailInquiry(int no);
	public boolean orderStateUpdate(int no);
	public boolean orderCancle(int no);
	public boolean orderCancleAuth(int no);
	public List<Order> orderSearch(String string);
	public boolean orderPayment(int no, Member member);
	public boolean orderPaymentCancle(int no, Member member);
	public int waitTimeInquiry(int no);
}

package kr.co.fos.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderMapper orderMapper;

	@Override
	public boolean orderRegister(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> orderListInquiry(Order order) {
		List<Order> orderList = null;
		try {
			orderList = orderMapper.list(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderList;
	}

	@Override
	public Order orderDetailInquiry(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean orderUpdate(Order order) {
		boolean result = false;
		try {
			orderMapper.update(order);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean orderCancle(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean orderCancleAuth(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int waitTimeInquiry(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

}

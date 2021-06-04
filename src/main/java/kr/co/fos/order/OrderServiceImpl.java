package kr.co.fos.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderMapper orderMapper;
	@Autowired
	OrderInfoMapper orderInfoMapper;
	@Autowired
	MenuDetailMapper menuDetailMapper;

	@Override
	public int orderRegister(Order order) {
		try {
			orderMapper.insert(order);
			List<OrderInfo> orderInfoList = order.getOrderInfos();
			for(int i = 0; i < orderInfoList.size(); i++) {
				OrderInfo orderInfo = orderInfoList.get(i);
				orderInfo.setOrderNo(order.getNo());
				orderInfoMapper.insert(orderInfo);
				List<MenuDetail> menuDetailList = orderInfo.getMenuDetails();
				for(int j = 0; j < menuDetailList.size(); j++) {
					MenuDetail menuDetail = menuDetailList.get(j);
					menuDetail.setOrderInfoNo(orderInfo.getNo());
					menuDetailMapper.insert(menuDetail);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order.getNo();
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
		Order orderData = null;
		try {
			orderData = orderMapper.select(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderData;
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

	@Override
	public Order orderBusinessDetailInquiry(Order order) {
		Order orderData = new Order();
		try {
			orderData = orderMapper.select(order);
			OrderInfo orderInfoData = new OrderInfo();
			orderInfoData.setOrderNo(orderData.getNo());
			List<OrderInfo> orderInfoDataList = orderInfoMapper.list(orderInfoData);
			if (orderInfoDataList != null) {
				for(int i =0; i < orderInfoDataList.size(); i++) {
					MenuDetail menuDetail = new MenuDetail();
					menuDetail.setOrderInfoNo(orderInfoDataList.get(i).getNo());
					List<MenuDetail> menuDetailList = menuDetailMapper.list(menuDetail);
					orderInfoDataList.get(i).setMenuDetails(menuDetailList);
				}
				orderData.setOrderInfos(orderInfoDataList);
			}
			return orderData;
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

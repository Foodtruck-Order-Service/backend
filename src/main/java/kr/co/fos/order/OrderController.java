package kr.co.fos.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fos.foodtruck.Foodtruck;
import kr.co.fos.foodtruck.FoodtruckServiceImpl;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderServiceImpl orderServiceImpl;
	@Autowired
	FoodtruckServiceImpl foodtruckServiceImpl;
	@PostMapping
	public ResponseEntity<Object> doOrderRegister(Order order) {
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Object> doOrderListInquiry(Order order) {
		List<Order> orderList = orderServiceImpl.orderListInquiry(order);
		List<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();
		for(int i = 0; i < orderList.size(); i++) {
			ListViewItem listViewItem = new ListViewItem();
			Foodtruck foodtruck = new Foodtruck();
			foodtruck.setNo(orderList.get(i).getFoodtruckNo());
			Foodtruck foodtruckData= foodtruckServiceImpl.foodtruckDetailInquiry(foodtruck);
			listViewItem.setNo(orderList.get(i).getNo());
			listViewItem.setMemberNo(orderList.get(i).getMemberNo());
			listViewItem.setFoodtruckNo(foodtruckData.getNo());
			listViewItem.setName(foodtruckData.getName());
			listViewItem.setReceptionNo(orderList.get(i).getReceptionNo());
			listViewItem.setOrderTime(orderList.get(i).getOrderTime());
			listViewItem.setTotalAmount(orderList.get(i).getTotalAmount());
			listViewItem.setStatus(orderList.get(i).getStatus());
			listViewItemList.add(listViewItem);
		}
		System.out.println(listViewItemList);
		return ResponseEntity.status(HttpStatus.OK).body(listViewItemList);
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doOrderDetailInquiry(Order order) {
		return null;
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doOrderUpdate (@PathVariable int no, @RequestBody Order order) {
		order.setNo(no);
		boolean result = orderServiceImpl.orderUpdate(order);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doOrderCancle(Order order) {
		return null;
	}
	
	@DeleteMapping("/{no}/cancle")
	public ResponseEntity<Object> doOrderCancleAuth(Order order) {
		return null;
	}
	
	@GetMapping("/time")
	public ResponseEntity<Object> doWaitTimeInquiry(Order Order) {
		return null;
	}
}

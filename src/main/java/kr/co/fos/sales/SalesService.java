package kr.co.fos.sales;

import java.util.Date;
import java.util.Map;

public interface SalesService {
	public Map<String, Integer> salesInquiry(int no, Date start, Date end);
}

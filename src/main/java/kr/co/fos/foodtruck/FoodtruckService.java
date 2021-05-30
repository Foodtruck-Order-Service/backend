package kr.co.fos.foodtruck;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FoodtruckService {
	public boolean foodtruckRegister(Foodtruck foodtruck, MultipartFile attach);
	public List<Foodtruck> foodtruckListInquiry(Foodtruck foodtruck);
	public Foodtruck foodtruckDetailInquiry(int no);
	public boolean foodtruckUpdate(Foodtruck foodtruck, MultipartFile attach);
	public boolean foodtruckDelete(Foodtruck foodtruck);
	public boolean foodtruckLocationRegister(Foodtruck foodtruck);
}

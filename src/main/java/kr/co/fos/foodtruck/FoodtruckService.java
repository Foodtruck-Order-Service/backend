package kr.co.fos.foodtruck;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FoodtruckService {
	public Foodtruck foodtruckRegister(Foodtruck foodtruck, MultipartFile attach);
	public List<Foodtruck> foodtruckListInquiry();
	public Foodtruck foodtruckDetailInquiry(int no);
	public boolean foodtruckUpdate(Foodtruck foodtruck, MultipartFile attach);
	public boolean foodtruckDelete(int no);
	public List<Foodtruck> foodtruckSearch(String type, String string);
	public boolean foodtruckLocationRegister(int no, double latitude, double longitude);
}

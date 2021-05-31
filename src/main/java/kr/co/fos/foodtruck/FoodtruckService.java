package kr.co.fos.foodtruck;

import java.util.List;

import kr.co.fos.member.Member;

public interface FoodtruckService {
	public boolean foodtruckRegister(Member member);
	public List<Foodtruck> foodtruckListInquiry(Foodtruck foodtruck);
	public Foodtruck foodtruckDetailInquiry(int no);
	public boolean foodtruckUpdate(Foodtruck foodtruck);
	public boolean foodtruckDelete(Foodtruck foodtruck);
	public boolean foodtruckLocationRegister(Foodtruck foodtruck);
}

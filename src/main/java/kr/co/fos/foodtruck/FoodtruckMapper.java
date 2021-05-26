package kr.co.fos.foodtruck;

import java.util.List;

public interface FoodtruckMapper {
    public int count(Foodtruck foodtruck) throws Exception;
    public List<Foodtruck> list(Foodtruck foodtruck) throws Exception;
    public Foodtruck select(Foodtruck foodtruck) throws Exception;
    public void insert(Foodtruck foodtruck) throws Exception;
    public void update(Foodtruck foodtruck) throws Exception;
    public void delete(Foodtruck foodtruck) throws Exception;
}
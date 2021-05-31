package kr.co.fos.foodtruck;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface FoodtruckMapper {
    public int count(Foodtruck foodtruck) throws Exception;
    public List<Foodtruck> list(Foodtruck foodtruck) throws Exception;
    public Foodtruck select(Foodtruck foodtruck) throws Exception;
    public List<Foodtruck> listLocation(Foodtruck foodtruck) throws Exception;
    public boolean insert(Foodtruck foodtruck) throws Exception;
    public boolean update(Foodtruck foodtruck) throws Exception;
    public boolean delete(Foodtruck foodtruck) throws Exception;
}
package kr.co.fos.review;

import java.util.List;

public interface ReviewMapper {
    public int count(Review review) throws Exception;
    public List<Review> list(Review review) throws Exception;
    public Review select(Review review) throws Exception;
    public void insert(Review review) throws Exception;
    public void update(Review review) throws Exception;
    public void delete(Review review) throws Exception;
}
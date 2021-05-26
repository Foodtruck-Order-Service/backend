package kr.co.fos.photo;

import java.util.List;

public interface PhotoMapper {
    public int count(Photo photo) throws Exception;
    public List<Photo> list(Photo photo) throws Exception;
    public Photo select(Photo photo) throws Exception;
    public void insert(Photo photo) throws Exception;
    public void update(Photo photo) throws Exception;
    public void delete(Photo photo) throws Exception;
}
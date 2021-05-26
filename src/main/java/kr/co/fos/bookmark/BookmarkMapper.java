package kr.co.fos.bookmark;

import java.util.List;

public interface BookmarkMapper {
    public int count(Bookmark bookmark) throws Exception;
    public List<Bookmark> list(Bookmark bookmark) throws Exception;
    public Bookmark select(Bookmark bookmark) throws Exception;
    public void insert(Bookmark bookmark) throws Exception;
    public void update(Bookmark bookmark) throws Exception;
    public void delete(Bookmark bookmark) throws Exception;
}
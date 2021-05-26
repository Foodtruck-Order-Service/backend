package kr.co.fos.bookmark;

import java.sql.Date;
import java.io.Serializable;

public class Bookmark implements Serializable {
    private String no;
    private String memberNo;
    private String foodtruckNo;

    private int itemStart;
    private int itemSizePerPage;

    public Bookmark() {
    }

    public Bookmark(String no, String memberNo, String foodtruckNo, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.memberNo = memberNo;
        this.foodtruckNo = foodtruckNo;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberNo() {
        return this.memberNo;
    }

    public void setFoodtruckNo(String foodtruckNo) {
        this.foodtruckNo = foodtruckNo;
    }

    public String getFoodtruckNo() {
        return this.foodtruckNo;
    }

    public void setItemStart(int itemStart) {
        this.itemStart = itemStart;
    }

    public int getItemStart() {
        return this.itemStart;
    }

    public void setItemSizePerPage(int itemSizePerPage) {
        this.itemSizePerPage = itemSizePerPage;
    }

    public int getItemSizePerPage() {
        return this.itemSizePerPage;
    }
}
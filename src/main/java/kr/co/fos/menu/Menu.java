package kr.co.fos.menu;

import java.sql.Date;
import java.io.Serializable;

public class Menu implements Serializable {
    private String no;
    private String foodtruckNo;
    private String name;
    private String amount;
    private String cookingTime;
    private String content;

    private int itemStart;
    private int itemSizePerPage;

    public Menu() {
    }

    public Menu(String no, String foodtruckNo, String name, String amount, String cookingTime, String content, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.foodtruckNo = foodtruckNo;
        this.name = name;
        this.amount = amount;
        this.cookingTime = cookingTime;
        this.content = content;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setFoodtruckNo(String foodtruckNo) {
        this.foodtruckNo = foodtruckNo;
    }

    public String getFoodtruckNo() {
        return this.foodtruckNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getCookingTime() {
        return this.cookingTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
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
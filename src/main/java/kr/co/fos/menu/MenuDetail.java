package kr.co.fos.menu;

import java.sql.Date;
import java.io.Serializable;

public class MenuDetail implements Serializable {
    private String no;
    private String orderInfoNo;
    private String optionName;
    private String optionValue;
    private String addAmount;

    private int itemStart;
    private int itemSizePerPage;

    public MenuDetail() {
    }

    public MenuDetail(String no, String orderInfoNo, String optionName, String optionValue, String addAmount, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.orderInfoNo = orderInfoNo;
        this.optionName = optionName;
        this.optionValue = optionValue;
        this.addAmount = addAmount;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setOrderInfoNo(String orderInfoNo) {
        this.orderInfoNo = orderInfoNo;
    }

    public String getOrderInfoNo() {
        return this.orderInfoNo;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }

    public void setAddAmount(String addAmount) {
        this.addAmount = addAmount;
    }

    public String getAddAmount() {
        return this.addAmount;
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
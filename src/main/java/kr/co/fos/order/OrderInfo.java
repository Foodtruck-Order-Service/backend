package kr.co.fos.order;

import java.sql.Date;
import java.io.Serializable;

public class OrderInfo implements Serializable {
    private String no;
    private String orderNo;
    private String menuName;
    private String count;
    private String amount;

    private int itemStart;
    private int itemSizePerPage;

    public OrderInfo() {
    }

    public OrderInfo(String no, String orderNo, String menuName, String count, String amount, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.orderNo = orderNo;
        this.menuName = menuName;
        this.count = count;
        this.amount = amount;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCount() {
        return this.count;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.amount;
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
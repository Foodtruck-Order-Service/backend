package kr.co.fos.order;

import java.sql.Date;
import java.io.Serializable;

public class Order implements Serializable {
    private String no;
    private String memberNo;
    private String foodtruckNo;
    private String receptionNo;
    private Date orderTime;
    private String totalAmount;
    private String paymentType;
    private String status;
    private int lat;
    private int lng;

    private int itemStart;
    private int itemSizePerPage;

    public Order() {
    }

    public Order(String no, String memberNo, String foodtruckNo, String receptionNo, Date orderTime, String totalAmount, String paymentType, String status, int lat, int lng, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.memberNo = memberNo;
        this.foodtruckNo = foodtruckNo;
        this.receptionNo = receptionNo;
        this.orderTime = orderTime;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
        this.status = status;
        this.lat = lat;
        this.lng = lng;

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

    public void setReceptionNo(String receptionNo) {
        this.receptionNo = receptionNo;
    }

    public String getReceptionNo() {
        return this.receptionNo;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() {
        return this.orderTime;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLat() {
        return this.lat;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public int getLng() {
        return this.lng;
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
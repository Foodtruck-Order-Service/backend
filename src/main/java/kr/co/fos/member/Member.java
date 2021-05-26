package kr.co.fos.member;

import java.sql.Date;
import java.io.Serializable;

public class Member implements Serializable {
    private String no;
    private String id;
    private String password;
    private String rrn;
    private String name;
    private String email;
    private String phone;
    private String type;

    private int itemStart;
    private int itemSizePerPage;

    public Member() {
    }

    public Member(String no, String id, String password, String rrn, String name, String email, String phone, String type, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.id = id;
        this.password = password;
        this.rrn = rrn;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.type = type;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getRrn() {
        return this.rrn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
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
package kr.co.fos.menu;

import java.sql.Date;
import java.io.Serializable;

public class Option implements Serializable {
    private String no;
    private String menuNo;
    private String optionName;

    private int itemStart;
    private int itemSizePerPage;

    public Option() {
    }

    public Option(String no, String menuNo, String optionName, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.menuNo = menuNo;
        this.optionName = optionName;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getMenuNo() {
        return this.menuNo;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionName() {
        return this.optionName;
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
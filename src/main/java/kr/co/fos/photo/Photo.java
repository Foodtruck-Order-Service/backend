package kr.co.fos.photo;

import java.sql.Date;
import java.io.Serializable;

public class Photo implements Serializable {
    private String no;
    private String typeNumber;
    private String physicalName;
    private String logicalName;
    private String type;
    private String path;

    private int itemStart;
    private int itemSizePerPage;

    public Photo() {
    }

    public Photo(String no, String typeNumber, String physicalName, String logicalName, String type, String path, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.typeNumber = typeNumber;
        this.physicalName = physicalName;
        this.logicalName = logicalName;
        this.type = type;
        this.path = path;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getTypeNumber() {
        return this.typeNumber;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public String getPhysicalName() {
        return this.physicalName;
    }

    public void setLogicalName(String logicalName) {
        this.logicalName = logicalName;
    }

    public String getLogicalName() {
        return this.logicalName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
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
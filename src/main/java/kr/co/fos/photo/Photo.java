package kr.co.fos.photo;

import java.io.Serializable;

public class Photo implements Serializable {
    private int no;
    private String typeNumber;
    private String physicalName;
    private String logicalName;
    private String type;
    private String path;

    public Photo() {
    }

    public Photo(int no, String typeNumber, String physicalName, String logicalName, String type, String path) {
        this.no = no;
        this.typeNumber = typeNumber;
        this.physicalName = physicalName;
        this.logicalName = logicalName;
        this.type = type;
        this.path = path;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
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
}
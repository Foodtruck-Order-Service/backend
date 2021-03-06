package kr.co.fos.menu;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private int no;
    private int foodtruckNo;
    private String name;
    private String amount;
    private String cookingTime;
    private String content;
    private String logical;
    private String physical;

    private List<Option> options;
    
    public Menu() {
    }

    public Menu(int no, int foodtruckNo, String name, String amount, String cookingTime, String content, String logical, String physical, List<Option> options) {
        this.no = no;
        this.foodtruckNo = foodtruckNo;
        this.name = name;
        this.amount = amount;
        this.cookingTime = cookingTime;
        this.content = content;
        this.options = options;
        this.logical = logical;
        this.physical = physical;
        this.options = options;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return this.no;
    }

    public void setFoodtruckNo(int foodtruckNo) {
        this.foodtruckNo = foodtruckNo;
    }

    public int getFoodtruckNo() {
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

	public String getLogical() {
		return logical;
	}

	public void setLogical(String logical) {
		this.logical = logical;
	}

	public String getPhysical() {
		return physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}
}
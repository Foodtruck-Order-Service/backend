package kr.co.fos.admin;

import java.io.Serializable;

public class AllMemberInfo implements Serializable{
	private String id;
	private String name;
	private String type;
	private String brn;
	private String foodtruckName;
	private String approval;
	
	public AllMemberInfo() {
		
	}
	
	@Override
	public String toString() {
		return "AllMemberInfo [id=" + id + ", name=" + name + ", type=" + type + ", brn=" + brn + ", foodtruckName="
				+ foodtruckName + ", approval=" + approval + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrn() {
		return brn;
	}

	public void setBrn(String brn) {
		this.brn = brn;
	}

	public String getFoodtruckName() {
		return foodtruckName;
	}

	public void setFoodtruckName(String foodtruckName) {
		this.foodtruckName = foodtruckName;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}
	
	

}

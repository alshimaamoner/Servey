package com.example.hp.servey.Api.Model;

import com.google.gson.annotations.SerializedName;

public class Data{


	@SerializedName("full_name")
	private String fullName;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("user_name")
	private String userName;
	@SerializedName("password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@SerializedName("vendor_id")
	private String vendorId;

	@SerializedName("description")
	private String description;

	@SerializedName("active")
	private String active;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setVendorId(String vendorId){
		this.vendorId = vendorId;
	}

	public String getVendorId(){
		return vendorId;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setActive(String active){
		this.active = active;
	}

	public String getActive(){
		return active;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"full_name = '" + fullName + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",user_name = '" + userName + '\'' + 
			",vendor_id = '" + vendorId + '\'' + 
			",description = '" + description + '\'' + 
			",active = '" + active + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
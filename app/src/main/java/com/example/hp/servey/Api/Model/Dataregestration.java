package com.example.hp.servey.Api.Model;


import com.google.gson.annotations.SerializedName;

public class Dataregestration {

	@SerializedName("gender")
	private String gender;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("moderator_id")
	private int moderatorId;

	@SerializedName("name")
	private String name;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setModeratorId(int moderatorId){
		this.moderatorId = moderatorId;
	}

	public int getModeratorId(){
		return moderatorId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
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
			"Dataregestration{" +
			"gender = '" + gender + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",moderator_id = '" + moderatorId + '\'' + 
			",name = '" + name + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}


}
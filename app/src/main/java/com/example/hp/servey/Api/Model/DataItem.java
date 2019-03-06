package com.example.hp.servey.Api.Model;


import com.google.gson.annotations.SerializedName;


public class DataItem{

	@SerializedName("image")
	private Object image;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("vendor_id")
	private String vendorId;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("youtube_url")
	private String youtubeUrl;

	public void setImage(Object image){
		this.image = image;
	}

	public Object getImage(){
		return image;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setVendorId(String vendorId){
		this.vendorId = vendorId;
	}

	public String getVendorId(){
		return vendorId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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

	public void setYoutubeUrl(String youtubeUrl){
		this.youtubeUrl = youtubeUrl;
	}

	public String getYoutubeUrl(){
		return youtubeUrl;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"image = '" + image + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",vendor_id = '" + vendorId + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",youtube_url = '" + youtubeUrl + '\'' + 
			"}";
		}
}
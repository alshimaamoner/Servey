package com.example.hp.servey.Api.Model;

import com.google.gson.annotations.SerializedName;

public class RegistrationResponse{

	@SerializedName("data")
	private Dataregestration data;

	@SerializedName("status")
	private String status;

	public void setData(Dataregestration data){
		this.data = data;
	}

	public Dataregestration getData(){
		return data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"RegistrationResponse{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
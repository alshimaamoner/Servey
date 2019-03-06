package com.example.hp.servey.Api.Model;

import java.util.List;

public class QuestionResponse{
	private List<QustionItem> data;
	private String status;

	public void setData(List<QustionItem> data){
		this.data = data;
	}

	public List<QustionItem> getData(){
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
			"QuestionResponse{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
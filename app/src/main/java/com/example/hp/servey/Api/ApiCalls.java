package com.example.hp.servey.Api;

import com.example.hp.servey.Api.Model.EventResponse;
import com.example.hp.servey.Api.Model.LoginResponse;
import com.example.hp.servey.Api.Model.QuestionResponse;
import com.example.hp.servey.Api.Model.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiCalls {
    @POST("login")
Call<LoginResponse> getData(@Query("user_name") String user_name , @Query("password") String password);
  @POST("entities")
    Call<EventResponse> getEvent(@Query("moderator_id") int moderator_id ,@Query("password") String password );
  @POST("visitors/create")
  Call<RegistrationResponse> getRegestration(@Query("moderator_id") int moderator_id ,@Query("password") String password , @Query("visitor_name") String visitor_name,
                                       @Query("visitor_mobile") String visitor_mobile,@Query("entity_id") String entity_id ,@Query("visitor_gender") String visitor_gender );
    @POST("survey/questions")
    Call<QuestionResponse> getQuestions(@Query("moderator_id") int moderator_id,
                                    @Query("password") String password,@Query("entity_id") String entity_id );
}

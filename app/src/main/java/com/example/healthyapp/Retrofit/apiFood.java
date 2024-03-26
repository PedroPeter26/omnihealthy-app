package com.example.healthyapp.Retrofit;

import com.example.healthyapp.Response.FoodResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiFood {

    @GET("complemento")
    Call<FoodResponse> getFood();
}

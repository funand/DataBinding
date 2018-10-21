package com.example.prince.databindingass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UFCInterface {
    final String BASE_URL = "http://ufc-data-api.ufc.com/api/v3/iphone/";
    @GET("news/") Call<List<UFC>> getData();
}

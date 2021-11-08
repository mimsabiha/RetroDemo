package com.example.retrodemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OurRetrofit {
    @GET("eayx")

        Call<List<OurDataSet>> getDataSet();

}

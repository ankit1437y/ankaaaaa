package com.example.retrofitdemo1.rest;
import com.example.retrofitdemo1.model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
//    @GET("users")
//    Call<UserModel> getTopRatedMovies();
    @GET("/users")
    Call<List<UserModel>> getAllPhotos();

//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
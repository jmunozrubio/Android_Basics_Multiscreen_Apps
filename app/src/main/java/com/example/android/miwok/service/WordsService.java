package com.example.android.miwok.service;

import com.example.android.miwok.data.Category;
import com.example.android.miwok.data.Word;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WordsService {

    @GET("categories")
    Call<List<Category>> getCategories();
    @GET("categories/family")
    Call<List<Word>> getFamily();

    @GET("categories/colors")
    Call<List<Word>> getColors();

    @GET("categories/numbers")
    Call<List<Word>> getNumbers();

    @GET("categories/phrases")
    Call<List<Word>> getPhrases();
}

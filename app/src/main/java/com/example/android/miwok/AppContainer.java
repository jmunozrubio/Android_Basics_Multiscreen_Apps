package com.example.android.miwok;

import android.content.Context;

import com.example.android.miwok.repositories.WordsRepository;
import com.example.android.miwok.repositories.datasource.WordsLocalDataSourceImpl;
import com.example.android.miwok.repositories.datasource.WordsRemoteDataSourceImpl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppContainer {

    private final Retrofit backendApiService = new Retrofit.Builder()
            .baseUrl("http://172.16.189.205:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private WordsRemoteDataSourceImpl wordsRemoteDataSource =
            new WordsRemoteDataSourceImpl(backendApiService);
    private WordsLocalDataSourceImpl wordsLocalDataSource = new WordsLocalDataSourceImpl();

    public WordsRepository wordsRepository =
            new WordsRepository(wordsLocalDataSource, wordsRemoteDataSource);

}

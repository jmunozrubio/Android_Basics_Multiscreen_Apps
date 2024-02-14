package com.example.android.miwok.repositories.datasource;

import com.example.android.miwok.Refreshable;
import com.example.android.miwok.data.Word;
import com.example.android.miwok.service.WordsService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class WordsRemoteDataSourceImpl implements WordsDataSource {

    private final WordsService wordsService;

    public WordsRemoteDataSourceImpl(Retrofit retrofit) {
        this.wordsService = retrofit.create(WordsService.class);
    }


    @Override
    public void getCategories() {
        return;
    }

    private void callService(Call<List<Word>> call, Refreshable refreshable) {
        call.enqueue(new Callback<List<Word>>() {
            @Override
            public void onResponse(Call<List<Word>> call, Response<List<Word>> response) {
                refreshable.refreshResults(response.body());
            }

            @Override
            public void onFailure(Call<List<Word>> call, Throwable t) {
                throw new RuntimeException(t);
            }
        });
    }

    @Override
    public void getFamily(Refreshable refreshable) {
        callService(wordsService.getFamily(), refreshable);
    }

    @Override
    public void getColors(Refreshable refreshable) {
        callService(wordsService.getColors(), refreshable);
    }

    @Override
    public void getNumbers(Refreshable refreshable) {
        callService(wordsService.getNumbers(), refreshable);
    }

    @Override
    public void getPhrases(Refreshable refreshable) {
        callService(wordsService.getPhrases(), refreshable);
    }
}

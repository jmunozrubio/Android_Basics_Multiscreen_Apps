package com.example.android.miwok.repositories;

import com.example.android.miwok.Refreshable;
import com.example.android.miwok.data.Word;
import com.example.android.miwok.repositories.datasource.WordsDataSource;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class WordsRepository {

    private final WordsDataSource[] wordsDataSource;

    public WordsRepository(WordsDataSource... wordsDataSource) {
        this.wordsDataSource = wordsDataSource;
    }

    public void getFamily(Refreshable refreshable) {
        for (WordsDataSource dataSource: wordsDataSource) {
            dataSource.getFamily(refreshable);
        }
    }

    public void getColors(Refreshable refreshable) {
        for (WordsDataSource dataSource: wordsDataSource) {
            dataSource.getColors(refreshable);
        }
    }

    public void getPhrases(Refreshable refreshable) {
        for (WordsDataSource dataSource: wordsDataSource) {
            dataSource.getPhrases(refreshable);
        }
    }

    public void getNumbers(Refreshable refreshable) {
        for (WordsDataSource dataSource: wordsDataSource) {
            dataSource.getNumbers(refreshable);
        }
    }
}

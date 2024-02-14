package com.example.android.miwok.repositories.datasource;

import com.example.android.miwok.Refreshable;
import com.example.android.miwok.data.Category;
import com.example.android.miwok.data.Word;

import java.util.List;

/**
 *
 */
public interface WordsDataSource {

    void getCategories();

    void getFamily(Refreshable refreshable);

    void getColors(Refreshable refreshable);

    void getNumbers(Refreshable refreshable);

    void getPhrases(Refreshable refreshable);
}

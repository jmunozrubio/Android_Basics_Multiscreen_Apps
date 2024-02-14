package com.example.android.miwok.repositories.datasource;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

import com.example.android.miwok.Refreshable;
import com.example.android.miwok.data.Word;
import com.example.android.miwok.repositories.WordsRepository;
import com.example.android.miwok.service.WordsService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class WordsRepositoryTest {

    private WordsRepository wordsRepository;

    @Mock
    private Retrofit retrofitMock;

    @Mock
    private Refreshable refreshable;

    @Mock
    private WordsService wordsService;

    @Mock
    private Call<List<Word>> restServiceCallMock;

    @BeforeEach
    void setUp() {
        given(retrofitMock.create(WordsService.class)).willReturn(wordsService);
        wordsRepository = new WordsRepository(new WordsRemoteDataSourceImpl(retrofitMock));
    }

    @Test
    void whenGetNumbersRestServiceIsCalled() {
        given(wordsService.getNumbers()).willReturn(restServiceCallMock);
        wordsRepository.getNumbers(refreshable);
        then(restServiceCallMock).should().enqueue(any());
    }

    @Test
    void whenGetColorsRestServiceIsCalled() {
        given(wordsService.getColors()).willReturn(restServiceCallMock);
        wordsRepository.getColors(refreshable);
        then(restServiceCallMock).should().enqueue(any());
    }

    @Test
    void whenGetPhrasesRestServiceIsCalled() {
        given(wordsService.getPhrases()).willReturn(restServiceCallMock);
        wordsRepository.getPhrases(refreshable);
        then(restServiceCallMock).should().enqueue(any());
    }
    @Test
    void whenGetFamilyRestServiceIsCalled() {
        given(wordsService.getFamily()).willReturn(restServiceCallMock);
        wordsRepository.getFamily(refreshable);
        then(restServiceCallMock).should().enqueue(any());
    }

}

package com.example.android.miwok;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static com.example.android.miwok.utils.ViewMatchers.withIndex;
import static org.junit.Assert.assertTrue;

import android.content.Context;
import android.media.AudioManager;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NumbersFragmentAndroidTest {

    ActivityScenario<MainActivity> activityScenario;

    AudioManager audioManager;

    @Before
    public void createFragment() {
        activityScenario = ActivityScenario.launch(MainActivity.class);
        activityScenario.onActivity(a ->
                audioManager = (AudioManager) a.getSystemService(Context.AUDIO_SERVICE)
        );
    }

    @Test
    public void whenClickOnAWordThenSoundIsPlayed() throws Exception{
        onView(withIndex(withId(R.id.miwok_text_view), 0)).perform(click());
        assertTrue(audioManager.isMusicActive());
    }

}

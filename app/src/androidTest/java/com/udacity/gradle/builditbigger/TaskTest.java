package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.tasks.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;

/**
 * Project : FinalProject
 * Created by Sanat Dutta on 19-Oct-16.
 * http://www.satandigital.com/
 */
@RunWith(AndroidJUnit4.class)
public class TaskTest {
    @Test
    public void verifyNonEmptyStrings() {
        new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onTaskFinish(String joke) {
                Log.d("JOKE_TEST", joke);
                assertFalse("EmptyString", joke.equals(""));
            }
        }).execute();
    }
}

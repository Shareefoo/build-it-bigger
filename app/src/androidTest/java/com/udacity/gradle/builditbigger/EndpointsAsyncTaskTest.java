package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.udacity.jokesprovider.JokesProvider;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest extends AndroidTestCase implements EndpointsAsyncTask.AsyncResponse {


    public void testTaskResult() throws InterruptedException {
        final CountDownLatch signal = new CountDownLatch(1);

        new EndpointsAsyncTask(getContext(), signal, this).execute();

        signal.await();// wait for callback
    }

    @Override
    public void processFinish(String output) {
        // test response data
        assertEquals("Why are iPhone chargers not called Apple Juice?!", output);
        assertTrue("Joke", true);
    }

}
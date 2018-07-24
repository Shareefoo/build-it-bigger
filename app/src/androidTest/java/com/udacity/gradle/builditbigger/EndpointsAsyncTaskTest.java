package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest extends AndroidTestCase implements EndpointsAsyncTask.AsyncResponse {

    @Test
    public void testTaskResult() {
        new EndpointsAsyncTask(getContext(), this).execute();
    }

    @Override
    public void processFinish(String output) {
        assertTrue(!output.isEmpty());
    }

}
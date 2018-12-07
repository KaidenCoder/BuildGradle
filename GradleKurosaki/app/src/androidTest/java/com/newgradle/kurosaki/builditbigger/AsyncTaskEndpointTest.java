package com.newgradle.kurosaki.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class AsyncTaskEndpointTest extends ApplicationTestCase<Application> {

    public AsyncTaskEndpointTest() {
            super(Application.class);
        }

        public void testGetJokeTask()  {
           try {
               AsyncTaskEndpoint testJoke = new AsyncTaskEndpoint(new AsyncTaskEndpoint.Callback() {
                   @Override
                   public void onFinished(String result) {

                   }
               });
               testJoke.execute();
               String joke = testJoke.get(30, TimeUnit.SECONDS);
               assertThat(joke, notNullValue());
               assertTrue(joke.length() > 0);
           } catch (Exception e) {
               fail("Operation timed out");
           }

        }
}

package com.wasperstore.authenticationusingphp.ClientApi;

import com.wasperstore.authenticationusingphp.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Habeex on 11/9/2017.
 */

public class ClientServices {
    public static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
    retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }
        return retrofit;
}




}

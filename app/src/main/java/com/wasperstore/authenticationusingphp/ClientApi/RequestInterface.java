package com.wasperstore.authenticationusingphp.ClientApi;



import com.wasperstore.authenticationusingphp.models.ServerRequest;
import com.wasperstore.authenticationusingphp.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("php_authentication/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}

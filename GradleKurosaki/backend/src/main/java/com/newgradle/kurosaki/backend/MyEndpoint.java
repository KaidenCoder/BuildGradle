package com.newgradle.kurosaki.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.newgradle.kurosaki.javalib.JavaJoke;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.kurosaki.newgradle.com",
                ownerName = "backend.kurosaki.newgradle.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public MyBean getJoke(){
        MyBean response = new MyBean();
        JavaJoke joker = new JavaJoke();
        response.setData(joker.getJoke());
        return response;
    }

}
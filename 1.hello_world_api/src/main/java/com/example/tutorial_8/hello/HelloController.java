package com.example.tutorial_8.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                     //it is used to make the HelloController class a controller(RestController). By this, you can map to a URL request.
public class HelloController {
                                    //method. This method will be executed when user makes a request
    @RequestMapping("/hello")       //when "/hello" URL is requested this method will be executed. This mapping is only for a "GET request"
    public String sayHi(){
        return "hi";
    }
}

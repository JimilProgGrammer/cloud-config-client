package com.springboot.cloudconfigappclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${user.role}")
    private String role;

    @RequestMapping(value = "/profile/{name}", method = RequestMethod.GET)
    public String getActiveProfile(@PathVariable String name) {
        return "Hello " + name + "! active profile is: " + role;
    }

}

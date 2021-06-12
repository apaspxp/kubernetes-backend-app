package com.pxp.kubernetesbackendapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    @RequestMapping(value = "greet", method = RequestMethod.GET)
    public String greet(){
        return "Response from the backend application.";
    }
}

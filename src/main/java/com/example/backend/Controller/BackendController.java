package com.example.backend.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    @RequestMapping(value = "backend", method= RequestMethod.GET)
    public String backend() {
        return "Data from the backend application";
    }

}

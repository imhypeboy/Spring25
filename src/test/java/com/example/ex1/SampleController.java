package com.example.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {

    @GetMapping("/hello")
    public String [] hello() {
        return new String [] {"hello", "world"};
    }
}

package com.ming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class HiController {

    @GetMapping("/hi")
    public String hi(String name) {
        return "hi," + name;
    }
}

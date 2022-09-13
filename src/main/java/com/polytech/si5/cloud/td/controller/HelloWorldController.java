package com.polytech.si5.cloud.td.controller;

import com.polytech.si5.cloud.td.component.ClickManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    private final ClickManager clickManager;

    @Autowired
    public HelloWorldController(ClickManager clickManager) {
        this.clickManager = clickManager;
    }

    @GetMapping("/hello")
    public String greeting() {

        return "hello world for the " + clickManager.addClick() + " time";
    }
}

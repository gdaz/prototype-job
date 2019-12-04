package com.prototype.job.prototypejob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/info")
    public String appInfo() {
        return "Job";
    }
}

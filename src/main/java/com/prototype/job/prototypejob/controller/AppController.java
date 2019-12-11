package com.prototype.job.prototypejob.controller;

import com.prototype.job.prototypejob.model.CompanyModel;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/info")
    public String appInfo() {
        return "Job";
    }

    @GetMapping("/message/{msg}")
    public String messagePathVariable(@PathVariable(name = "msg") String msg) {
        return "messagePathVariable " + msg;
    }

    @GetMapping(value = "/message")
    public String messagePathParam(@RequestParam(value = "name") String name) {
        return "messagePathParam " + name;
    }

    @PostMapping(value = "/job-detail", produces = MediaType.APPLICATION_JSON_VALUE)
    public String messageRequestBody(@RequestBody CompanyModel companyModel) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", true);
        return jsonObject.toString();
    }
}

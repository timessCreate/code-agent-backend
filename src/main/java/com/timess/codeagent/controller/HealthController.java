package com.timess.codeagent.controller;


import com.timess.codeagent.exception.BaseResponse;
import com.timess.codeagent.exception.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    // This method is mapped to the root URL ("/") and returns a string "ok" when accessed
    @GetMapping("/ok")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}



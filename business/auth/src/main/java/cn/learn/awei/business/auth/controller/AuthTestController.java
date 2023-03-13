package cn.learn.awei.business.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthTestController {

    @GetMapping("/test/test")
    public String authTest(String param) {
        System.out.println(param);
        return param;
    }
}

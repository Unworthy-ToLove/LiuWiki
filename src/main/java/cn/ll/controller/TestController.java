package cn.ll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuli
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }


}

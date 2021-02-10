package com.jpa.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //1 JSON을 반환하는 컨트롤러를 만들어줌
public class HelloController {
    @GetMapping("/hello") //2 HTTP 메소드인 Get의 요청을 받을수 있는 API르 ㄹ만들어줌
    public String hello(){
        return "hello";
    }
}

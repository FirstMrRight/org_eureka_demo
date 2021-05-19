package org.javaboy.demo;

import org.javaboy.commons.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;

@Component
@RequestMapping("/javaboy")//防止请求地址重复
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

}

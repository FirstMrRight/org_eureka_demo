package org.javaboy.demo;

import org.javaboy.commons.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author Liutx
 * @date 2021/5/19 22:26
 * @Description
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello() throws UnsupportedEncodingException {
        String s = helloService.hello();
        System.out.println(s);
        User user = new User();
        user.setId(1);
        user.setUsername("javaboy");
        user.setPassword("123");
        return helloService.hello();
    }
}

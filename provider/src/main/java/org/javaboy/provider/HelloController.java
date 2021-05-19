package org.javaboy.provider;

import org.javaboy.provider.IService.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Liutx
 * @date 2021/5/19 22:16
 * @Description
 */
@RestController
public class HelloController implements IUserService {
    @Value("${server.port}")
    Integer port;
    @Override

    public String hello() {
        String s = "hello javaboy:" + port;
        System.out.println(new Date());
        return s;
    }
}

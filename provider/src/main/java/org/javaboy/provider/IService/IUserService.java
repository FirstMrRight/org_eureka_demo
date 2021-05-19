package org.javaboy.provider.IService;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Liutx
 * @date 2021/5/19 22:14
 * @Description
 */
public interface IUserService {
    @GetMapping("/hello")
    String hello();//这里的方法名无所谓，随意取
}

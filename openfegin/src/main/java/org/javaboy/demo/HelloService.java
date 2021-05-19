package org.javaboy.demo;

import org.javaboy.provider.IService.IUserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provider")
public interface HelloService extends IUserService {
}

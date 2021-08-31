package cn.com.dubbo.demo.consumer.controller;

import cn.com.dubbo.demo.provider.dto.UserDto;
import cn.com.dubbo.demo.provider.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.consumer.controller
 * @description:
 * @create 2021-08-30 14:14
 */
@RestController
public class UserController {
    @DubboReference(version = "0.0.1", timeout = 6000)
    private UserService userService;

    @GetMapping(value = "/user/{userId}")
    public UserDto getUser(@PathVariable("userId") Integer userId) {
       return userService.getUser(userId);
    }
}

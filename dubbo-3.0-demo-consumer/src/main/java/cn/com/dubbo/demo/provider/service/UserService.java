package cn.com.dubbo.demo.provider.service;

import cn.com.dubbo.demo.provider.dto.UserDto;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.service
 * @description:
 * @create 2021-08-30 14:28
 */
public interface UserService {
    UserDto getUser(Integer id);
}

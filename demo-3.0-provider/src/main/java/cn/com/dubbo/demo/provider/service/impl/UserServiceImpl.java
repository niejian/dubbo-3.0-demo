package cn.com.dubbo.demo.provider.service.impl;

import cn.com.dubbo.demo.provider.dto.UserDto;
import cn.com.dubbo.demo.provider.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.service.impl
 * @description:
 * @create 2021-08-30 09:18
 */
@DubboService(interfaceClass = UserService.class, version = "0.0.1")
public class UserServiceImpl implements UserService {
    private List<UserDto> userDtoList;
    @PostConstruct
    public void init() {
        userDtoList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            boolean sex = 1 % 2 == 0 ? true : false;
            UserDto userDto = new UserDto(i + 10, sex, "abc", "a" + i, i);
            userDtoList.add(userDto);
        }
    }
    @Override
    public UserDto getUser(Integer id) {
        return userDtoList.stream().filter(userDto -> userDto.getId() == id).findFirst().get();
    }
}

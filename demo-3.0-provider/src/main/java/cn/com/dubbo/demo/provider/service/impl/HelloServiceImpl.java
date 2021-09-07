package cn.com.dubbo.demo.provider.service.impl;

import cn.com.dubbo.demo.provider.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.service.impl
 * @description:
 * @create 2021-08-30 11:47
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello-->" + name;
    }
}

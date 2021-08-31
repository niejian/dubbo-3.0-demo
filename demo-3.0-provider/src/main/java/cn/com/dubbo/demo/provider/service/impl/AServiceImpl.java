package cn.com.dubbo.demo.provider.service.impl;

import cn.com.dubbo.demo.provider.service.AService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.service.impl
 * @description:
 * @create 2021-08-30 14:04
 */
//@DubboService
public class AServiceImpl implements AService {
    @Override
    public String A() {
        return "A";
    }

    @Override
    public String B() {
        return "B";
    }
}

package cn.com.dubbo.demo.provider.service;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.service
 * @description:
 * @create 2021-08-31 11:30
 */
public interface MyEmpService {
    Object getEmpInfo(String empCode) throws Exception;
}

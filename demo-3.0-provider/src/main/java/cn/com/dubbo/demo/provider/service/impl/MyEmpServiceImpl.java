package cn.com.dubbo.demo.provider.service.impl;

import cn.com.bluemoon.service.common.service.EmpService;
import cn.com.dubbo.demo.provider.service.MyEmpService;
import net.sf.json.JSONObject;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Map;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.service.impl
 * @description:
 * @create 2021-08-31 11:27
 */
@DubboService
public class MyEmpServiceImpl implements MyEmpService {
    @DubboReference
    private EmpService empService;

    @Override
    public Object getEmpInfo(String empCode) throws Exception {
        JSONObject params = new JSONObject();
        params.put("staffNum", empCode);
        Map<String, Object> result = empService.getEmpDetailInfo(params);
        if( (Boolean)result.get("isSuccess") == true ) {
            return result.get("data");
        }
        return null;
    }
}

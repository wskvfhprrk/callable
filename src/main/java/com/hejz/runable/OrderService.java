package com.hejz.runable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: hejz
 * @Description:
 * @Date: 2019/10/16 8:20
 */
@Service
@Slf4j
public class OrderService {

    public Result getOrder() {
        Result result = new Result();
        result.setMsg("ok");
        result.setRet(200);
        log.info("OrderService逻辑处理完成");
        return result;
    }
}

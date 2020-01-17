package com.hejz.runable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * @author: hejz
 * @Description: 使用callable异步线程调用方法
 * @Date: 2019/10/16 8:10
 */
@RestController
@Slf4j
public class Controller {

    @Autowired
    private OrderService orderService;
    @GetMapping("order")
    public Callable<Result> getOrder() {
        log.info("主线程开始");
        Callable<Result> result= () -> {
            log.info("副线程开始");
            Result order = orderService.getOrder();
            log.info("副线程结束");
            return order;
        };

        log.info("主线程结束");
        return result;
    }
}

package consumer.controller;

import consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudAlibaba
 * @description:
 * @author: yyh
 * @create: 2020-02-19 21:52
 **/
@RestController
public class ConsumerFeignController {
    @Autowired
    EchoService echoService;

    @GetMapping(value = "/feign/echo/{num}")
    public String echo(@PathVariable Integer num){
        return echoService.Echo(num);
    }
}

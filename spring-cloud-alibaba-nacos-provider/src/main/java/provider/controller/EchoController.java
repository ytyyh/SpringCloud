package provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudAlibaba
 * @description: 测试用
 * @author: yyh
 * @create: 2020-02-19 20:20
 **/
@RestController
public class EchoController {
    @GetMapping(value = "/echo/{num}")
    public String echo(@PathVariable Integer num){
        return num.toString();
    }

}



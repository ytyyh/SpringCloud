package consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.security.auth.login.Configuration;

/**
 * @program: SpringCloudAlibaba
 * @description:
 * @author: yyh
 * @create: 2020-02-19 21:29
 **/
@RestController
public class ConsumerRTController {
    private final RestTemplate restTemplate;

    @Autowired
    public ConsumerRTController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/test/{no}")
    public String test(@PathVariable("no")Integer no){
        return restTemplate.getForObject("http://server-provider/echo/" + no.toString(),String.class);
    }
}

package consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: SpringCloudAlibaba
 * @description:
 * @author: yyh
 * @create: 2020-02-19 21:53
 **/
@FeignClient(name = "server-provider")
public interface EchoService {
    @GetMapping(value = "/echo/{no}")
    public String Echo(@PathVariable("no")Integer no);
}

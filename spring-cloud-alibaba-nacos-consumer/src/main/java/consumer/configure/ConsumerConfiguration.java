package consumer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloudAlibaba
 * @description:
 * @author: yyh
 * @create: 2020-02-19 21:30
 **/
@Configuration
public class ConsumerConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

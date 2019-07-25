package jeeno.example.clientribbon.service.Impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import jeeno.example.clientribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/23 0023 21:45
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    RestTemplate template;

    @Override
    @HystrixCommand(fallbackMethod = "sayhiError")
    public String sayhi() {
        return template.getForObject("http://client/hi",String.class);
    }

    public String sayhiError(){ // the params and return type must be same to sayhi()
        return "sorry, server error!";
    }
}

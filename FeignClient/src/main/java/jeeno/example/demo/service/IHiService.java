package jeeno.example.demo.service;

import jeeno.example.demo.hystrix.IHiServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/24 0024 22:35
 */
@FeignClient(value = "client", fallback = IHiServiceHystrix.class)   // using loading balanced as default
public interface IHiService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiFromEurekaClient();
}

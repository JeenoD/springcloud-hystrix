package jeeno.example.demo.hystrix;

import jeeno.example.demo.service.IHiService;
import org.springframework.stereotype.Component;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/25 0025 21:48
 */
@Component
public class IHiServiceHystrix implements IHiService { // must implement IHiService, and it would make sure fallback's params and return type both same to interface's.
    @Override
    public String hiFromEurekaClient() {
        return "Sorry, server error.(from Hystrix.)";
    }
}

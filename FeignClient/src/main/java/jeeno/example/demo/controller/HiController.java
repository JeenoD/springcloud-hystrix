package jeeno.example.demo.controller;

import jeeno.example.demo.service.IHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/24 0024 22:38
 */
@RestController
public class HiController {

    @Autowired
    IHiService service;

    @GetMapping("/feign/hi")
    public String sayhi(){
        return service.hiFromEurekaClient();
    }
}

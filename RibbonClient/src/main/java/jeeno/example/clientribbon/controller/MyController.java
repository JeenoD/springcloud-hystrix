package jeeno.example.clientribbon.controller;

import jeeno.example.clientribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/23 0023 21:51
 */
@RestController
public class MyController {

    @Autowired
    IHelloService service;

    @GetMapping("/ribbon-hi")
    public String ribbonHi(){
        return service.sayhi();
    }

}

package jeeno.example.client.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/23 0023 21:13
 */
@RestController
public class ClientController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(){
        return "hello world. from client-port:"+port;
    }
}

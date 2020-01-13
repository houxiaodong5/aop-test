package com.hxd.aoptest.controller;

import com.hxd.aoptest.entity.User;
import com.hxd.aoptest.service.UserService;
import com.hxd.mystarter.HelloProperties;
import com.hxd.mystarter.HelloService;
import com.hxd.utils.EsRestClient;
import com.hxd.utils.OSSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    protected Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private  EsRestClient esRestClient;

    @Autowired
    private OSSUtil ossUtil;

    @Autowired
    private HelloService helloService;
    @GetMapping("/login")
    public User login(String number, String password){
        return new User();
    }

    @PostMapping("/phone/login")
    public User loginByPhone(@RequestBody User user){
        System.out.println("1");
        return user;
    }

    @GetMapping("/hello")
    public String sayHello(){
        logger.info(helloService.sayHello("HXD"));
        System.out.println(new HelloProperties().getMsg());
        return helloService.sayHello("HXD");
    }

    @GetMapping("/test")
    public void   ass(){
        System.out.println("1111111111");
        System.out.println(esRestClient.getClientWithCheck());
        System.out.println(esRestClient.getClientNoCheck());
        System.out.println("2222222");


    }
}

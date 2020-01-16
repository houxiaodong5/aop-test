package com.hxd.aoptest.controller;

import com.hxd.aoptest.entity.User;
import com.hxd.aoptest.model.Img;
import com.hxd.aoptest.service.ImgService;
import com.hxd.aoptest.service.ImgServiceImpl;
import com.hxd.aoptest.service.UserService;
import com.hxd.aoptest.service.UserServiceImpl;
import com.hxd.mystarter.HelloProperties;
import com.hxd.mystarter.HelloService;
import com.hxd.utils.EsRestClient;
import com.hxd.utils.OSSUtil;
import com.hxd.utils.StringUtil;
import com.hxd.utils.TimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

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
    private ImgService imgService;

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

    @GetMapping("/image")
    public ResponseEntity<Object> getImage(){
        try {
            List<Img> imgs = imgService.queryImg();
            return new ResponseEntity<>(imgs, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("服务器错误，请稍后重试");
        }
    }

    public static void main(String[] args) {
        /*List<String> objects = new ArrayList<>();

        Test<String> t=TimeUtil::getBeginTimeOfMonth;
        String s = t.fun1();
        System.out.println(s);*/
        TestExtendA a = new TestExtendA();
    }
}

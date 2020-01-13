package com.hxd.aoptest.controller;

import com.alibaba.fastjson.JSON;
import com.hxd.aoptest.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {
    //启用web上下文
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        //使用上下文构建mockMvc
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void hello() throws Exception {
        //得到MvcResult自定义验证
        //执行请求
        User user = new User();
        user.setNumber("123");
        user.setPassword("33434");
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                //.get("/user/login")
                .post("/user/phone/login") //发送post请求
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                //.param("number", "123")
                //.param("password","123456")
                .content(JSON.toJSONString(user))
                //接收的类型
                .accept(MediaType.APPLICATION_JSON_UTF8))
                //等同于Assert.assertEquals(200,status);
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())

                //返回MvcResult
                .andReturn();
        //得到返回代码
        int status = mvcResult.getResponse().getStatus();
        //得到返回结果
        String content = mvcResult.getResponse().getContentAsString();
        //断言，判断返回代码是否正确
        Assert.assertEquals(200,status);

    }


}

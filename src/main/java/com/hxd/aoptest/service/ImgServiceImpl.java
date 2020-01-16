package com.hxd.aoptest.service;

import com.hxd.aoptest.dao.ImgMapper;
import com.hxd.aoptest.model.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {

    @Autowired
    private ImgMapper imgMapper;

    @Override
    public List<Img> queryImg() {
        System.out.println("1111");
        return imgMapper.queryAllImg();
    }
}

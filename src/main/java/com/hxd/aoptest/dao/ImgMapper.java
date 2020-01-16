package com.hxd.aoptest.dao;

import com.hxd.aoptest.model.Img;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKeyWithBLOBs(Img record);

    int updateByPrimaryKey(Img record);

    List<Img> queryAllImg();
}
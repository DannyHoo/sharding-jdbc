package com.danny.sharding.mapper;

import com.alibaba.fastjson.JSON;
import com.danny.sharding.ApplicationTests;
import com.danny.sharding.dao.OrderInfoMapper;
import com.danny.sharding.entity.OrderInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author huyuyang
 * @email yuyang.hu@opay-inc.com
 * @date 2019/11/30下午8:20
 */
public class OrderInfoMapperTest extends ApplicationTests {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Test
    public void findTest(){
        OrderInfo orderInfo=orderInfoMapper.selectByPrimaryKey(1L);
        System.out.println(JSON.toJSONString(orderInfo));
    }
}

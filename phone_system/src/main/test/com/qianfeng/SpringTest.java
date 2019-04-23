package com.qianfeng;

import com.qianfeng.po.TbBrank;
import com.qianfeng.po.TbPhone;
import com.qianfeng.service.impl.PhoneServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private PhoneServiceImpl phoneService;

    @Test
    public void test1(){
        List<TbBrank> tbBranks = phoneService.queryAllBrank();
        System.out.println("第三个数据"+tbBranks.get(2).getBrankName());
    }

    @Test
    public void test2(){
        List<TbPhone> tbPhones = phoneService.queryAllPhoneInfo(1);
        System.out.println("第二个数据"+tbPhones.get(1).getPhoneInfo()+"/"+tbPhones.get(1).getPhoneImage());
    }

    @Test
    public void test3(){
        List<TbPhone> tbPhones = phoneService.queryPhoneInfoByBrank(1);
        System.out.println(tbPhones.size()+"/"+tbPhones.get(0).getPhoneInfo());
    }
}

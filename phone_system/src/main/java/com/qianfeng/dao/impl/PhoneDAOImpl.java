package com.qianfeng.dao.impl;

import com.qianfeng.dao.PhoneDAO;
import com.qianfeng.mapper.PhoneMapper;
import com.qianfeng.po.TbBrank;
import com.qianfeng.po.TbPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhoneDAOImpl implements PhoneDAO {

    @Autowired
    private PhoneMapper phoneMapper;

    /**
     * 查询所有品牌
     * @return
     */
    @Override
    public List<TbBrank> queryAllBrank() {
        return phoneMapper.queryAllBrank();
    }

    /**
     * 查询所有型号
     */
    @Override
    public List<TbPhone> queryAllPhoneInfo(Integer page) {
        return phoneMapper.queryAllPhoneInfo(page);
    }

    @Override
    public List<TbPhone> queryPhoneInfoByBrank(Integer brankId) {
        return phoneMapper.queryPhoneInfoByBrank(brankId);
    }
}

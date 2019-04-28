package com.qianfeng.service.impl;

import com.qianfeng.dao.PhoneDAO;
import com.qianfeng.mapper.PhoneMapper;
import com.qianfeng.po.TbBrank;
import com.qianfeng.po.TbPhone;
import com.qianfeng.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

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

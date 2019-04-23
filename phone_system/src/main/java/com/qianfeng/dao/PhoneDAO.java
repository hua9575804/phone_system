package com.qianfeng.dao;

import com.qianfeng.po.TbBrank;
import com.qianfeng.po.TbPhone;

import java.util.List;

public interface PhoneDAO {

    /**
     * 查询所有手机品牌
     * @return
     */
    List<TbBrank> queryAllBrank();

    /**
     * 查询所有型号
     */
    List<TbPhone> queryAllPhoneInfo(Integer page);

    /**
     * 根据品牌查询型号
     * @param brankId
     * @return
     */
    List<TbPhone> queryPhoneInfoByBrank(Integer brankId);
}

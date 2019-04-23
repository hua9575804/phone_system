package com.qianfeng.mapper;

import com.qianfeng.po.TbBrank;
import com.qianfeng.po.TbPhone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneMapper {

    /**
     * 查询所有手机品牌
     * @return
     */
    List<TbBrank> queryAllBrank();

    /**
     * 查询所有型号
     */
    List<TbPhone> queryAllPhoneInfo(@Param("page")Integer page);

    /**
     * 根据品牌查询型号
     * @param brankId
     * @return
     */
    List<TbPhone> queryPhoneInfoByBrank(@Param("brankId")Integer brankId);

}

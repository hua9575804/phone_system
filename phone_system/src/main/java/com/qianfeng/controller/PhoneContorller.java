package com.qianfeng.controller;

import com.qianfeng.po.TbBrank;
import com.qianfeng.po.TbPhone;
import com.qianfeng.service.impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("phone")
public class PhoneContorller {

    @Autowired
    private PhoneServiceImpl phoneService;

    /**
     * 查询所有品牌
     * @return
     */
    @RequestMapping(value = "branks",method = RequestMethod.GET)
    public List<TbBrank> queryAllBrank(){
        List<TbBrank> tbBranks = phoneService.queryAllBrank();
        return tbBranks;
    }

    /**
     * 查询所有手机型号
     * @return
     */
    @RequestMapping(value = "phones/{page}",method = RequestMethod.GET)
    public List<TbPhone> queryAllPhone(@PathVariable("page")Integer page){
        List<TbPhone> tbPhones = phoneService.queryAllPhoneInfo(page);
        return tbPhones;
//        String pageStr = req.getParameter("page");
//        try {
//            pageStr = pageStr==null?"1":pageStr;
//            List<WxbGood> goodList =
//                    goodsService.queryGoodsByPage(Integer.parseInt(pageStr));
//            req.setAttribute("goodsList",goodList);
//            req.getRequestDispatcher("goods_list.jsp").forward(req,resp);
//        } catch (Exception e) {
//            e.printStackTrace();
//            //能处理就处理
//            //不能处理就跳转到错误提示页面
//        }
    }

    @RequestMapping(value = "phoneBrank/{brankId}",method = RequestMethod.GET)
    public List<TbPhone> queryPhoneInfoByBrank(@PathVariable("brankId")Integer brankId){
        List<TbPhone> tbPhones = phoneService.queryPhoneInfoByBrank(brankId);
        return tbPhones;
    }
}

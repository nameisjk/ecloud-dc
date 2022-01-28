package com.xm.dc.controller;


import com.xm.dc.entity.CUser;
import com.xm.dc.entity.Response;
import com.xm.dc.service.ICUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dxf
 * @since 2021-10-20
 */
@RestController
@RequestMapping("/c-user")
public class CUserController {
    @Autowired
    private ICUserService icUserService;

    @RequestMapping("/ajax.do")
    @ResponseBody // spring mvc返回ajax json格式数据的注解
    public List<CUser> ajax() {
        // http://localhost:8089/ssmptt/ajax.do
       // CUser search = new CUser();

        List<CUser> list = icUserService.list();

        return list;
    }

    @RequestMapping("/aj.do")
    @ResponseBody // spring mvc返回ajax json格式数据的注解
    public Response aj() {
        // http://localhost:8089/ssmptt/ajax.do
        // CUser search = new CUser();
        Response result=new Response();
        List<CUser> list=  icUserService.selectall();
        result.setData(list);
        return result;
    }
}

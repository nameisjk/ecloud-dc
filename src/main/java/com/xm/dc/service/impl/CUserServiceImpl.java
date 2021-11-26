package com.xm.dc.service.impl;

import com.xm.dc.entity.CUser;
import com.xm.dc.mapper.CUserMapper;
import com.xm.dc.service.ICUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxf
 * @since 2021-10-20
 */
@Service
public class CUserServiceImpl extends ServiceImpl<CUserMapper, CUser> implements ICUserService {

    @Autowired(required=false) // 自动注入(Spring IOC会帮我们注入)
    private CUserMapper userMapper;


    @Override
    public List<CUser> selectall() {
        return userMapper.selectall();
    }
}

package com.xm.dc.service;

import com.xm.dc.entity.CUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dxf
 * @since 2021-10-20
 */
public interface ICUserService extends IService<CUser> {

    List<CUser> selectall();
}

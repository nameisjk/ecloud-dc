package com.xm.dc.mapper;

import com.xm.dc.entity.CUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dxf
 * @since 2021-10-20
 */
public interface CUserMapper extends BaseMapper<CUser> {

    List<CUser> selectall();
}

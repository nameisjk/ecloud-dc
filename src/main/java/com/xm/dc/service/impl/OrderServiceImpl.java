package com.xm.dc.service.impl;

import com.xm.dc.entity.Order;
import com.xm.dc.mapper.OrderMapper;
import com.xm.dc.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxf
 * @since 2022-01-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}

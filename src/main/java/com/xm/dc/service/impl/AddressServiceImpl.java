package com.xm.dc.service.impl;

import com.xm.dc.entity.Address;
import com.xm.dc.mapper.AddressMapper;
import com.xm.dc.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}

package com.xm.dc.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author dxf
 * @since 2022-01-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址id
     */
    private Integer addressid;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 国家
     */
    private String country;

    /**
     * 省
     */
    private String province;

    /**
     * 市，区
     */
    private String city;

    /**
     * 街道
     */
    private String street;

    /**
     * 住址
     */
    private String place;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 电话
     */
    private String phone;


}

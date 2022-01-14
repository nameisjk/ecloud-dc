package com.xm.dc.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author dxf
 * @since 2021-10-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@XStreamAlias("cuser")
public class CUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type=IdType.AUTO)
    private Integer usesrid;

    private String username;

    private String userpwd;

    private String phone;

    private Integer age;

    private Integer role;


}

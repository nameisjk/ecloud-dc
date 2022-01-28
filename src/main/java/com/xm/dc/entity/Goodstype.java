package com.xm.dc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class Goodstype implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "typeId", type = IdType.AUTO)
    private Integer typeid;

    @TableField("typeName")
    private String typename;


}

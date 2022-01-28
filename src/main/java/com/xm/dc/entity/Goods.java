package com.xm.dc.entity;

import java.math.BigDecimal;
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
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "goodsId", type = IdType.AUTO)
    private Integer goodsid;

    @TableField("goodsName")
    private String goodsname;

    @TableField("imageUrl")
    private String imageurl;

    private BigDecimal price;

    private Float discount;

    private Float numbers;

    @TableField("sellNum")
    private Float sellnum;

    @TableField("typeId")
    private Integer typeid;

    @TableField("bussId")
    private Integer bussid;

    private Integer state;

    private Integer bussinessid;


}

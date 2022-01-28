package com.xm.dc.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("orderId")
    private Integer orderid;

    @TableField("userId")
    private Integer userid;

    @TableField("addressId")
    private Integer addressid;

    @TableField("orderTime")
    private LocalDateTime ordertime;

    /**
     * 金额
     */
    private BigDecimal price;

    /**
     * 支付状态    0为未支付  1为已支付
     */
    @TableField("payState")
    private Integer paystate;

    /**
     * 邮寄状态   0为未邮寄  1为已邮寄
     */
    @TableField("postState")
    private Integer poststate;

    /**
     * 逻辑删除   0为存在    1为删除  
     */
    private Integer delflag;


}

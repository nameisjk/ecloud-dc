package com.xm.dc.entity;

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
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("orderId")
    private Integer orderid;

    @TableField("goodsId")
    private Integer goodsid;

    private Float number;

    private Float discount;

    private Float price;


}

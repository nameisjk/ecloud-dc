package com.xm.dc.entity;

import java.time.LocalDateTime;
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
public class Carts implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userid;

    private Integer goodsid;

    private LocalDateTime addtime;

    private Integer number;


}

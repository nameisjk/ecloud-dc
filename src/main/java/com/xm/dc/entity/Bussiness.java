package com.xm.dc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Bussiness implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bussinessid", type = IdType.AUTO)
    private Integer bussinessid;

    @TableField("bussName")
    private String bussname;

    @TableField("createTime")
    private LocalDateTime createtime;

    /**
     * 0正常    1关闭
     */
    private String state;

    @TableField("userId")
    private Integer userid;


}

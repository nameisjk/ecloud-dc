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
 * @since 2021-10-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer usesrid;

    private String username;

    private String userpwd;

    private String phone;

    private Integer age;

    private Integer role;


}

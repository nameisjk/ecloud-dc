package com.xm.dc.entity;

import lombok.Data;

@Data
public class Response<T> {
    private static final long serialVersionUID = -3184758898360474239L;
    private String code;
    private String message;
    private T data;


}

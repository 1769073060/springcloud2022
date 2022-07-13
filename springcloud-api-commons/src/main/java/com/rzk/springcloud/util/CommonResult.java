package com.rzk.springcloud.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult implements Serializable {
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }

}

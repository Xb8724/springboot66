package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultBean {
    private String responseCode;
    private String data;
}

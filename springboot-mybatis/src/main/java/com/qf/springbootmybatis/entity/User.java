package com.qf.springbootmybatis.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class User {
    @NotNull
    private String name;
    @Pattern(regexp = "^1(3|4|5|6|7)\\d{9}$",message = "手机号码格式错误")
    @NotNull(message = "手机号码不能为空")
    private String phone;

    @Email(message = "邮箱格式不正确")
    private String email;

    @Min(18)
    private Integer age;
}

package com.qf.springbootmybatis.entity;

import lombok.*;

/*@Getter
@Setter
@EqualsAndHashCode
@ToString*/
@Data
public class TUser {
    private Long id;

    private String username;

    private String password;

    public TUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public TUser() {
    }

}
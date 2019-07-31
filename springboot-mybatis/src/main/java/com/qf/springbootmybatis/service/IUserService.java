package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.TUser;

public interface IUserService {
    TUser getById(Long id);
}

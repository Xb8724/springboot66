package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

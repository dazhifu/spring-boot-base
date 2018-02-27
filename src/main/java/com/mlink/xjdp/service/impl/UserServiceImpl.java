package com.mlink.xjdp.service.impl;

import com.mlink.xjdp.dao.UserMapper;
import com.mlink.xjdp.model.User;
import com.mlink.xjdp.service.UserService;
import com.mlink.xjdp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/02/26.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}

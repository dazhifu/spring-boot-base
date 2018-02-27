package com.mlink.xjdp.dao;

import com.mlink.xjdp.core.Mapper;
import com.mlink.xjdp.model.User;

public interface UserMapper extends Mapper<User> {

    User getOne(Long id);
}
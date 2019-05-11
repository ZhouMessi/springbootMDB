package com.moredb.demo.services;

import com.moredb.demo.aop.DS;
import com.moredb.demo.domain.User;
import com.moredb.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @DS("datasource1")
    public User Sel1(int id){
        return userMapper.Sel(id);
    }


    @DS("datasource2")
    public User Sel2(int id){
        return userMapper.Sel(id);
    }

}

package springbootmb.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootmb.demo.domain.User;
import springbootmb.demo.mapper.UserMapper;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}

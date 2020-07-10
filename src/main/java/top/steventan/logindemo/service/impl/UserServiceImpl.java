package top.steventan.logindemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.steventan.logindemo.domain.User;
import top.steventan.logindemo.mapper.UserMapper;
import top.steventan.logindemo.service.UserService;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:06
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByName(String loginName) {
        return userMapper.selectUserByName(loginName);
    }
}

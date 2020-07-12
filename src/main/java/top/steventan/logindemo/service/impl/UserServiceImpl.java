package top.steventan.logindemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.steventan.logindemo.domain.User;
import top.steventan.logindemo.mapper.UserMapper;
import top.steventan.logindemo.service.UserService;

import java.util.Random;

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

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public String randomSalt(int len) {
        String str="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < 6;i++){
            int number = random.nextInt(36);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}

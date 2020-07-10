package top.steventan.logindemo.service;

import top.steventan.logindemo.domain.User;

import java.util.List;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:06
 */
public interface UserService {

    List<User> selectUserByName(String username);

}

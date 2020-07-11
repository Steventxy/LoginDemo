package top.steventan.logindemo.service;

import top.steventan.logindemo.domain.User;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:06
 */
public interface UserService {

    User selectUserByName(String loginName);

    void addUser(User user);
}

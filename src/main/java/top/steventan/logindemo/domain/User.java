package top.steventan.logindemo.domain;

import lombok.Data;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:05
 */

@Data
public class User {
    private int userId;

    private String loginName;

    private String username;

    private String salt;

    private String password;

    private String delFlag;
}

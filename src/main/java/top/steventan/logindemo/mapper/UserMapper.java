package top.steventan.logindemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.steventan.logindemo.domain.User;

import java.util.List;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:05
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> selectUserList();

    User selectUserByName(String loginName);

}

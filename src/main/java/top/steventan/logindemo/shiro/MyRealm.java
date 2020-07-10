package top.steventan.logindemo.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import top.steventan.logindemo.domain.User;
import top.steventan.logindemo.service.impl.UserServiceImpl;

/**
 * @author TanXY
 * @create 2020/6/1 - 14:09
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserServiceImpl userService;


    //获取权限信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User user = (User)principals.getPrimaryPrincipal();
        int userId = user.getUserId();

        return authorizationInfo;
    }

    //获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //token是封装好的用户提交的用户名、密码
        //获取用户  封装Authentication
        String loginName = ((UsernamePasswordToken) token).getUsername();
        User userInfo = userService.selectUserByName(loginName);

        if (null == userInfo) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo,
                userInfo.getPassword(),
                ByteSource.Util.bytes(userInfo.getSalt()),
                getName()
        );

        return authenticationInfo;
    }
}

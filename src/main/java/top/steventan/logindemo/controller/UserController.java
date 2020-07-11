package top.steventan.logindemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import top.steventan.logindemo.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:05
 */
@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public void userRegister(HttpServletRequest request){
        System.out.println(request.getParameter("loginName"));
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        System.out.println(request.getParameter("salt"));
//        userService.addUser();
    }
}

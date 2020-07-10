package top.steventan.logindemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.steventan.logindemo.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:05
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("")
    public String redirectLogin(){
        return "redirect:login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @PostMapping("/main")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);
        return "2";
    }
}

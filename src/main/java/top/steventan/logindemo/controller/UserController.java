package top.steventan.logindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author TanXY
 * @create 2020/7/9 - 10:05
 */
@Controller
public class UserController {


    @GetMapping("/index")
    public String index(HttpServletRequest request){
        return "index";
    }
}

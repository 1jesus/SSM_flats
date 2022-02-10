package com.zhiyou.controller;


import com.zhiyou.domain.User;
import com.zhiyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Classname UserController
 * @Date 2021/11/26 21:02
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //登录
//    @MyLog("登录")
    @RequestMapping("/login.do")
    public String findUser(User user, HttpSession session, Model model) {
        User userLogin = userService.findUserByUsernameAndPassword(user);

        if (userLogin != null || !"".equals(userLogin)) {     
//            mv.addObject("userLogin", userLogin);
            session.setAttribute("userLogin", userLogin);
            return "forward:/admin.jsp";
        } else {
            model.addAttribute("loginErrMsg", "用户名或密码错误");
            return "forward:/index.jsp";
        }
    }


//    //登录
//    @RequestMapping("/login.do")
//    public ModelAndView findUser(User user, HttpSession session) {
//        ModelAndView mv = new ModelAndView();
//
//        User userLogin = userService.findUserByUsernameAndPassword(user);
//
////        System.out.println("查询到的userLogin = " + userLogin.getUname() + "  " + userLogin.getUpassword());
////        System.out.println("参数中的user      = " + user.getUname() + "  " + user.getUpassword());
//
//        String name = user.getUname();
//        String password = user.getUpassword();
////        System.out.println("输入的用户数据 = " + name + " " + password);
//
//        if (userLogin != null || !"".equals(userLogin)) {      /*user1.getUname().equals(user.getUname()) && user1.getPassword().equals(user.getPassword())*/
////            mv.addObject("userLogin", userLogin);
//            session.setAttribute("userLogin", userLogin);
//            mv.setViewName("forward:/admin.jsp");
//        } else {
//            mv.addObject("loginErrMsg", "用户名或密码错误");
//            mv.setViewName("forward:/index.jsp");
//        }
//
//        return mv;
//    }

}

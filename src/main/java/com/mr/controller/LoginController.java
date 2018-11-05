package com.mr.controller;

import com.mr.model.TMallUserAccount;
import com.mr.service.UserService;
import com.mr.util.MyCookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by yaodd on 2018/11/5.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param userName 用户名
     * @param password 密码
     * @return
     *
     *  通过用户名密码查询数据，查询到登录成功，去首页，否则去登录页面
     *
     */
    @RequestMapping("login")
    public String login(String userName , String password, HttpSession session,
                        HttpServletRequest request, HttpServletResponse response){

        //通过用户名密码查询对象
        TMallUserAccount user = userService.findUserByNamePswd(userName,password);

        if(user == null){//登录失败

            return "redirect:toLoginPage.do";

        }else{
            session.setAttribute("user", user);
            String yhMch = user.getYhMch();
            //将用户名称放入cookie对象中
            MyCookieUtils.setCookie(request,response,"yhMch",yhMch, 24*60*60,true);

            return "redirect:toMainPage.do";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:toLoginPage.do";
    }


}

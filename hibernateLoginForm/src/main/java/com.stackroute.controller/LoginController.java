package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String greeting(){

        return "Login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView greeting1(@RequestParam("username")String userName, @RequestParam("password") String userPassword){
        User user = new User();
        ModelAndView mv= new ModelAndView();
        mv.setViewName("index");
        user.setUserName(userName);
        user.setPassword(userPassword);
        mv.addObject("userdetail",user);

        return mv;
    }
}

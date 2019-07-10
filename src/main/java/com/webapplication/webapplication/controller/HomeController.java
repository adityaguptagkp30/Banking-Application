package com.webapplication.webapplication.controller;
import com.webapplication.webapplication.Customer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller

public class HomeController
{

    @RequestMapping("home")

//@ResponseBody
    public ModelAndView home(Customer customer)
    {
        ModelAndView mv=new ModelAndView();
//       System.out.println("hi " +name);
       mv.addObject("obj",customer);
       mv.setViewName("home");

        return mv;
    }

}

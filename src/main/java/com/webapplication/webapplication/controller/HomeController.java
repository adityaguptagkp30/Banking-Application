package com.webapplication.webapplication.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class HomeController
{

    @RequestMapping("home")

//@ResponseBody
    public String home()
    {

       System.out.println("hi ");

        return "home";
    }

}

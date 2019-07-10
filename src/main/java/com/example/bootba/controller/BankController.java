package com.example.bootba.controller;

import com.example.bootba.dao.BankRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bootba.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankController
{
    @Autowired
    BankRepo repo;

    @RequestMapping("/")
    public String home()

    {
        return "home.jsp";
    }
    @RequestMapping("/addCustomer")
    public String addCustomer(Bank bank)
    {
        repo.save(bank);
        return "home.jsp";
    }
}

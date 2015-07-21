package com.tw.controller;

import com.tw.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hgwang on 7/17/15.
 */
@RestController
@RequestMapping("/")
public class CustomersController {

    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "customers", method = RequestMethod.GET)
    public ModelAndView getCustomersPage(){
        return new ModelAndView("customers", "customers", customerService.getAllCustomers() );
    }
}

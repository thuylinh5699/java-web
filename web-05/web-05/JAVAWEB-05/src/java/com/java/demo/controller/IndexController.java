/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.controller;

import com.java.demo.bean.Customer;
import com.java.demo.model.CustomerModel;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author ThuyLinh
 */
@Controller
public class IndexController {
     @RequestMapping("/home.htm")
    public String list(ModelMap model) {
        CustomerModel customerModel = new CustomerModel();
        try {
            List<Customer> customers = customerModel.getAll();
            model.addAttribute("customers", customers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "home";
    }
    
    @RequestMapping(value = "/add.htm", method = RequestMethod.GET)
    public String addCustomer(ModelMap model) {
        model.addAttribute("command", new Customer());
        return "add";
    }
    
    @RequestMapping(value = "/edit.htm", method = RequestMethod.GET)
    public String editCustomer(@RequestParam("id") int id, ModelMap model) {
        
        CustomerModel customerModel = new CustomerModel();
        try {
            Customer customer = customerModel.getById(id);
            model.addAttribute("command", customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "edit";
    }
    
    @RequestMapping("/save.htm")
    public String saveCustomer(@ModelAttribute("customer") Customer cust) {
        CustomerModel customerModel = new CustomerModel();
        try {
            customerModel.add(cust);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/home.htm";
    }
    
    @RequestMapping("/update.htm")
    public String updateCustomer(@ModelAttribute("customer") Customer cust) {
        CustomerModel customerModel = new CustomerModel();
        try {
            customerModel.update(cust);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/home.htm";
    }
    
    @RequestMapping("/delete.htm")
    public String delete(@RequestParam("id") int id) {
        CustomerModel customerModel = new CustomerModel();
        try {
            customerModel.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/home.htm";
    }
}

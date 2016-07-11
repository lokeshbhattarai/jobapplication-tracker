/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lokex
 */
@Controller
public class HomeController {
    
    @Autowired private IuserService service;
    
    @RequestMapping("/")
    public String loadWelcomePage(){
        //return "redirect:/home";
        return "home";
    }
    
    @RequestMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("newUser", new User());
        return "login";
    }
    
    @RequestMapping(value="/signup",method=RequestMethod.GET)
    public String getSignupPage(Model model){
        model.addAttribute("newUser", new User());
        return "signup";
    }
    
     @RequestMapping(value="/signup",method=RequestMethod.POST)
    public String registerUser(User user, @RequestParam("confirm_password") String confirmPassword){
        
        service.addNewUser(user);
              
        return "redirect:/dummy";
    }
    
    @RequestMapping("dummy")
    public String loadDummyPage(){
        return "dummy";
    }
    
}

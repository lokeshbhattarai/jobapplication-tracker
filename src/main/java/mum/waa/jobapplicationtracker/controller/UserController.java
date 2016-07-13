/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import javax.servlet.http.HttpServletRequest;
import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author dilip
 */
@Controller
public class UserController {

    @Autowired
    private IuserService userService;

    @RequestMapping("/")
    public String loadWelcomePage(){
        //return "redirect:/home";
        return "login_newuser";
    }
    
    @RequestMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("newUser", new User());
        return "login_newuser";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String doLogin(@RequestBody User user, HttpServletRequest request) {
        if (userService.authenticate(user)) {
            request.getSession().setAttribute("user", user);
            return "redirect:/dashboard";
        } else {
            return "login_newuser";
        }
    }

//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String loadRegistrationPage() {
//        return "userregistration";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String registerUser(@RequestBody User user, HttpServletRequest request) {
        long userId = userService.addNewUser(user);
        request.getSession().setAttribute("user", user);
        return "redirect:/dashboard";
    }
    
    @RequestMapping(value = "/pagination", method = RequestMethod.GET)
    public String loadPaginationPage() {
        return "pagination";
    }
    @RequestMapping("/changepassword")
    public String loadChangePassword() {
        return "changepassword";
    }

    @RequestMapping("/settings")
    public String loadSettings() {
        return "settings";
    }

    @RequestMapping("/logout")
    public String loadLogout() {
        return "logout";
    }
}

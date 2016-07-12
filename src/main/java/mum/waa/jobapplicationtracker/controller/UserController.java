/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author lokex
 */
@Controller
public class UserController {
    
    class employee implements Serializable{
        String firstname;
        String lastname;

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public employee(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String loadRegistrationPage(){
        return "userregistration";
    }
    
    @RequestMapping(value = "/pagination", method = RequestMethod.GET)
    public String loadPaginationPage(){
        return "pagination";
    }
    
    @RequestMapping(value = "/getrecords/{itemsPerPage}/{pageno}", method = RequestMethod.GET)
    public @ResponseBody List<employee> loadPaginationPage(@PathVariable int itemsPerPage, @PathVariable int pageno){
        List<employee> emps = new ArrayList<>();
        for (int i = 0; i < itemsPerPage; i++) {
            emps.add(new employee(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        }
        return emps;
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void registerUser(@RequestBody User user){
        int id = 1;
    }
    
}

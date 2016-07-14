/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.service.IJobOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author suraj
 */
@Controller
public class DashboardController {
     @Autowired
    private IJobOpeningService jobService;

    @RequestMapping("/dashboard")
    public String loadDashboard(HttpServletRequest request, Model model){   
         List<JobOpening> jobs = new ArrayList<>();

        User user = (User) request.getSession().getAttribute("user");
        jobs = jobService.getAllJobOpenings(user.getId());
        
        model.addAttribute("applyjobs", jobs);
        
        return "home";
    }
    
    
   
}

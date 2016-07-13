/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.service.IJobOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author suraj
 */
@Controller
public class ApplyJobController {
    
    @Autowired
    private IJobOpeningService jobService;
    
    @RequestMapping("/applyjob")
    public String loadDashboard(){        
        return "applyjob";
    }
    
    @RequestMapping(value="/applyjob/addjob", method = RequestMethod.GET)
    public String getNewJobFrom(){        
        return "newjob";
    }
    
    @RequestMapping(value="/applyjob/addjob", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addJobRest(@RequestBody @Valid JobOpening job, BindingResult result, HttpServletRequest request){
        long userId = (long)request.getSession().getAttribute("userId");
        if(!result.hasErrors()){
            jobService.addJobOpening(userId, job);
        }
        
    }
    
    
}

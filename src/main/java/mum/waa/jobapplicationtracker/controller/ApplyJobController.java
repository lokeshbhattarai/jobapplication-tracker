/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import javax.validation.Valid;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author suraj
 */
@Controller
public class ApplyJobController {
    @Autowired
    private IJobService jobService;
    
    @RequestMapping("/applyjob")
    public String loadDashboard(){        
        return "applyjob";
    }
    
    @RequestMapping(value="/addjob", method = RequestMethod.POST)
    public String addJob(@Valid JobOpening job, BindingResult result){
        if(result.hasErrors()){
            return "applyjob";
        }
        jobService.addJob(job);
        return "redirect:/home";
    }
    
    @RequestMapping(value="/rest_addjob", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addJobRest(@RequestBody @Valid JobOpening job, BindingResult result){
        if(!result.hasErrors()){
            jobService.addJob(job);;
        }
        
    }
}

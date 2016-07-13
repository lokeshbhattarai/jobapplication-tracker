/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import mum.waa.jobapplicationtracker.model.JobLog;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.service.IJobOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author suraj
 */
@Controller
public class ApplyJobController {
    
    class employee{
        public String name;
        public String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        
        public employee(String a, String b){
            this.name = a;
            this.address = b;
        }
    }

    @Autowired
    private IJobOpeningService jobService;

    @RequestMapping("/applyjob")
    public String loadDashboard() {
        return "applyjob";
    }
    
    @RequestMapping(value = "/getemp/{itemsPerPage}/{pageno}", method = RequestMethod.GET)
    public @ResponseBody List<employee> getemplo(@PathVariable int itemsPerPage, @PathVariable int pageno){
        List<employee> list = new ArrayList<>();
        list.add(new employee("aa", "bb"));
        list.add(new employee("a1", "b1"));
        list.add(new employee("a2", "b2"));
        return list;
    }

    @RequestMapping(value = "/applyjoblist", method = RequestMethod.GET)
    public String loadAppliedJobListPage() {
        return "appliedjobsearch";
    }

    @RequestMapping(value = "/getappliedjoblist/{itemsPerPage}/{pageno}", method = RequestMethod.GET)
    public @ResponseBody
    List<JobOpening> getAppliedJobList(String filter, @PathVariable int itemsPerPage, @PathVariable int pageno,HttpServletRequest request) {
        List<JobOpening> jobs = new ArrayList<>();
        
        User user = (User)request.getSession().getAttribute("user");
        
        jobs = jobService.getAllJobOpenings(user.getId());
        
        return jobs;
       
//        List<JobOpening> results = jobs;
//        if (filter != null) {
//            results = jobs.stream()
//                    .filter(j -> j.getJobTitle().toUpperCase().contains(filter.toUpperCase()))
//                    .collect(Collectors.toList());
//        }
//
//        results = results.stream()
//                .skip((itemsPerPage * (pageno - 1)))
//                .limit(itemsPerPage)
//                .collect(Collectors.toList());

       // return results;
    }

    @RequestMapping(value = "/applyjob/addjob", method = RequestMethod.GET)
    public String getNewJobFrom() {
        return "newjob";
    }

    @RequestMapping(value = "/applyjob/addjob", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addJobRest(@RequestBody @Valid JobOpening job, BindingResult result, HttpServletRequest request) {
        //long userId = (long) request.getSession().getAttribute("userId");
        User u = (User)request.getSession().getAttribute("user");
        long userId = u.getId();
        if (!result.hasErrors()) {
           
            jobService.addJobOpening(userId, job);
        }

    }
    
    @RequestMapping(value = "/applyjob/addlog", method = RequestMethod.GET)
    public String getAddLogPage(@RequestParam("jobId") String jobId) {
        return "addJobLog";
    }

    @RequestMapping(value = "/applyjob/addlog", method = RequestMethod.POST)
    public String addJobLog(@RequestBody JobLog jobLog,HttpServletRequest request) {
        
        User user = (User) request.getSession().getAttribute("user");
        
        return "dummy";
    }
}

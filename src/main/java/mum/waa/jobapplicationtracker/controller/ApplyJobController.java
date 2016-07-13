/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.controller;

import java.util.ArrayList;
import java.util.List;
import mum.waa.jobapplicationtracker.model.JobOpening;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author suraj
 */
@Controller
public class ApplyJobController {
    
    @RequestMapping("/applyjob")
    public String loadDashboard(){        
        return "applyjob";
    }
    
    @RequestMapping(value = "/applyjoblist", method = RequestMethod.GET)
    public String loadAppliedJobListPage(){
        return "appliedjobsearch";
    }
    
    @RequestMapping(value = "/getappliedjoblist/{itemsPerPage}/{pageno}", method = RequestMethod.GET)
    public @ResponseBody List<JobOpening> getAppliedJobList(@PathVariable int itemsPerPage, @PathVariable int pageno){
        List<JobOpening> jobs = new ArrayList<>();
        for (int i = 0; i < itemsPerPage; i++) {
            JobOpening job = new JobOpening();
            job.setJobTitle("C# developer");
            job.setCompanyName("Microsoft Tech");
            jobs.add(job);
        }
        return jobs;
    }
}

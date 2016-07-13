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
import mum.waa.jobapplicationtracker.model.JobOpening;
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
    public String loadDashboard() {
        return "applyjob";
    }

    @RequestMapping(value = "/applyjoblist", method = RequestMethod.GET)
    public String loadAppliedJobListPage() {
        return "appliedjobsearch";
    }

    @RequestMapping(value = "/getappliedjoblist/{itemsPerPage}/{pageno}", method = RequestMethod.GET)
    public @ResponseBody
    List<JobOpening> getAppliedJobList(String filter, @PathVariable int itemsPerPage, @PathVariable int pageno) {
        List<JobOpening> jobs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JobOpening job = new JobOpening();
            job.setJobTitle("c# developer");
            job.setCompanyName("Microsoft Tech");
            jobs.add(job);
        }
        for (int i = 0; i < 5; i++) {
            JobOpening job = new JobOpening();
            job.setJobTitle("java developer");
            job.setCompanyName("Oracle Tech");
            jobs.add(job);
        }
        for (int i = 0; i < 5; i++) {
            JobOpening job = new JobOpening();
            job.setJobTitle("Javascript developer");
            job.setCompanyName("Google Tech");
            jobs.add(job);
        }
        List<JobOpening> results = jobs;
        if (filter != null) {
            results = jobs.stream()
                    .filter(j -> j.getJobTitle().toUpperCase().contains(filter.toUpperCase()))
                    .collect(Collectors.toList());
        }

        results = results.stream()
                .skip((itemsPerPage * (pageno - 1)))
                .limit(itemsPerPage)
                .collect(Collectors.toList());

        return results;
    }

    @RequestMapping(value = "/applyjob/addjob", method = RequestMethod.GET)
    public String getNewJobFrom() {
        return "newjob";
    }

    @RequestMapping(value = "/applyjob/addjob", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addJobRest(@RequestBody @Valid JobOpening job, BindingResult result, HttpServletRequest request) {
        long userId = (long) request.getSession().getAttribute("userId");
        if (!result.hasErrors()) {
            jobService.addJobOpening(userId, job);
        }

    }
}

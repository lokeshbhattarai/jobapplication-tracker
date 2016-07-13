/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.service.impl;

import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.persistance.IJobDao;
import mum.waa.jobapplicationtracker.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dilip
 */
@Service
public class JobServiceImpl implements IJobService{

    @Autowired
    private IJobDao jobDao;
    
    @Override
    public void addJob(JobOpening job) {
        jobDao.addJob(job);
    }
    
}

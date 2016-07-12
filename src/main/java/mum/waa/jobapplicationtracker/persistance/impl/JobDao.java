/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance.impl;

import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.persistance.IJobDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dilip
 */
@Repository
public class JobDao implements IJobDao{

    @Override
    public void addJob(JobOpening job) {
        //to do
    }
    
}

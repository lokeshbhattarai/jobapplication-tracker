/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance.impl;

import java.util.List;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.persistance.AbstractDao;
import mum.waa.jobapplicationtracker.persistance.IJobOpeningDao;

/**
 *
 * @author lokex
 */
public class JobOpeningDao extends AbstractDao<Long, JobOpening> implements IJobOpeningDao{

    @Override
    public void addJobOpening( JobOpening jobOpening) {
        persist(jobOpening);
    }

    @Override
    public List<JobOpening> getAllJobOpenings(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logJobAppy(long jobOpeningId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

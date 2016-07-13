/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.service.impl;

import java.util.List;
import mum.waa.jobapplicationtracker.model.JobEvent;
import mum.waa.jobapplicationtracker.service.IJobEventService;
import org.springframework.stereotype.Service;

/**
 *
 * @author lokex
 */
@Service
public class JobEventService implements IJobEventService{

    @Override
    public List<JobEvent> getAllJobEvents(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<JobEvent> getJobEventsByJob(long userId, long jobOpeningId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addJobEvent(long userId, long jobOpeningId, JobEvent jobEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

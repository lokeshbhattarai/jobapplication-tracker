/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.service.impl;

import java.util.List;
import mum.waa.jobapplicationtracker.model.JobLog;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.model.NotificationLog;
import mum.waa.jobapplicationtracker.persistance.IJobOpeningDao;
import mum.waa.jobapplicationtracker.service.IJobOpeningService;
import mum.waa.jobapplicationtracker.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lokex
 */
@Service
public class JobOpeningService implements IJobOpeningService{

    @Autowired
    private IuserService userService;
    
    @Autowired
    private IJobOpeningDao jobOpeningDao;
    
    @Override
    public void addJobOpening(long userId, JobOpening jobOpening) {
        
        jobOpening.setUser(userService.getById(userId));
       jobOpeningDao.addJobOpening(jobOpening);
        
    }

    @Override
    public List<JobOpening> getAllJobOpenings(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<JobLog> getJobLogs(long jobOpeningId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NotificationLog> getNotificationLogs(long jobOpeningId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addJobLog(long jobOpeningId, JobLog jobLog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addNotificationLog(long jobOpeningId, NotificationLog notificationLog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logJobAppy(long jobOpeningId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

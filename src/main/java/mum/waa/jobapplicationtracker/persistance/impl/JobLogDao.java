/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance.impl;

import java.util.List;
import mum.waa.jobapplicationtracker.model.JobLog;
import mum.waa.jobapplicationtracker.persistance.AbstractDao;
import mum.waa.jobapplicationtracker.persistance.IJobLogDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lokex
 */
@Repository
public class JobLogDao extends AbstractDao<Long, JobLog> implements IJobLogDao{

    @Override
    public void addJobLog(long jobOpeningId, JobLog jobLog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<JobLog> getJobLogs(long jobOpeningId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

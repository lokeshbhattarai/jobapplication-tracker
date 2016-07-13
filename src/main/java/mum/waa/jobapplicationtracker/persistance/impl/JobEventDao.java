/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance.impl;

import java.util.List;
import mum.waa.jobapplicationtracker.model.JobEvent;
import mum.waa.jobapplicationtracker.model.JobOpening;
import mum.waa.jobapplicationtracker.persistance.AbstractDao;
import mum.waa.jobapplicationtracker.persistance.IJobEventDao;
import mum.waa.jobapplicationtracker.service.IJobEventService;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lokex
 */
@Repository
public class JobEventDao extends AbstractDao<Long, JobEvent> implements IJobEventDao{

    @Override
    public List<JobEvent> getAllJobEvents(long userId) {
         Criteria criteria = createEntityCriteria();
         criteria.add(Restrictions.eq("user_id", userId));
         return (List<JobEvent>) criteria.list();
    }

    @Override
    public List<JobEvent> getJobEventsByJob(long userId, long jobOpeningId) {
         Criteria criteria = createEntityCriteria();
         criteria.add(Restrictions.eq("user_id", userId));
         criteria.add(Restrictions.eq("job_opening_id", jobOpeningId));
         return (List<JobEvent>) criteria.list();

    }

    @Override
    public JobEvent getById(long id) {
         Criteria criteria = createEntityCriteria();
         criteria.add(Restrictions.eq("id", id));
         return (JobEvent) criteria.uniqueResult();
    }

    @Override
    public void addJobEvent(JobEvent jobEvent) {
        persist(jobEvent);
    }
    
}

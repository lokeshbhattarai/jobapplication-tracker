/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance;

import java.util.List;
import mum.waa.jobapplicationtracker.model.JobEvent;

/**
 *
 * @author lokex
 */
public interface IJobEventDao {
    JobEvent getById(long Id);
    void addJobEvent(JobEvent jobEvent);
    List<JobEvent> getAllJobEvents(long userId);
    List<JobEvent> getJobEventsByJob(long userId,long jobOpeningId);
}

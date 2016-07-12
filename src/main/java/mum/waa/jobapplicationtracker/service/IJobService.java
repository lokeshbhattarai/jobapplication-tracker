/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.service;

import mum.waa.jobapplicationtracker.model.JobOpening;

/**
 *
 * @author Dilip
 */
public interface IJobService {
    void addJob(JobOpening job);
}

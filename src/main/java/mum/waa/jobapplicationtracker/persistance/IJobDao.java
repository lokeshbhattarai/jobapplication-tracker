/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance;

import mum.waa.jobapplicationtracker.model.JobOpening;

/**
 *
 * @author Dilip
 */
public interface IJobDao {
    void addJob(JobOpening job);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance.impl;

import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.persistance.AbstractDao;
import mum.waa.jobapplicationtracker.persistance.IuserDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lokex
 */
@Repository
public class UserDao extends AbstractDao<Integer, User> implements IuserDao{

    @Override
    public void saveUser(User user) {
        persist(user);
    }
    
}

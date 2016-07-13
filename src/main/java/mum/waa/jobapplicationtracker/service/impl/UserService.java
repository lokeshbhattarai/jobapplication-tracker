/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.service.impl;

import mum.waa.jobapplicationtracker.model.User;
import mum.waa.jobapplicationtracker.persistance.IuserDao;
import mum.waa.jobapplicationtracker.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lokex
 */
@Service
@Transactional
public class UserService implements IuserService{

    @Autowired private IuserDao userDao;
    
    
    @Override
    public long addNewUser(final User user) {
        
       userDao.saveUser(user);
       return user.getId();
    }

    @Override
    public boolean authenticate(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

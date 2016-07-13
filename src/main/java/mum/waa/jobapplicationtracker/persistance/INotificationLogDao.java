/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.persistance;

import java.util.List;
import mum.waa.jobapplicationtracker.model.NotificationLog;

/**
 *
 * @author lokex
 */
public interface INotificationLogDao {
    void addNotification(NotificationLog notification);
    
    List<NotificationLog> getAllNotifications(long userId);
    
    List<NotificationLog> getUnreadNotifications(long userId);
    
    NotificationLog getById(long notificationId);
    
    void updateNotificationAsRead(long notificationId,boolean isRead);
}

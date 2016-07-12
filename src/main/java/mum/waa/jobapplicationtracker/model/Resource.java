    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.waa.jobapplicationtracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author lokex
 */
@Entity
@Table(name="resources")
public class Resource {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    
    @Column(name="file_path")
    private String filePath;
    
    
    @Column(name="external_link")
    private String externalLink;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "created_date", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate createdDate;
    
    
}

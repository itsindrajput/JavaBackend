package com.bytexl.hibernate.dao;

import com.bytexl.hibernate.entities.Student;
import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional
    public int insert(Student student) {
        Integer id = (Integer) this.hibernateTemplate.save(student);
        return id; 
    }
}

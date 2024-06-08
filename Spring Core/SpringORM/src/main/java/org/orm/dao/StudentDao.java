package org.orm.dao;

import org.orm.entities.Student;
import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public int insert(Student student){
        int i=(int)this.hibernateTemplate.save(student);
        return i;
    }


//    @Transactional(readOnly = false) // Ensure readOnly is set to false
//    public int insert(Student student){
//        hibernateTemplate.setFlushMode(HibernateTemplate.FLUSH_EAGER); // Ensure flush mode is set
//        return (int) hibernateTemplate.save(student);
//    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

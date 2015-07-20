package com.tw.dao;

import com.tw.Util.HibernateUtil;
import com.tw.entity.Schedule;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hgwang on 7/20/15.
 */
@Repository
public class ScheduleDao {

    public List<Schedule> getAllSchedules(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        List<Schedule> schedules = session.createQuery("from Schedule").list();
        session.getTransaction().commit();

        return schedules;
    }

    public Schedule getScheduleById(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        String hql = "from Schedule where id=:id";
        Query query = session.createQuery(hql);
        query.setInteger("id", id);
        Schedule schedule = (Schedule) query.list().get(0);

        session.getTransaction().commit();
        return schedule;

    }
}

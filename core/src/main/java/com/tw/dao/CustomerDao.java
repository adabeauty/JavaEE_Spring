package com.tw.dao;

import com.tw.Util.HibernateUtil;
import com.tw.entity.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hgwang on 7/17/15.
 */

@Repository
public class CustomerDao {
    public List<Customer> getAllCustomers(){

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        List<Customer> customers = session.createQuery("FROM Customer").list();

        session.getTransaction().commit();

        return customers;
    }

    public Customer getCustomerById(int customerId) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Query query = session.createQuery("FROM Customer where id=:id");
        query.setInteger("id", customerId);
        Customer customer = (Customer) query.list().get(0);

        session.getTransaction().commit();

        return customer;
    }
}

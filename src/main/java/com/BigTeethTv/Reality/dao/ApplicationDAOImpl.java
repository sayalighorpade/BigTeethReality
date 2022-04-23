package com.BigTeethTv.Reality.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.BigTeethTv.Reality.entity.Application;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ApplicationDAOImpl implements ApplicationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List <Application> getAllApplicant() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery <Application> cq = cb.createQuery(Application.class);
        Root < Application > root = cq.from(Application.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }
    public List <Application> getAllApplicant(String tst) {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery <Application> cq = cb.createQuery(Application.class);
        Root < Application > root = cq.from(Application.class);
        cq.select(root).where(cb.like(root.get("last_name").as(String.class), cb.parameter(String.class, "last_name")));
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void deleteApplicant(int id) {
        Session session = sessionFactory.getCurrentSession();
        Application book = session.byId(Application.class).load(id);
        session.delete(book);
    }

    @Override
    public void saveApplicant(Application theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public Application getApplicant(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Application theCustomer = currentSession.get(Application.class, theId);
        return theCustomer;
    }
}

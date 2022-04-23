package com.BigTeethTv.Reality.dao;

import com.BigTeethTv.Reality.entity.Application;
import com.BigTeethTv.Reality.entity.Backgroundcheck;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
@Repository
public class BackgroundcheckDAOImpl implements BackgroundcheckDao {



    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List  <Backgroundcheck> getAllBackground() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Backgroundcheck> cq = cb.createQuery(Backgroundcheck.class);
        Root< Backgroundcheck > root = cq.from(Backgroundcheck.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();    }

    @Override
    public void saveBackground(Backgroundcheck theBackground) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theBackground);
    }

    @Override
    public void deleteBackground(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Backgroundcheck book = session.byId(Backgroundcheck.class).load(theId);
        session.delete(book);
    }
}

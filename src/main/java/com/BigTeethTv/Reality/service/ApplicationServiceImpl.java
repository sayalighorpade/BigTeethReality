package com.BigTeethTv.Reality.service;

import java.util.List;

import com.BigTeethTv.Reality.dao.ApplicationDAO;
import com.BigTeethTv.Reality.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationDAO applicationDAO;

    @Override
    @Transactional
    public List <Application> getAllApplicant() {
        return applicationDAO.getAllApplicant();
    }

    @Override
    @Transactional
    public void saveApplicationForm(Application theCustomer) {
        applicationDAO.saveApplicant(theCustomer);
    }
    @Override
    @Transactional
    public List <Application> getAllApplicant(String txt){
      //  String sql= "SELECT app_id, first_name, last_name, address from app where app_id=? and (last_name LIKE '%"+txt+"%' OR address LIKE '%");



        return applicationDAO.getAllApplicant(txt);
    }
    @Override
    @Transactional
    public Application getApplicant(int theId) {
        return applicationDAO.getApplicant(theId);
    }

    @Override
    @Transactional
    public void deleteApplicant(int theId) {
        applicationDAO.deleteApplicant(theId);
    }
}

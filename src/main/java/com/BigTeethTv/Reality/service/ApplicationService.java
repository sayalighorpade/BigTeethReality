package com.BigTeethTv.Reality.service;

import java.util.List;

import com.BigTeethTv.Reality.entity.Application;


public interface ApplicationService {

    public List <Application> getAllApplicant();
    public List <Application> getAllApplicant(String txt);
    public void saveApplicationForm(Application theCustomer);

    public Application getApplicant(int theId);

    public void deleteApplicant(int theId);

}

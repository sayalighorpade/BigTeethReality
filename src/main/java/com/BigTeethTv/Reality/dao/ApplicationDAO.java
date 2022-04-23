package com.BigTeethTv.Reality.dao;

import java.util.List;

import com.BigTeethTv.Reality.entity.Application;

public interface ApplicationDAO {

    public List <Application> getAllApplicant();
    public List <Application> getAllApplicant(String txt);
    public void saveApplicant(Application applicant);

    public Application getApplicant(int theId);

    public void deleteApplicant(int theId);
}


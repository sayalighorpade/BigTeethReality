package com.BigTeethTv.Reality.dao;

import com.BigTeethTv.Reality.entity.Application;
import com.BigTeethTv.Reality.entity.Backgroundcheck;

import java.util.List;

public interface BackgroundcheckDao {
    public List<Backgroundcheck> getAllBackground();
    //public List <Backgroundcheck> getAllApplicant(String txt);
    public void saveBackground(Backgroundcheck theBackground);

    //public Backgroundcheck getApplicant(int theId);

    public void deleteBackground(int theId);
}

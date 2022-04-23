package com.BigTeethTv.Reality.service;

import com.BigTeethTv.Reality.entity.Application;
import com.BigTeethTv.Reality.entity.Backgroundcheck;

import java.util.List;

public interface BackgroundcheckService {

    public List<Backgroundcheck> getAllBackground();
    //public List <Backgroundcheck> getAllApplicant(String txt);
    public void saveBackground(Backgroundcheck theCustomer);

    //public Backgroundcheck getApplicant(int theId);

    public void deleteBackground(int theId);
}

package com.BigTeethTv.Reality.service;

import com.BigTeethTv.Reality.dao.ApplicationDAO;
import com.BigTeethTv.Reality.entity.Backgroundcheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BackGroundCheckServiceImpl implements BackgroundcheckService {
    @Autowired
    private BackgroundcheckService BackgroundcheckDAO;



    @Override
    public List<Backgroundcheck> getAllBackground() {

        return BackgroundcheckDAO.getAllBackground();
    }

    @Override
    public void saveBackground(Backgroundcheck theCustomer) {
        BackgroundcheckDAO.saveBackground(theCustomer);
    }

    @Override
    public void deleteBackground(int theId) {
        BackgroundcheckDAO.deleteBackground(theId);
    }
}

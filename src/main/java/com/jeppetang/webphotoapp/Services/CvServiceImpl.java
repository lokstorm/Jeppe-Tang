package com.jeppetang.webphotoapp.Services;

import com.jeppetang.webphotoapp.Models.Cv;
import com.jeppetang.webphotoapp.Repositories.CvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CvServiceImpl implements CvService {

    @Autowired
    CvRepository cvRepository;

    @Override
    public void saveTheCv(Cv cv) {
        cvRepository.saveCv(cv);

    }

    @Override
    public void updateTheCV(Cv cv){
        cvRepository.updateCv(cv);
    }
}

package org.biukhanhhau.learningrestcontroller.service;

import org.biukhanhhau.learningrestcontroller.model.Information;
import org.biukhanhhau.learningrestcontroller.repository.Inforrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InforService {


    @Autowired
    Inforrepo repo;

    public List<Information> findInfors(){
        return repo.findAll();
    }

    public void addInformation(@ModelAttribute Information information){
        // Hàm save() sẽ tự động insert vào DB
        // Và nó tự xử lý luôn việc ID tự tăng (auto increment)
        repo.save(information);
    }

    public Information findInfor(int infoId) {
        return repo.findInfor(infoId);
    }

    public void putInformation(Information information) {
        repo.putInfor(information);
    }

    public void delInfor(int infoId) {
        repo.delInfo(infoId);
    }
}
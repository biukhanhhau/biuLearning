package org.biukhanhhau.loginweb.service;

import org.biukhanhhau.loginweb.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.biukhanhhau.loginweb.repository.InformationRepository;

@Service
public class InformationService {

    @Autowired
    InformationRepository informationRepository;

    public void save(Information information){
        informationRepository.save(information);
    }
    public Information findByUsername(String username){
        return informationRepository.findByUsername(username);
    }
    public Information findByEmail(String email){return informationRepository.findByEmail(email);}


}

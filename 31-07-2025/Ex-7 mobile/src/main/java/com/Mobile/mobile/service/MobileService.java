package com.Mobile.mobile.service;

import com.Mobile.mobile.dto.MobileDto;
import com.Mobile.mobile.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MobileService {

    @Autowired
    private MobileRepository repository;

    public MobileDto createMobile(MobileDto mobile) {
        return repository.save(mobile);
    }

    public MobileDto getMobileById(int id) {
        return repository.findById(id);
    }

    public Collection<MobileDto> getAllMobiles() {
        return repository.findAll();
    }

    public MobileDto updateMobile(MobileDto mobile) {
        return repository.save(mobile); // Updates if ID already exists
    }

    public void deleteMobile(int id) {
        repository.deleteById(id);
    }
}

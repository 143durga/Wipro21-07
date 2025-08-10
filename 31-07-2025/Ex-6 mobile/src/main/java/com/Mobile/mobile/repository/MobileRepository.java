package com.Mobile.mobile.repository;

import com.Mobile.mobile.dto.MobileDto;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MobileRepository {

    private final Map<Integer, MobileDto> mobileStore = new HashMap<>();

    public MobileDto save(MobileDto mobile) {
        mobileStore.put(mobile.getId(), mobile);
        return mobile;
    }

    public MobileDto findById(int id) {
        return mobileStore.get(id);
    }

    public Collection<MobileDto> findAll() {
        return mobileStore.values();
    }

    public void deleteById(int id) {
        mobileStore.remove(id);
    }
}

package com.app.localthservice.service;

import com.app.localthservice.repository.custom.DistrictRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepositoryCustom districtRepositoryCustom;

    @Override
    public List findAll() {
        return districtRepositoryCustom.findAll();
    }

    @Override
    public Object findById(Long id) {
        return districtRepositoryCustom.findById(id).size() > 0 ? districtRepositoryCustom.findById(id).get(0) : null;
    }

    @Override
    public Object findByCode(String code) {
        return districtRepositoryCustom.findByCode(code).size() > 0 ? districtRepositoryCustom.findByCode(code).get(0) : null;
    }
}

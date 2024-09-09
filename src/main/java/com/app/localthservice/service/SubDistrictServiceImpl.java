package com.app.localthservice.service;

import com.app.localthservice.repository.custom.SubDistrictRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubDistrictServiceImpl implements SubDistrictService {

    @Autowired
    private SubDistrictRepositoryCustom subDistrictRepositoryCustom;

    @Override
    public List findAll() {
        return subDistrictRepositoryCustom.findAll();
    }

    @Override
    public Object findById(Long id) {
        return subDistrictRepositoryCustom.findById(id).size() > 0 ? subDistrictRepositoryCustom.findById(id).get(0) : null;
    }

    @Override
    public Object findByCode(String code) {
        return subDistrictRepositoryCustom.findByCode(code).size() > 0 ? subDistrictRepositoryCustom.findByCode(code).get(0) : null;
    }
}

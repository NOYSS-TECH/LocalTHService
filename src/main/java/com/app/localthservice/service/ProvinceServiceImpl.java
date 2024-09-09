package com.app.localthservice.service;

import com.app.localthservice.repository.custom.ProvinceRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepositoryCustom provinceRepositoryCustom;

    @Override
    public List findAll() {
        return provinceRepositoryCustom.findAll();
    }

    @Override
    public Object findById(Long id) {
        return provinceRepositoryCustom.findById(id).size() > 0 ? provinceRepositoryCustom.findById(id).get(0) : null;
    }

    @Override
    public Object findByCode(String code) {
        return provinceRepositoryCustom.findByCode(code).size() > 0 ? provinceRepositoryCustom.findByCode(code).get(0) : null;
    }
}

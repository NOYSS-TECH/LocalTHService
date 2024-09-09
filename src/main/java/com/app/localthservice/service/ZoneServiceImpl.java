package com.app.localthservice.service;

import com.app.localthservice.repository.custom.ZoneRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService{

    @Autowired
    private ZoneRepositoryCustom zoneRepositoryCustom;

    @Override
    public List findAll() {
        return zoneRepositoryCustom.findAll();
    }

    @Override
    public Object findById(Long id) {
        return zoneRepositoryCustom.findById(id).size() > 0 ? zoneRepositoryCustom.findById(id).get(0) : null;
    }

    @Override
    public Object findByCode(String code) {
        return zoneRepositoryCustom.findByCode(code).size() > 0 ? zoneRepositoryCustom.findByCode(code).get(0) : null;
    }
}

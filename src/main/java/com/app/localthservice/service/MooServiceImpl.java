package com.app.localthservice.service;

import com.app.localthservice.repository.custom.MooRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MooServiceImpl implements MooService {

    @Autowired
    private MooRepositoryCustom mooRepositoryCustom;

    @Override
    public List findAll() {
        return mooRepositoryCustom.findAll();
    }

    @Override
    public Object findById(Long id) {
        return mooRepositoryCustom.findById(id).size() > 0 ? mooRepositoryCustom.findById(id).get(0) : null;
    }

    @Override
    public Object findByCode(String code) {
        return mooRepositoryCustom.findByCode(code).size() > 0 ? mooRepositoryCustom.findByCode(code).get(0) : null;
    }
}

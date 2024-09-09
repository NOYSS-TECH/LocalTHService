package com.app.localthservice.repository.custom;

import java.util.List;

public interface ZoneRepositoryCustom {
    List findAll();
    List findById(Long id);
    List findByCode(String code);
}
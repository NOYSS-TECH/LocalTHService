package com.app.localthservice.service;

import java.util.List;

public interface ZoneService {
    List findAll();
    Object findById(Long id);
    Object findByCode(String code);
}

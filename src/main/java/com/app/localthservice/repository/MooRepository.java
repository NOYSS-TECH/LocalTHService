package com.app.localthservice.repository;

import com.app.localthservice.entity.Moo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MooRepository extends JpaRepository<Moo, Long> {
}

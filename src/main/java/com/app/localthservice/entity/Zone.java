package com.app.localthservice.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(initialValue = 1001, name = "generation_id", sequenceName = "seq_zone")
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Zone extends BaseEntity{

    private String code;
    private String nameTh;
    private String nameEn;
}

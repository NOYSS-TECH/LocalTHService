package com.app.localthservice.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@SequenceGenerator(initialValue = 1001, name = "generation_id", sequenceName = "seq_province")
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Province  extends BaseEntity {

    private String code;
    private String nameTh;
    private String nameEn;
    private String zoneCode1;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "province")
    private List<District> districts = new ArrayList<>();
}

package com.app.localthservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@SequenceGenerator(initialValue = 1001, name = "generation_id", sequenceName = "seq_district")
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class District extends BaseEntity{

    private String code;
    private String nameTh;
    private String nameEn;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "district")
    private List<SubDistrict> subDistricts = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "province")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Province province;

}

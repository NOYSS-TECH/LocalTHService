package com.app.localthservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@SequenceGenerator(initialValue = 1001, name = "generation_id", sequenceName = "seq_sub_district")
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SubDistrict extends BaseEntity{

    private String code;
    private String nameTh;
    private String nameEn;
    private String postCodeMain;
    private String postCodeAll;
    private String postCodeRemark;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subDistrict")
    private List<Moo> moos = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private District district;
}

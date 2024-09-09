package com.app.localthservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(initialValue = 1001, name = "generation_id", sequenceName = "seq_moo")
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Moo extends BaseEntity{

    private String code;
    private String mooNo;
    private String nameTh;
    private String nameEn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subDistrict")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private SubDistrict subDistrict;
}

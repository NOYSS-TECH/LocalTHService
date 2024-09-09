package com.app.localthservice.controller.api;

import com.app.localthservice.service.SubDistrictService;
import flexjson.JSONSerializer;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "SubDistrictController", description = "REST Apis related to Sub-District Entity!!!!")
@RestController
@RequestMapping("/api/subDistrict")
public class SubDistrictController {

    @Autowired
    private SubDistrictService subDistrictService;

    @GetMapping
    public String findAll(){
        return new JSONSerializer().serialize(subDistrictService.findAll());
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id){
        return new JSONSerializer().serialize(subDistrictService.findById(id));
    }

    @GetMapping("/findByCode")
    public String findByCode(@RequestParam("code") String code) {
        return new JSONSerializer().serialize(subDistrictService.findByCode(code));
    }
}

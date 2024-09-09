package com.app.localthservice.controller.api;

import com.app.localthservice.service.DistrictService;
import flexjson.JSONSerializer;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "DistrictController", description = "REST Apis related to District Entity!!!!")
@RestController
@RequestMapping("/api/district")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping
    public String findAll() {
        return new JSONSerializer().serialize(districtService.findAll());
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id) {
        return new JSONSerializer().serialize(districtService.findById(id));
    }

    @GetMapping("/findByCode")
    public String findByCode(@RequestParam("code") String code) {
        return new JSONSerializer().serialize(districtService.findByCode(code));
    }
}

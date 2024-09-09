package com.app.localthservice.controller.api;

import com.app.localthservice.service.ProvinceService;
import flexjson.JSONSerializer;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "ProvinceController", description = "REST Apis related to Province Entity!!!!")
@RestController
@RequestMapping("/api/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping
    public String findAll() {
        return new JSONSerializer().serialize(provinceService.findAll());
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id) {
        return new JSONSerializer().serialize(provinceService.findById(id));
    }

    @GetMapping("/findByCode")
    public String findByCode(@RequestParam("code") String code) {
        return new JSONSerializer().serialize(provinceService.findByCode(code));
    }
}

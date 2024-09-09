package com.app.localthservice.controller.api;

import com.app.localthservice.service.ZoneService;
import flexjson.JSONSerializer;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "ZoneController", description = "REST Apis related to Zone Entity!!!!")
@RestController
@RequestMapping("/api/zone")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @GetMapping
    public String findAll(){
        return new JSONSerializer().serialize(zoneService.findAll());
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id){
        return new JSONSerializer().serialize(zoneService.findById(id));
    }

    @GetMapping("/findByCode")
    public String findByCode(@RequestParam("code") String code) {
        return new JSONSerializer().serialize(zoneService.findByCode(code));
    }
}

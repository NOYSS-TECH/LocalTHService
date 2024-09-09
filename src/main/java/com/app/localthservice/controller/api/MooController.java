package com.app.localthservice.controller.api;

import com.app.localthservice.service.MooService;
import flexjson.JSONSerializer;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "MooController", description = "REST Apis related to Moo Entity!!!!")
@RestController
@RequestMapping("/api/moo")
public class MooController {

    @Autowired
    private MooService mooService;

    @GetMapping
    public String findAll() {
        return new JSONSerializer().serialize(mooService.findAll());
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id) {
        return new JSONSerializer().serialize(mooService.findById(id));
    }

    @GetMapping("/findByCode")
    public String findByCode(@RequestParam("code") String code) {
        return new JSONSerializer().serialize(mooService.findByCode(code));
    }
}

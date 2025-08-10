package com.Mobile.mobile.controller;

import com.Mobile.mobile.dto.MobileDto;
import com.Mobile.mobile.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @PostMapping
    public MobileDto createMobile(@RequestBody MobileDto mobile) {
        return mobileService.createMobile(mobile);
    }

    @GetMapping
    public Collection<MobileDto> getAllMobiles() {
        return mobileService.getAllMobiles();
    }

    @GetMapping("/{id}")
    public MobileDto getMobileById(@PathVariable int id) {
        return mobileService.getMobileById(id);
    }

    @PutMapping
    public MobileDto updateMobile(@RequestBody MobileDto mobile) {
        return mobileService.updateMobile(mobile);
    }

    @DeleteMapping("/{id}")
    public String deleteMobile(@PathVariable int id) {
        mobileService.deleteMobile(id);
        return "Mobile deleted successfully!";
    }
}

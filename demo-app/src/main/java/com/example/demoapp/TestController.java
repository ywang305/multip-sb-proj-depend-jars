package com.example.demoapp;

import com.example.demobase.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private MemberRepo memberRepo;


    @GetMapping("/hi")
    public List<?> hi() {

        var list = memberRepo.findAll();
        return list;
    }
}

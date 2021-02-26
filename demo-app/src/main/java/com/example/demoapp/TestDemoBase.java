package com.example.demoapp;


import com.example.demobase.MemberRepo;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Data
public class TestDemoBase {
    private static Logger log = LoggerFactory.getLogger(TestDemoBase.class);
    private MemberRepo memberRepo;

    public TestDemoBase(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;

        log.info(memberRepo.toString());
    }
}

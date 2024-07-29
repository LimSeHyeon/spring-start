package com.example.summer.ocp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OcpServiceTest {

    @Autowired
    OcpService ocpService;

    @Test
    public void testOcpService() {


        // 개발자
//        OcpARepository ocpARepository = new OcpARepository();
//        OcpBRepository ocpBRepository = new OcpBRepository();
//        OcpService ocpService = new OcpService(ocpARepository);


        ocpService.callMethod1();
        ocpService.callMethod2();
    }
}
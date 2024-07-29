package com.example.summer.ocp;

import org.springframework.stereotype.Component;

@Component
public class OcpBRepository implements OcpRepository {

    @Override
    public void method1() {
        System.out.println("OcpBmethod1");
    }

    @Override
    public void method2() {
        System.out.println("OcpBmethod2");
    }
}

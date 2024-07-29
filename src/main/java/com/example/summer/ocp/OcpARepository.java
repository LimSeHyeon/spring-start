package com.example.summer.ocp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class OcpARepository implements OcpRepository {
    @Override
    public void method1() {
        System.out.println("OcpAmethod1");
    }

    @Override
    public void method2() {
        System.out.println("OcpAmethod2");
    }
}

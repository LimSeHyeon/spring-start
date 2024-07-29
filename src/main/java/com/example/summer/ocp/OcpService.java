package com.example.summer.ocp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OcpService {

    /*
    OcpARepository를 쓰다가
    OcpBRepository로 바꾸고 싶음 !
    (두 Repository가 같은 기능을 한다)

    void method1() : "OcpAmethod1" "OcpBmethod1"
    void method2() : "OcpAmethod2" "OcpBmethod2"

    => OcpService의 코드는 변경되지 앟ㄴ고
       OcpRepository들을 바꿔서 쓸 수 있게
     */

    @Autowired
    OcpRepository ocpRepository;

//    public OcpService(OcpRepository ocpRepository) {
//        this.ocpRepository = ocpRepository;
//    }


    public void callMethod1() {
        ocpRepository.method1();
    }

    public void callMethod2() {
        ocpRepository.method2();
    }
}

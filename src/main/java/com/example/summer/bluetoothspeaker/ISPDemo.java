package com.example.summer.bluetoothspeaker;

interface AInterface {
    void methodA();
}

interface BInterface {
    void methodB();
}

class ImplA implements AInterface {

    @Override
    public void methodA() {
        System.out.println("implA");
    }
}

class ImplB implements BInterface {

    @Override
    public void methodB() {
        System.out.println("implB");
    }
}

public class IspDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }

    public static void ispMethod(ImplA implA) {
        implA.methodA();
    }

    public static void ispMethod(ImplB implB) {
        implB.methodB();
    }
}
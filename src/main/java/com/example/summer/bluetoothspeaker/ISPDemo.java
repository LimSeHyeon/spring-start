package com.example.summer.bluetoothspeaker;

interface MainInterface {
    void methodA();
    void methodB();
}

class ImplA implements MainInterface{

    @Override
    public void methodA() {
        System.out.println("implA");
    }

    @Override
    public void methodB() {
        // 안 쓰고 싶은디..?
    }
}

class ImplB implements MainInterface {

    @Override
    public void methodA() {
        // 안 쓰고 싶은디..?
    }

    @Override
    public void methodB() {
        System.out.println("implB");
    }
}

class IspDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }

    public static void ispMethod(MainInterface mainInterface) {

    }
}
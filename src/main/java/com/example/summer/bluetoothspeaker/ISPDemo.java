package com.example.summer.bluetoothspeaker;

interface ABInterface {

}

interface AInterface extends ABInterface {
    void methodA();
}

interface BInterface extends ABInterface {
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

public class ISPDemo {
    public static void main(String[] args) {
        ispMethod(new ImplA());
        ispMethod(new ImplB());
    }

    public static void ispMethod(ABInterface abInterface) {
        if(abInterface instanceof AInterface) ((AInterface)abInterface).methodA();
        else if (abInterface instanceof BInterface) ((BInterface)abInterface).methodB();
    }
}
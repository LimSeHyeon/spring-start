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

        GenericIsp<AInterface> genericIspA = new GenericIsp<>();
        genericIspA.ispMethod(new ImplA());

        GenericIsp<BInterface> genericIspB = new GenericIsp<>();
        genericIspB.ispMethod(new ImplB());
    }
}

    class GenericIsp<T> {
    public void ispMethod(T abInterface) {
        if(abInterface instanceof AInterface) ((AInterface)abInterface).methodA();
        else if (abInterface instanceof BInterface) ((BInterface)abInterface).methodB();
    }
}
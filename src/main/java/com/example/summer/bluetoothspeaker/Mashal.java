package com.example.summer.bluetoothspeaker;

public class Mashal implements BluetoothSpeaker, AISpeaker, Speaker {

    @Override
    public void connectBluetooth() {
        System.out.println("블루투스에 연결됩니다.");
    }

    @Override
    public void disconnectBluetooth() {
        System.out.println("연결을 해제합니다.");
    }

    @Override
    public void heyGoogle() {
        System.out.println("넹 저는 구글이에여");
    }

    @Override
    public void turnOn() {
        System.out.println("띠리리링");
    }

    @Override
    public void turnOff() {
        System.out.println("띠로리로");
    }

    @Override
    public void volumeUp() {
        System.out.println("소리를 키워보자 !");
    }

    @Override
    public void volumeDown() {
        System.out.println("소리를 줄여보자");
    }
}

package com.llll;

public class Lab3 implements Lab2{

    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨 조절");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("체널 바꿈");
    }
}

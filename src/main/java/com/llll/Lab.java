package com.llll;

public class Lab {
    public static void main(String[] args) {
        Lab2 l = new Lab3();    // 인터페이스 사용 가능, Lab3(클래스)는 Lab2(인터페이스)이다.
        l.turnOn();
        l.turnOff();
        l.changeVolume(30);
        l.changeChannel(7);
    }
}

/*
List : 데이터 넣을 때 편하다. 자동 라벨링
List : 데이터 가져올 땐 불편하다.

Map<String, Integer> agesMap = new HashMap<>();
agesMap.put("철수",20);
agesMap.put("영희", 40);
agesMap.put("영수", 50);
agesMap.put("철희", 60);

agesMap.get("영수");
agesMap.remove("철수");

Map : 데이터 넣을 땐 불편하다. 수동 라벨링
*/

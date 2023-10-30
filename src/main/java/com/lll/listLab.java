package com.lll;

import java.util.ArrayList;

public class listLab {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // 리스트에 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        System.out.println("삭제 전 리스트: " + list);

        // 인덱스를 사용하여 요소 삭제
        list.remove(2); // "Orange" 삭제
        System.out.println("인덱스를 사용하여 삭제 후 리스트: " + list);

        // 객체를 사용하여 요소 삭제
        list.remove("Banana");
        System.out.println("객체를 사용하여 삭제 후 리스트: " + list);

        // 조건에 따라 요소 삭제
        list.removeIf(fruit->fruit.startsWith("A"));
        System.out.println("조건에 따라 삭제 후 리스트: " + list);
    }
}
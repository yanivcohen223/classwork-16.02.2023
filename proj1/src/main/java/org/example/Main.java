package org.example;

import lombok.Getter;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AndroidDevice.setOsVersion(4.4f);
        System.out.println(AndroidDevice.getLatestOsVersion());
        
        AndroidDevice S21 = new AndroidDevice(5000);
        AndroidDevice S22 = new AndroidDevice(6000);
        AndroidDevice S23 = new AndroidDevice(7000);

        System.out.println(S23);

        AndroidDevice.setOsVersion(6.0f);
        System.out.println(AndroidDevice.getLatestOsVersion());

        System.out.println(S22);

        Phone p1 = new Phone(5.5, "white");
        System.out.println(p1);

        Android p2 = new Android(5.9);
        System.out.println(p2);
    }
}
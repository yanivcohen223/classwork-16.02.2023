package org.example;

import lombok.Getter;
import lombok.Setter;


public class AndroidDevice {
    @Getter @Setter    private static float latestOsVersion;

    @Getter private   final int price;

    private int batteryPercentage = 50;



/*  public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }*/
/*
    public int getPrice() {
        return price;
    }
*/
    public static float getOsVersion() {
        return latestOsVersion;
    }

    public static void setOsVersion(float osVersion) {
        AndroidDevice.latestOsVersion = osVersion;
    }

    public static String getLatestOsVersion() {
        switch (String.valueOf(latestOsVersion)) {
            case "4.4":
                return "kitKat";
            case "5.1":
                return "Lollipop";

            case "6.0":
                return "Marshmello";
        }
        return null;
    }
    public AndroidDevice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "AndroidDevice{" +
                "price=" + price +
                ", batteryPercentage=" + batteryPercentage + "% "+
               ",latest OS=" + latestOsVersion +
                '}';
    }
}

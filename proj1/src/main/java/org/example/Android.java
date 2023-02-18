package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class Android extends Phone{
    private double osVersion;

    public Android(double osVersion) {
        this (6.5, osVersion);
    }
    public Android(double size, double osVersion) {
        this (size, "black", osVersion);
    }

    public Android(double size, String color, double osVersion) {
        super(size, color);
        this.osVersion = osVersion;
    }
    @Override
    public String toString() {
        return "Android{" +
                super.toString() +
                " osVersion=" + osVersion +
                '}';
    }
}

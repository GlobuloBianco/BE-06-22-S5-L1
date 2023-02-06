package com.riccardodegni.W4L1.week4_lesson1.config_bean;

public class AmericanPhone extends Phone {
	private final String prefix = "+1";
    
    public AmericanPhone(String number) {
        this.number = prefix + number;
    }
}

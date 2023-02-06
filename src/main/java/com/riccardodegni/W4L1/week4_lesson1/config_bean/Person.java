package com.riccardodegni.W4L1.week4_lesson1.config_bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String fullName;
    private Address address;
    private Phone phone;
 
}

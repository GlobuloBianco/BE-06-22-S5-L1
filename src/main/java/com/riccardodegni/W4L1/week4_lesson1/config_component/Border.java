package com.riccardodegni.W4L1.week4_lesson1.config_component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
@Component("border")
@Scope("prototype")
public class Border {
	private int borderWidth;
	private String borderColor;
}

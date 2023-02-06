package com.riccardodegni.W4L1.week4_lesson1.config_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration1 {

	// crea un bean di tipo Box
	@Bean
	@Scope("prototype")
	public Box box() {
		return new Box(30, 20);
	}
	
	// crea un bean di tipo Box parametrizzato
	@Bean
	@Scope("prototype")
	public Box box_2(int x, int y) {
		return new Box(x, y);
	}
	
	private int propX = 120;
	private int propY = 45;
	@Bean
	public Box box_3() {
		return new Box(propX, propY);
	}
	
}

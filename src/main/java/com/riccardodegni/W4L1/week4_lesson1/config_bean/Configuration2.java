package com.riccardodegni.W4L1.week4_lesson1.config_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration2 {

	/*
	 * Mario Rossi
	 */
	@Bean
	public Address address1() {
		return new Address("Via Ciao 10, Milano");
	}
	
	@Bean
	public Phone phone1() {
		return new ItalianPhone("3337778899");
	}
	
	@Bean
	public Person person1() {
		return new Person( "Mario Rossi", address1(), phone1() );
	}
	/*
	 * END Mario Rossi
	 */
	
	/*
	 * Luigi Verdi
	 */
	@Bean
	public Address address2() {
		return new Address("Via Alberi 20, Roma");
	}
	
	@Bean
	public Phone phone2Italian() {
		return new ItalianPhone("3331110022");
	}
	
	@Bean
	public Phone phone2American() {
		return new AmericanPhone("3331110022");
	}
	
	@Bean
	public Person person2() {
		return new Person( "Luigi Verdi", address2(), phone2American() );
	}
	/*
	 * END Luigi Verdi
	 */
	
}

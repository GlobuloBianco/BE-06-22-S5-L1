package com.riccardodegni.W4L1.week4_lesson1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riccardodegni.W4L1.week4_lesson1.config_bean.Box;
import com.riccardodegni.W4L1.week4_lesson1.config_bean.Configuration1;
import com.riccardodegni.W4L1.week4_lesson1.config_bean.Configuration2;
import com.riccardodegni.W4L1.week4_lesson1.config_bean.Person;
import com.riccardodegni.W4L1.week4_lesson1.config_component.Border;
import com.riccardodegni.W4L1.week4_lesson1.config_component.Box2;
import com.riccardodegni.W4L1.week4_lesson1.config_component.Box3;

@SpringBootApplication
public class Week4Lesson1Application {

	public static void main(String[] args) {
		SpringApplication.run(Week4Lesson1Application.class, args);
		
		//configWith_Beans();
		//configWith_Beans2();
		//configWith_XML();
		configWith_Components();
		
	}
	
	public static void configWith_Beans() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration1.class);
		
		// recupero beans
		Box b1 = (Box)ctx.getBean("box");
		System.out.println( "area di b1: " + b1.getArea() );
		
		Box b2 = (Box)ctx.getBean("box");
		b2.setX(0);
		System.out.println( "area di b1: " + b1.getArea() );
		
		Box b3 = (Box)ctx.getBean("box_2", 10, 5);
		System.out.println( "area di b3: " + b3.getArea() );
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
	
	public static void configWith_Beans2() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration2.class);
		
		Person p1 = (Person)ctx.getBean("person1");
		Person p2 = (Person)ctx.getBean("person2");
		
		Person[] people = { p1, p2 };
		
		Scanner in = new Scanner(System.in);
		System.out.println( "Dammi nome persona da ricercare:" );
		String n = in.nextLine();
		boolean found = false;
		
		for(Person person : people) {
			if( person.getFullName().equals(n) ) {
				found = true;
				System.out.println(person);
				break;
			}
		}
		
		if( !found ) {
			System.out.println("Nessun persona trovata con il nome " + n);
		}
		
		in.close();
		
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
	
	public static void configWith_XML() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Box b1 = (Box)ctx.getBean("box_1");
		System.out.println( b1.getArea() );
		
		Box b2 = (Box)ctx.getBean("box_2");
		System.out.println( b2.getArea() );
		
		Person p1 = (Person)ctx.getBean("p1");
		System.out.println(p1);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
	
	public static void configWith_Components() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.riccardodegni.W4L1.week4_lesson1.config_component");
		ctx.refresh();
		
		Box2 b1 = (Box2)ctx.getBean("box2", 10, 4);
		System.out.println( b1.getArea() );
		
		Border border1 = (Border)ctx.getBean("border", 10, "blue");
		Box3 b2 = (Box3)ctx.getBean("box3", 10, 4, border1);
		System.out.println( b2 );
		
		ctx.close();
	}

}

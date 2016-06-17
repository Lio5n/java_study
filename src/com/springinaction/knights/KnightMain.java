package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"META-INF/spring/knights.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}

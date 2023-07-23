package com.hxwang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <H1> Test </H1>
 * <p>  </p>
 * <p>
 * 创建日期: 2023/7/9 <p>
 * 创建时间: 19:25
 *
 * @author hxwang
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) cs.getBean("person");
		System.out.println(person);
		System.out.println("222");

	}
}

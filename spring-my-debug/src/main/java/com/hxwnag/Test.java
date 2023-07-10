package com.hxwnag;

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
		ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext();
		Person person = (Person) cs.getBean("Person");
		System.out.println("222");

	}
}

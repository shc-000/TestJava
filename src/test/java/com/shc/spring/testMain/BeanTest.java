package com.shc.spring.testMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shc.spring.service.Person;
/**
 * @author shc
 */
public class BeanTest
{
	public static void main(String[] args)throws Exception
	{
		// 创建Spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// 获取chinese 实例
		Person p = ctx.getBean("chinese" , Person.class);
		// 调用useAxe()方法
		p.useAxe();
		p.getName();
		p.getAge();
	}
}
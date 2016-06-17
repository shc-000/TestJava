package com.shc.spring.service.impl;

import com.shc.spring.service.*;
/**
 * @author shc
 *
 */
public class Chinese implements Person
{
	private Axe axe;
	
	private String name;
	
	private Integer age;
	
	// 设值注入所需的setter方法
	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}
	
	//如果注释掉set方法，就无法完成注入
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	
	
	public void getAge() {
		System.out.println("我的年龄：永远"+age+"岁");
	}

	
	public void getName() {
		System.out.println("我的昵称："+name);
	}
	// 实现Person接口的useAxe方法
	public void useAxe()
	{
		// 调用axe的chop()方法，
		// 表明Person对象依赖于axe对象
		System.out.println(axe.chop());
	}
}
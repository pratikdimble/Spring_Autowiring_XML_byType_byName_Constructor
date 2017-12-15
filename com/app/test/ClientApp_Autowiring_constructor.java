package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee_cnstr;

public class ClientApp_Autowiring_constructor {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
		ApplicationContext ctx=new ClassPathXmlApplicationContext(
									"com/app/cfg/Springconfig_Autowiring_constructor.xml");
		Employee_cnstr e=(Employee_cnstr)ctx.getBean("emp");
			System.out.println(e);
	}

}

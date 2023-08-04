package com.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//config is for dipspatch servlet


@Configuration
@ComponentScan({ "com.telusko" }) // get package
public class TeluskoConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		System.out.println("ada"+vr);
		return vr;
		
	}
}

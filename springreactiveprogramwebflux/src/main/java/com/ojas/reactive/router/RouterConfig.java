package com.ojas.reactive.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.ojas.reactive.handler.CustomHandler;

@Configuration
public class RouterConfig {
	
	@Autowired
	private CustomHandler customHandler;
	
	@Bean
	public RouterFunction<ServerResponse> routerFunction(){
		
		return RouterFunctions.route().GET("/routeer/customer" ,customHandler::loadCustomer)
				.GET("/routeer/custome/{name}" ,customHandler::getcus)
				.POST("/routeer/custome/save" ,customHandler::saveCustomer)
				.build();
	}

	//GET("/routeer/customer" ,customHandler::loadCustomer);
}

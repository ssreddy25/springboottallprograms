package com.ojas.reactive.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.ojas.reactive.dao.CustomerDao;
import com.ojas.reactive.dto.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomHandler {

	@Autowired
	private CustomerDao customerDao;

	public Mono<ServerResponse> loadCustomer(ServerRequest request) {

		Flux<Customer> customerList = customerDao.customerList();

		return ServerResponse.ok().body(customerList, Customer.class);

	}

	public Mono<ServerResponse> getcus(ServerRequest request) {
		
		int cusId =Integer.valueOf(request.pathVariable("name"));

		Mono<Customer> customerList = customerDao.customerList().filter(i->i.getId()==cusId).next();

		return ServerResponse.ok().body(customerList, Customer.class);

	}
	

	public Mono<ServerResponse> saveCustomer(ServerRequest request) {
		Mono<Customer> bodyToMono = request.bodyToMono(Customer.class);
		Mono<String> map = bodyToMono.map(s->s.getId() +":"+s.getName());
		
		return ServerResponse.ok().body(map, String.class);
	}

}

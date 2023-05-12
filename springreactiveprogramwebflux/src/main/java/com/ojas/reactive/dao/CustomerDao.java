package com.ojas.reactive.dao;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.ojas.reactive.dto.Customer;

import reactor.core.publisher.Flux;

@Component
public class CustomerDao {

	public static void sleepeception(int i) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Customer> getCustomer() {

		return IntStream.range(1, 50).peek(CustomerDao::sleepeception).peek(System.out::println)
				.mapToObj(i -> new Customer(i, "customer" + i)).collect(Collectors.toList());

	}

	public Flux<Customer> fluxCustomer() {

		return Flux.range(1, 50).delayElements(Duration.ofSeconds(1))
				.doOnNext(i -> System.out.println("processing time" + i)).map(i -> new Customer(i, "customer" + i));

	}

	public Flux<Customer> customerList() {

		return Flux.range(1, 50).
				doOnNext(i -> System.out.println("processing time" + i))
				.map(i -> new Customer(i, "customer" + i));

	}

}

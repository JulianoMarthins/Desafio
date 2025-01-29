package com.devSuperior.Desafio;

import com.devSuperior.Desafio.entities.Order;
import com.devSuperior.Desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.NumberFormat;
import java.util.Locale;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {



	@Autowired
	OrderService orderService = new OrderService();

	Order order1 = new Order(1034, 150.00, 20.0);
	Order order2 = new Order(2282, 800.00, 10.00);
	Order order3 = new Order(1309, 95.90, 0.0);

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nProgramado por JulianoMarthins\n");
		System.out.println("   Lista de pedidos");

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("Pedido código: %d\nValor Total: R$ %.2f%n", order1.getCode(), orderService.orderService(order1));

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("Pedido código: %d\nValor Total: R$ %.2f%n", order2.getCode(), orderService.orderService(order2));

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("Pedido código: %d\nValor Total: R$ %.2f%n", order3.getCode(), orderService.orderService(order3));

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}

package com.femcoders.monstershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonstershopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonstershopApplication.class, args);
	}

}

//hacer el review request (dtos) que reciba además de los 3 campos (productId, username, body, rating)
//en servicio recuperar ese id, buscar el producto por ese id y setear ese producto, añadir a la review (setProduct) y guardar la review


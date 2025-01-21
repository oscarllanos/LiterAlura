package com.oscarllanos.LiterarAlura;

import com.oscarllanos.LiterarAlura.principal.Principal;
import com.oscarllanos.LiterarAlura.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterarAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterarAluraApplication.class, args);
	}

	@Autowired
	private MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}
}

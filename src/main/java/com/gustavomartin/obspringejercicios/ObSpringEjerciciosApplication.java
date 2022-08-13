package com.gustavomartin.obspringejercicios;

import com.gustavomartin.obspringejercicios.entity.Laptop;
import com.gustavomartin.obspringejercicios.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjerciciosApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(ObSpringEjerciciosApplication.class, args);
		LaptopRepository repository=context.getBean(LaptopRepository.class);

		Laptop laptop1=new Laptop(null, "Dell", "Inspiron", "Intel i7", 16, 512, 878.99 );
		Laptop laptop2=new Laptop(null, "Asus", "E410MA", "Celeron N4020", 4, 64, 299.00 );
		repository.save(laptop1);
		repository.save(laptop2);

	}

}

package ejerciciosSpringOpenBootcamp.ejercicioSession4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ejerciciosSpringOpenBootcamp.ejercicioSession4.entities.Laptop;
import ejerciciosSpringOpenBootcamp.ejercicioSession4.repositories.LaptopRepository;

@SpringBootApplication
public class EjercicioSession4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioSession4Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop = new Laptop(null, "Legion", "Lenovo", 8);
		Laptop laptop2 = new Laptop(null, "Inspiron", "Dell", 16);
		Laptop laptop3 = new Laptop(null, "Smart R33", "Acer", 4);

		repository.save(laptop);
		repository.save(laptop2);
		repository.save(laptop3);

	}

	

	



}

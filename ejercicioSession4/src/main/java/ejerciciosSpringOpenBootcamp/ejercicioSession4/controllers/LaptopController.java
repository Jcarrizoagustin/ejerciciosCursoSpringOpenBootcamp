package ejerciciosSpringOpenBootcamp.ejercicioSession4.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ejerciciosSpringOpenBootcamp.ejercicioSession4.repositories.LaptopRepository;
import ejerciciosSpringOpenBootcamp.ejercicioSession4.entities.Laptop;
@RestController
public class LaptopController {
  
  private LaptopRepository repository;

  public LaptopController(LaptopRepository repository){
    this.repository = repository;
  }

  @GetMapping("/laptops")
  public List<Laptop> findLaptops(){
    return repository.findAll();
  }

  @PostMapping("/laptops")
  public Laptop createLaptop(@RequestBody Laptop laptop){
    return repository.save(laptop);
  }
}

package ejerciciosSpringOpenBootcamp.ejercicioSession4.controllers;

import java.util.List;
import java.util.Optional;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ejerciciosSpringOpenBootcamp.ejercicioSession4.repositories.LaptopRepository;
import ejerciciosSpringOpenBootcamp.ejercicioSession4.entities.Laptop;
@RestController
public class LaptopController {
  
  private LaptopRepository repository;

  public LaptopController(LaptopRepository repository){
    this.repository = repository;
  }

  //Obtener todas las laptops
  @GetMapping("/api/laptops")
  @ApiOperation("Obtener todas las laptops")
  public ResponseEntity<List<Laptop>> findLaptops(){
    List<Laptop> laptops= repository.findAll();
    return ResponseEntity.ok(laptops);
  }


  //Obtener laptop por id
  @GetMapping("/api/laptops/{id}")
  @ApiOperation("Obtener una laptop por id")
  public ResponseEntity<Laptop> findLaptopById(@PathVariable Long id) {
    Optional<Laptop> laptop = repository.findById(id);
    if(laptop.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(laptop.get());
  }

  //Crear una laptop
  @PostMapping("/api/laptops")
  @ApiOperation("Crear una laptop")
  public ResponseEntity<Laptop> createLaptop(@RequestBody Laptop laptop){
    if(laptop.getId() != null ) {
      return ResponseEntity.badRequest().build();
    }
    Laptop result = repository.save(laptop);
    return ResponseEntity.ok(result);
  }



  //Actualizar una laptop

  @PutMapping("/api/laptops")
  @ApiOperation("Actualizar una laptop")
  public ResponseEntity<Laptop> updateLaptop(@RequestBody Laptop laptop){
    if(laptop.getId() == null){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    if(!repository.existsById(laptop.getId())){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    Laptop result = repository.save(laptop);
    return ResponseEntity.status(HttpStatus.ACCEPTED).build();
  }

  //Eliminar todas las laptops
  @DeleteMapping("/api/laptops")
  @ApiOperation("Eliminar todas las laptops")
  public ResponseEntity<Laptop> deleteAllLaptops(){
    if(repository.count() == 0){
      return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    repository.deleteAll();
    return ResponseEntity.ok().build();
  }

  //Eliminar una laptop por id
  @DeleteMapping("/api/laptops/{id}")
  @ApiOperation("Eliminar una laptop por id")
  public ResponseEntity<Laptop> deleteLaptopById(@PathVariable Long id){
    if(!repository.existsById(id)){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    repository.deleteById(id);
    return ResponseEntity.ok().build();
  }
}

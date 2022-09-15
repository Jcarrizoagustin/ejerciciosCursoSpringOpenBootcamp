package ejerciciosSpringOpenBootcamp.ejercicioSession4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String model;
  private String brand;
  private Integer ramMemory;
  
  public Laptop(){
    
  }

  public Laptop(Long id, String model, String brand, Integer ramMemory){
    this.id = id;
    this.model = model;
    this.brand = brand;
    this.ramMemory = ramMemory;
  }

  public String getBrand() {
    return brand;
  }

  public Long getId() {
    return id;
  }

  public String getModel() {
    return model;
  }

  public Integer getRamMemory() {
    return ramMemory;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setRamMemory(Integer ramMemory) {
    this.ramMemory = ramMemory;
  }

  
}
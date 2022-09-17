package ejerciciosSpringOpenBootcamp.ejercicioSession4.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ApiModel("Clase Laptop, representa una Notebook")
public class Laptop {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty("Representa el id, tipo Long")
  private Long id;
  @ApiModelProperty("Representa el modelos de la notebook")
  private String model;
  @ApiModelProperty("Representa la marca de la notebook")
  private String brand;
  @ApiModelProperty("Representa la cantidad de memoria ram que tiene incorporada")
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
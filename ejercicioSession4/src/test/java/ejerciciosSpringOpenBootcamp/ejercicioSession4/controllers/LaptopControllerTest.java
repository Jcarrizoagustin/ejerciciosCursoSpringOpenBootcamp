package ejerciciosSpringOpenBootcamp.ejercicioSession4.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ejerciciosSpringOpenBootcamp.ejercicioSession4.entities.Laptop;
import ejerciciosSpringOpenBootcamp.ejercicioSession4.repositories.LaptopRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class LaptopControllerTest {

  Laptop laptop1 = new Laptop(null, "Legion", "Lenovo", 8);
  Laptop laptop2 = new Laptop(null, "Inspiron", "Dell", 16);
  Laptop laptop3 = new Laptop(null, "Smart R33", "Acer", 4);

  @Test
  void findLaptops() {


  }

  @Test
  void findLaptopById() {

  }


  @Test
  void createLaptop() {
  }

  @Test
  void updateLaptop() {
  }

  @Test
  void deleteAllLaptops() {
  }

  @Test
  void deleteLaptopById() {
  }
}
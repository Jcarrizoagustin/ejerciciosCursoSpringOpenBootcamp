package ejerciciosSpringOpenBootcamp.ejercicioSession4.controllers;

import ejerciciosSpringOpenBootcamp.ejercicioSession4.entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

  private TestRestTemplate restTemplate;

  @Autowired
  private RestTemplateBuilder templateBuilder;

  @LocalServerPort
  private int port;

  @BeforeEach
  void setUp() {
    templateBuilder = templateBuilder.rootUri("http://127.0.0.1" + port);
    restTemplate = new TestRestTemplate(templateBuilder);
  }

  @Test
  void findLaptops() {
    ResponseEntity<Laptop[]> response = restTemplate.getForEntity("/api/laptops", Laptop[].class);

    assertEquals(HttpStatus.OK, response.getStatusCode());


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
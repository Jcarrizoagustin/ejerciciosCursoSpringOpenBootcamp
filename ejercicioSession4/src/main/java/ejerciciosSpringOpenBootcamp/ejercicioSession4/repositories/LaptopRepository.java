package ejerciciosSpringOpenBootcamp.ejercicioSession4.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ejerciciosSpringOpenBootcamp.ejercicioSession4.entities.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{
  
}

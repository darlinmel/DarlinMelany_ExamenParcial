package darlinmascotas.example.darlinmascotas.demo.VentaDarlin;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VentaDarlinRepository extends CrudRepository<VentaDarlin, Long>{
    List <VentaDarlin> findAll();
}

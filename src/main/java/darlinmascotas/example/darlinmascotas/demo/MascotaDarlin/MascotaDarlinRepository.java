package darlinmascotas.example.darlinmascotas.demo.MascotaDarlin;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MascotaDarlinRepository extends CrudRepository <MascotaDarlin, Long> {
    List <MascotaDarlin> findAll();
}

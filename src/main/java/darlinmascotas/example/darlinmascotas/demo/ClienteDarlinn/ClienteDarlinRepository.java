package darlinmascotas.example.darlinmascotas.demo.ClienteDarlinn;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDarlinRepository extends CrudRepository<ClienteDarlin, Long> {
    List<ClienteDarlin> findAll();

     @Modifying
    @Query("DELETE FROM ClienteDarlin r WHERE r.nombre = ?1")
    void deleteByNombre(String nombre);
}

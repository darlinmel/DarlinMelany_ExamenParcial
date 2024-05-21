package darlinmascotas.example.darlinmascotas.demo.VentaDarlin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaDarlinService 
{
      @Autowired
    private VentaDarlinRepository ventaDarlinRepository;

    // Método create
    public VentaDarlin save(VentaDarlin entity) {
        return ventaDarlinRepository.save(entity);
    }

    // Método select by Id
    public VentaDarlin findById(Long id) {
        return ventaDarlinRepository.findById(id).orElse(null);
    }

    // Método delete by Id
    public void deleteById(Long id) {
        ventaDarlinRepository.deleteById(id);
    }

    // Método select all
    public List<VentaDarlin> findAll() {
        return ventaDarlinRepository.findAll();
    }
}

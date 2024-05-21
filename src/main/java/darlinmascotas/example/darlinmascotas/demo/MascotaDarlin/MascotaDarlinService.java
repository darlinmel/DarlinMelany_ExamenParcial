package darlinmascotas.example.darlinmascotas.demo.MascotaDarlin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaDarlinService 
{
     @Autowired
    private MascotaDarlinRepository companiaRepository;

    // Metodo Create

    public MascotaDarlin save(MascotaDarlin entity)
    {
        return companiaRepository.save(entity);
    }

    // Metodo select by ID

    public MascotaDarlin findById(Long id)
    {
        return companiaRepository.findById(id).orElse(null);
    }

    //Metodo delete by Id

    public void deleteById(Long id)
    {
        companiaRepository.deleteById(id);
    }

    //Metodo selec all

    public List<MascotaDarlin> findAll()
    {
        return companiaRepository.findAll();    
    } 
}

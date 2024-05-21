package darlinmascotas.example.darlinmascotas.demo.VentaDarlin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/")
public class VentaDarlinController 
{
     @Autowired
    private VentaDarlinService ventasService;

    //Api create
    @PostMapping(value = "ventas")
    public VentaDarlin save(@RequestBody VentaDarlin entity)
    {
        return ventasService.save(entity);
    }

    //Api find by Id
    @GetMapping(value = "ventas/{id}")
    public VentaDarlin findById(@PathVariable Long id){
    return ventasService.findById(id);
    }

    //Api update
    @PutMapping(value = "ventas")
    public VentaDarlin update(@RequestBody VentaDarlin entity){
        return ventasService.save(entity);
    }

    //Api delete
    @DeleteMapping(value = "ventas/{id}")
    public void delete(@PathVariable Long id){
        ventasService.deleteById(id);
    }

    //Api select All
    @GetMapping(value = "ventas")
    public List<VentaDarlin> findAll(){
      return ventasService.findAll();
    }
}

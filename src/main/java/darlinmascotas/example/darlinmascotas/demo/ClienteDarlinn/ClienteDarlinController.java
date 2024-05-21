package darlinmascotas.example.darlinmascotas.demo.ClienteDarlinn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/api/")
public class ClienteDarlinController 
{
      @Autowired
    private ClienteDarlinService consultorioService;

    //Api create
    @PostMapping("cliente")
    public ClienteDarlin save(@RequestBody ClienteDarlin entity)
    {
        return consultorioService.save(entity);
    }

    //Api find by Id
    @GetMapping("cliente/{id}")
    public ClienteDarlin findById(@PathVariable Long id){
    return consultorioService.getById(id);
    }

    //Api update
    @PutMapping("cliente")
    public ClienteDarlin update(@RequestBody ClienteDarlin entity){
        return consultorioService.save(entity);
    }

    //Api delete
    @DeleteMapping("cliente/{id}")
    public void delete(@PathVariable Long id){
        consultorioService.deleteById(id);
    }

    //Api select All
    @GetMapping("cliente")
    public List<ClienteDarlin> findAll(){
      return consultorioService.findAll();
    }

    //update by id
    @PutMapping (value= "cliente/{id}")
    public ResponseEntity <ClienteDarlin> updatById(@PathVariable Long id, @RequestBody ClienteDarlin entity){
        return consultorioService.updateById(id, entity);
    }

    @DeleteMapping("/nombre/{nombre}")
    public void DeleteByNombre(@PathVariable String nombre) {
        consultorioService.DeleteByNombre(nombre);
    }
}

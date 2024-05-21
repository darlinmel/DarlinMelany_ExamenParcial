package darlinmascotas.example.darlinmascotas.demo.MascotaDarlin;

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
public class MascotaDarlinController 
{
        @Autowired
    private MascotaDarlinService mascotaDarlinService;

    // API create
    @PostMapping(value = "mascotas")
    public MascotaDarlin save(@RequestBody MascotaDarlin entity) {
        return mascotaDarlinService.save(entity);
    }

    // API find by Id
    @GetMapping(value = "mascotas/{id}")
    public MascotaDarlin findById(@PathVariable("id") Long id) {
        return mascotaDarlinService.findById(id);
    }

    // API update
    @PutMapping(value = "mascotas")
    public MascotaDarlin update(@RequestBody MascotaDarlin entity) {
        return mascotaDarlinService.save(entity);
    }

    // API delete
    @DeleteMapping(value = "mascotas/{id}")
    public void delete(@PathVariable Long id) {
        mascotaDarlinService.deleteById(id);
    }

    // API select All
    @GetMapping(value = "mascotas")
    public List<MascotaDarlin> findAll() {
        return mascotaDarlinService.findAll();
    }
}

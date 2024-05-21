package darlinmascotas.example.darlinmascotas.demo.ClienteDarlinn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ClienteDarlinService 
{
      @Autowired
    private ClienteDarlinRepository clienteRepository;

    // Método create
    public ClienteDarlin save(ClienteDarlin entity) {
        return clienteRepository.save(entity);
    }

    // Método select by Id
    public ClienteDarlin getById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Método delete by Id
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    // Método select all
    public List<ClienteDarlin> findAll() {
        return clienteRepository.findAll();
    }

    public void DeleteByNombre (String nombre){
        clienteRepository.deleteByNombre(nombre);
    }

    // Update
    public ResponseEntity<ClienteDarlin> updateById(Long id, ClienteDarlin clienteActualizado) {
        try {
            // Verificar si el cliente con el ID dado existe en la base de datos
            ClienteDarlin clienteExistente = getById(id);
            if (clienteExistente == null) {
                return ResponseEntity.notFound().build();
            }

            // Actualizar los campos del cliente existente con los valores del cliente actualizado
            if (clienteActualizado.getNombre() != null) {
                clienteExistente.setNombre(clienteActualizado.getNombre());
            }

            if (clienteActualizado.getUbicacion() != null) {
                clienteExistente.setUbicacion(clienteActualizado.getUbicacion());
            }

            // Guardar los cambios en la base de datos
            ClienteDarlin clienteGuardado = save(clienteExistente);
            return ResponseEntity.ok(clienteGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

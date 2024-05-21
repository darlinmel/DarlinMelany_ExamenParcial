package darlinmascotas.example.darlinmascotas.demo.VentaDarlin;

import darlinmascotas.example.darlinmascotas.demo.MascotaDarlin.MascotaDarlin;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class VentaDarlin 
{
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fecha_venta;
    private int precio_venta;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFecha_venta() {
        return fecha_venta;
    }
    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    public int getPrecio_venta() {
        return precio_venta;
    }
    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    @ManyToOne
    private MascotaDarlin mascotaDarlin;
}

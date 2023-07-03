package ec.edu.ups.ppw.demo.modelo;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name="id_Cliente")
	private int idCliente;
	
	@Column(nullable = false)
    private String cedula;
	
	@Column(nullable = false)
    private String nombre;
	
	@Column(nullable = false)
    private String apellido;
	
    private Date fechaRegistro;
   
	@OneToMany(mappedBy="cliente")
	private Set<Ticket> tickets;
    
    public Cliente(){
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ipCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaRegistro=" + fechaRegistro + '}';
    }
	
}

package ec.edu.ups.ppw.demo.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Vehiculo {
	
	@Id
	@GeneratedValue
	@Column(name="id_Vehiculo")
	private int id;
	
	@Column(nullable = false)
    private String placa;
    private String color;
    private String marca;
    private String modelo;
    
    
	@OneToMany(mappedBy="vehiculo")
	private Set<Ticket> tickets;
    
    public Vehiculo(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", placa=" + placa + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
}

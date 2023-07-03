package ec.edu.ups.ppw.demo.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Lugar {
	
	@Id
	@GeneratedValue
	@Column(name="id_Lugar")
	private int idLugar;
	
	@Column(nullable = false)
    private int nroPiso;
	
	@Column(nullable = false)
    private int nroLugar;
	   
	@OneToMany(mappedBy="lugar")
	private Set<Ticket> tickets;
    
    public Lugar(){
        
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public int getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(int nroPiso) {
        this.nroPiso = nroPiso;
    }

    public int getNroLugar() {
        return nroLugar;
    }

    public void setNroLugar(int nroLugar) {
        this.nroLugar = nroLugar;
    }

    @Override
    public String toString() {
        return "Lugar{" + "idLugar=" + idLugar + ", nroPiso=" + nroPiso + ", nroLugar=" + nroLugar + '}';
    }
}

package ec.edu.ups.ppw.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FacturaDetalle {

	@Id
	@GeneratedValue
	@Column(name="det_codigo")
	private int codigo;
	
	@Column(name="servicio")
	private String servicio;

	@Column(name="precio")
	private float precio;
	
	@OneToOne
	@JoinColumn(name="id_Ticket")
	private Ticket ticket;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [codigo=" + codigo + ", servicio=" + servicio + ", precio=" + precio + ", ticket="
				+ ticket + "]";
	}

	
	
}

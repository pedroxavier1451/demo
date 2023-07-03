package ec.edu.ups.ppw.demo.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue
	@Column(name="id_Ticket")
	private int idTicket;
	
	@Column(nullable = false)
    private Date fechaHoraEntrada;
	
	@Column(nullable = false)
    private Date fechaHoraSalida;
	
	@Column(nullable = false)
    private float precio;
	
	@Column(nullable = false)
    private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="id_Cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_Lugar")
	private Lugar lugar;
	
	@ManyToOne
	@JoinColumn(name="id_Vehiculo")
	private Vehiculo vehiculo;
	
	
    
    public Ticket(){
        
    }
    

    public int getIdTicket() {
		return idTicket;
	}



	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}



	public Date getFechaHoraEntrada() {
		return fechaHoraEntrada;
	}



	public void setFechaHoraEntrada(Date fechaHoraEntrada) {
		this.fechaHoraEntrada = fechaHoraEntrada;
	}



	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}



	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public boolean isEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Lugar getLugar() {
		return lugar;
	}



	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}



	public Vehiculo getVehiculo() {
		return vehiculo;
	}



	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	@Override
	public String toString() {
		return "Ticket [idTicket=" + idTicket + ", fechaHoraEntrada=" + fechaHoraEntrada + ", fechaHoraSalida="
				+ fechaHoraSalida + ", precio=" + precio + ", estado=" + estado + ", cliente=" + cliente + ", lugar="
				+ lugar + ", vehiculo=" + vehiculo + "]";
	}



	
}

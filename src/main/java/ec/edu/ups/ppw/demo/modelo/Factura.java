package ec.edu.ups.ppw.demo.modelo;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Factura {
	
	@Id
	@GeneratedValue
	@Column(name="fac_codigo")
	private int codigo;	
	
	@Column(name="fac_numero")
	private String numero;
	
	@Column(name="fac_fecha")
	private Date fecha;
	
	@Column(name="fac_total")
	private float total;
	
	@OneToOne
	@JoinColumn(name="id_Cliente")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="det_codigo")
	private FacturaDetalle facturaDetalle;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fac_codigo")
	private List<FacturaDetalle> detalles;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FacturaDetalle getFacturaDetalle() {
		return facturaDetalle;
	}

	public void setFacturaDetalle(FacturaDetalle facturaDetalle) {
		this.facturaDetalle = facturaDetalle;
	}

	public List<FacturaDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<FacturaDetalle> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", numero=" + numero + ", fecha=" + fecha + ", total=" + total
				+ ", cliente=" + cliente + ", facturaDetalle=" + facturaDetalle + ", detalles=" + detalles + "]";
	}

	
}

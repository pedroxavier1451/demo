package ec.edu.ups.ppw.demo.negocio;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw.demo.datos.ClienteDAO;
import ec.edu.ups.ppw.demo.datos.DetalleFacturaDAO;
import ec.edu.ups.ppw.demo.datos.FacturaDAO;
import ec.edu.ups.ppw.demo.datos.LugarDAO;
import ec.edu.ups.ppw.demo.datos.TicketDAO;
import ec.edu.ups.ppw.demo.datos.VehiculoDAO;
import ec.edu.ups.ppw.demo.modelo.Cliente;
import ec.edu.ups.ppw.demo.modelo.Factura;
import ec.edu.ups.ppw.demo.modelo.FacturaDetalle;
import ec.edu.ups.ppw.demo.modelo.Lugar;
import ec.edu.ups.ppw.demo.modelo.Ticket;
import ec.edu.ups.ppw.demo.modelo.Vehiculo;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class DatosDemo {
	
	@Inject
	private ClienteDAO daoCliente;
	
	@Inject
	private LugarDAO daoLugar;
	
	@Inject
	private VehiculoDAO daoVehiculo;
	
	@Inject
	private TicketDAO daoTicket;
	
	@Inject
	private DetalleFacturaDAO daoDetalleFactura;
	
	@Inject
	private FacturaDAO daoFactura;
	
	@PostConstruct
	public void init() {
		System.out.println("Hola UPS");
		
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c.setCedula("0106826319");
		c.setNombre("Pedro");
		c.setApellido("Orellana");
		c.setFechaRegistro(new Date());
		
		//daoCliente.insert(c);
		
		c2.setCedula("0125375013");
		c2.setNombre("Juan");
		c2.setApellido("Lopez");
		c2.setFechaRegistro(new Date());
		
		//daoCliente.insert(c2);
		
		c3.setCedula("0142684259");
		c3.setNombre("Miguel");
		c3.setApellido("Andrade");
		c3.setFechaRegistro(new Date());
		
		//daoCliente.insert(c3);
		
		Lugar l = new Lugar();
		Lugar l2 = new Lugar();
		Lugar l3 = new Lugar();
		
		l.setNroPiso(1);
		l.setNroLugar(5);
		
		//daoLugar.insert(l);
		
		l2.setNroPiso(2);
		l2.setNroLugar(16);
		
		//daoLugar.insert(l2);
		
		l3.setNroPiso(3);
		l3.setNroLugar(20);
		
		//daoLugar.insert(l3);
		
		Vehiculo v = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		
		v.setPlaca("ABD-20");
		v.setColor("Rojo");
		v.setMarca("Toyota");
		v.setModelo("Fortuner");
		
		//daoVehiculo.insert(v);
		
		v2.setPlaca("GFQ-65");
		v2.setColor("Azul");
		v2.setMarca("Chevrolet");
		v2.setModelo("Spark");
		
		//daoVehiculo.insert(v2);
		
		v3.setPlaca("PKI-24");
		v3.setColor("Negro");
		v3.setMarca("Suzuki");
		v3.setModelo("Vitara");
		
		//daoVehiculo.insert(v3);
		
		Ticket t = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		
		t.setEstado(true);
		t.setFechaHoraEntrada(new Date());
		t.setFechaHoraSalida(new Date());
		t.setPrecio(10);
		t.setCliente(c);
		t.setLugar(l);
		t.setVehiculo(v);
		
		//daoTicket.insert(t);
		
		FacturaDetalle d = new FacturaDetalle();
		
		d.setPrecio(10);
		d.setServicio("Parqueo");
		d.setTicket(t);
		
		//daoDetalleFactura.insert(d);
		
		Factura f = new Factura();
		
		f.setCliente(c);
		f.setFecha(new Date());
		f.setNumero("028342932");
		f.setTotal(20);
		f.setFacturaDetalle(d);
		
		//daoFactura.insert(f);
		
		/*
		List<Cliente> lista;
		
		lista = daoCliente.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		*/
		
	}
}

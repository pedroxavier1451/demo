package ec.edu.ups.ppw.demo.servicios;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.ppw.demo.datos.ClienteDAO;
import ec.edu.ups.ppw.demo.modelo.Cliente;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("clientes")
public class GClientesService {
	
	@Inject
	private GClientesService gestionCliente;
	
	
	@Inject
	private ClienteDAO clidao;
	
	@Inject
	private ClienteDAO cd;
	
	//el GET nos ayuda a solamente realizar consultas hacia la base de datos

	@GET
	@Path("saludo")
	public String saludo() {
		return "Hola Mundo";
	}
	
	@GET
	@Path("suma")
	public String suma(@QueryParam("a") int a, @QueryParam("b") int b) {
		return "R = "+ (a+b);
	}
	
	@GET
	@Path("multiplicacion/{a}/{b}")
	public String multiplicacion(@PathParam("a") int a, @PathParam("b") int b) {
		return "R = "+ (a*b);
	}
	
	@GET
	@Path("misdatos")
	@Produces("application/json")
	public Cliente misDatos() {
		Cliente c = new Cliente();
		c.setCedula("0101");
		c.setNombre("Pedro");
		return c;
	}
	

	@GET
	@Path("cli")
	@Produces("application/json")
	public String datos() {
	    return clidao.getAll().toString();
	}
	
	@GET
	@Path("clienteslista")
	@Produces("application/json")
	public String datos2() {
	    List<Cliente> clientes = cd.getAll();
	    StringBuilder sb = new StringBuilder();

	    for (Cliente cliente : clientes) {
	        sb.append("--------------------------------------------------------").append("\n").
	        	 append("ID: ").append(cliente.getIdCliente()).append("\n")
	            .append("Cedula: ").append(cliente.getCedula()).append("\n")
	            .append("Nombre: ").append(cliente.getNombre()).append("\n")
	            .append("Apellido: ").append(cliente.getApellido()).append("\n")
	            .append("Fecha de Registro: ").append(cliente.getFechaRegistro()).append("\n")
	            .append("\n");
	    }

	    String result = sb.toString();
	    System.out.print(result);
	    return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//para insertar informacion en este caso de tipo perosna
	//utilizamos el pad de POST para realizar la insercicion
	
}

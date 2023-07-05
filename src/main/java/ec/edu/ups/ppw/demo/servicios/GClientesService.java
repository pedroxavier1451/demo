package ec.edu.ups.ppw.demo.servicios;

import ec.edu.ups.ppw.demo.modelo.Cliente;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("clientes")
public class GClientesService {

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
}

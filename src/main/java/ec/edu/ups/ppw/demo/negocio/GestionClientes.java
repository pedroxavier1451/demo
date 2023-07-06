package ec.edu.ups.ppw.demo.negocio;


import ec.edu.ups.ppw.demo.datos.ClienteDAO;
import ec.edu.ups.ppw.demo.modelo.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionClientes {
	
	@Inject
	private ClienteDAO daoCliente;
	
	public void guardarClientes(Cliente cliente) throws Exception {
		if(!this.isCodigoValido(cliente.getIdCliente()))
			throw new Exception("Codigo Incorrecto");
		
		if(daoCliente.read(cliente.getIdCliente()) == null) {
			try {
				daoCliente.insert(cliente);
			}catch(Exception e){
				throw new Exception("Error al insertar: "+ e.getMessage());
			}
			daoCliente.insert(cliente);
		}else {
			daoCliente.update(cliente);
		}
	}
	
	private boolean isCodigoValido(int idCliente) {
		return idCliente != 0;
	}
	
	

}

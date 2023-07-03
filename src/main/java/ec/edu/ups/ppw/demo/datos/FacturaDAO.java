package ec.edu.ups.ppw.demo.datos;

import java.util.List;

import ec.edu.ups.ppw.demo.modelo.Cliente;
import ec.edu.ups.ppw.demo.modelo.Factura;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class FacturaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Factura factura) {
		em.persist(factura);
	}
	
	public void update(Factura factura) {
		em.merge(factura);
	}

	public Factura read(int idFactura) {
		Factura f = em.find(Factura.class, idFactura);
		return f;
	}

	public void delete(int idFactura) {
		Factura f = em.find(Factura.class, idFactura);
		em.remove(f);
	}
	
	public List<Cliente> getAll(){
		String jpql = "SELECT f FROM Cliente f";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}

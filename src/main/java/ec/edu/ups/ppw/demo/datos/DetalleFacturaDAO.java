package ec.edu.ups.ppw.demo.datos;

import java.util.List;

import ec.edu.ups.ppw.demo.modelo.FacturaDetalle;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class DetalleFacturaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(FacturaDetalle facturaDetalle) {
		em.persist(facturaDetalle);
	}
	
	public void update(FacturaDetalle facturaDetalle) {
		em.merge(facturaDetalle);
	}

	public FacturaDetalle read(int idfacturaDetalle) {
		FacturaDetalle d = em.find(FacturaDetalle.class, idfacturaDetalle);
		return d;
	}

	public void delete(int idfacturaDetalle) {
		FacturaDetalle d = em.find(FacturaDetalle.class, idfacturaDetalle);
		em.remove(d);
	}
	
	public List<FacturaDetalle> getAll(){
		String jpql = "SELECT d FROM Cliente d";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}

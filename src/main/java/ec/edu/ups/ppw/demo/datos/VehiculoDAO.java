package ec.edu.ups.ppw.demo.datos;

import java.util.List;

import ec.edu.ups.ppw.demo.modelo.Vehiculo;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class VehiculoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Vehiculo vehiculo) {
		em.persist(vehiculo);
	}
	
	public void update(Vehiculo vehiculo) {
		em.merge(vehiculo);
	}

	public Vehiculo read(int idVehiculo) {
		Vehiculo v = em.find(Vehiculo.class, idVehiculo);
		return v;
	}

	public void delete(int idVehiculo) {
		Vehiculo v = em.find(Vehiculo.class, idVehiculo);
		em.remove(v);
	}
	
	public List<Vehiculo> getAll(){
		String jpql = "SELECT v FROM Vehiculo v";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}

package ec.edu.ups.ppw.demo.datos;

import java.util.List;

import ec.edu.ups.ppw.demo.modelo.Lugar;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class LugarDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Lugar lugar) {
		em.persist(lugar);
	}
	
	public void update(Lugar lugar) {
		em.merge(lugar);
	}

	public Lugar read(int idLugar) {
		Lugar l = em.find(Lugar.class, idLugar);
		return l;
	}

	public void delete(int idLugar) {
		Lugar l = em.find(Lugar.class, idLugar);
		em.remove(l);
	}
	
	public List<Lugar> getAll(){
		String jpql = "SELECT l FROM Lugar l";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}

package ec.edu.ups.ppw.demo.datos;

import java.util.List;

import ec.edu.ups.ppw.demo.modelo.Ticket;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class TicketDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Ticket ticket) {
		em.persist(ticket);
	}
	
	public void update(Ticket ticket) {
		em.merge(ticket);
	}

	public Ticket read(int idTicket) {
		Ticket t = em.find(Ticket.class, idTicket);
		return t;
	}

	public void delete(int idTicket) {
		Ticket t = em.find(Ticket.class, idTicket);
		em.remove(t);
	}
	
	public List<Ticket> getAll(){
		String jpql = "SELECT t FROM Ticket t";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
}

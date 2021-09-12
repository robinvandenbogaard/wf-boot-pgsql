package nl.rjdvdb.persistence;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@RequestScoped
public class TodoDao {

    @PersistenceContext(type = PersistenceContextType.EXTENDED,unitName = "primary")
    private EntityManager em;

    public List<Todo> list() {
        return em.createQuery("from Todo", Todo.class).getResultList();
    }
}

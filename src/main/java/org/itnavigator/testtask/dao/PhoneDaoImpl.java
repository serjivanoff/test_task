package org.itnavigator.testtask.dao;

import org.itnavigator.testtask.model.Phone;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class PhoneDaoImpl implements PhoneDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Phone> getAll() {
        return em.createNamedQuery(Phone.ALL_SORTED,Phone.class).getResultList();
    }

    @Override
    @Transactional
    public int save(Phone phone) {
        return em.createNamedQuery(Phone.UPDATE)
                .setParameter(1,phone.getNumber())
                .setParameter(2,phone.getDescription())
                .setParameter(3,phone.getComments())
                .setParameter(4,phone.getId())
                .executeUpdate();
    }
    @Override
    public Phone get(int id) {
        return em.find(Phone.class,id);
    }
}

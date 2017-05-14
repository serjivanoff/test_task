package org.itnavigator.testtask.dao;

import org.itnavigator.testtask.model.Phone;

import java.util.List;

/**
 * Created by bender on 24.04.2017.
 */
public interface PhoneDao {
    public List<Phone>getAll();
    public Phone get(int id);
    public int save(Phone phone);
}

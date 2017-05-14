package org.itnavigator.testtask.service;

import org.itnavigator.testtask.model.Phone;

import java.util.List;

/**
 * Created by bender on 24.04.2017.
 */
public interface PhoneService {
    List<Phone> getAll();
    int update(Phone phone);
    Phone get(int id);
}

package org.itnavigator.testtask.service;

import org.itnavigator.testtask.dao.PhoneDao;
import org.itnavigator.testtask.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by bender on 24.04.2017.
 */
@Service
public class PhoneServiceImpl implements PhoneService {

    private final PhoneDao phoneDao;

    @Autowired
    public PhoneServiceImpl(PhoneDao phoneDao) {
        this.phoneDao = phoneDao;
    }

    @Override
    public List<Phone> getAll() {
        return phoneDao.getAll();
    }

    @Override
    public int update(Phone phone) {
        Assert.notNull(phone, "phone must not be null");
        return phoneDao.save(phone);
    }

    @Override
    public Phone get(int id){
        return phoneDao.get(id);
    }
}

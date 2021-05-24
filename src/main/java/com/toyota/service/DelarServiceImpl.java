package com.toyota.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toyota.dao.DelarDao;
import com.toyota.model.Delar;

@Transactional
@Service
public class DelarServiceImpl implements DelarService {
	@Autowired
	public DelarDao delarDao;

	@Override
	public boolean dRegister(Delar delar) {
		System.out.println("delar service:::::: "+ delar);

		return delarDao.dRegister(delar);
	}

	@Override
	public Delar dLogin(Delar delar) {

		return delarDao.dLogin(delar);
	}

	@Override
	public ArrayList<Delar> getDelars() {

		return (ArrayList) delarDao.getDelars();
	}

	@Override
	public Delar editDelar(String delarName) {

		return delarDao.editDelar(delarName);
	}

	@Override
	public Delar updateDelar(Delar delar) {

		return delarDao.updateDelar(delar);
	}

	@Override
	public Delar getDelarById(int customerId) {

		return delarDao.deleteById(customerId);
	}

	@Override
	public Delar deleteById(int id) {

		return delarDao.deleteById(id);
	}

}

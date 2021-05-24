package com.toyota.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toyota.model.Delar;

@Repository
public class DelarDaoImpl implements DelarDao {

	@Autowired
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean dRegister(Delar delar) {
		System.out.println("dao delar---------------" + delar);
		int i = (int) sessionFactory.getCurrentSession().save(delar);
		System.out.println("*************" + i);
		if (i > 0)
			return true;
		else
			return false;
	}

	@Override
	public Delar dLogin(Delar delar) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Delar.class);
		 List delars=crit.list();
		 Iterator it=delars.iterator();
		 while(it.hasNext()) {
			 Delar d=(Delar) it.next();
		 
		 
		if (d != null) {
			if (d.getDelarName().equalsIgnoreCase(delar.getDelarName())
					&& d.getDelarPassword().equalsIgnoreCase(delar.getDelarPassword())) {
				return d;
			} else {
				return null;
			}
		} else {
			return null;
		}
		 }
		return delar;

	}

	@Override
	public ArrayList<Delar> getDelars() {

		return (ArrayList<Delar>) sessionFactory.getCurrentSession().createQuery("from Delar").list();
	}

	@Override
	public Delar editDelar(String delarName) {

		return sessionFactory.getCurrentSession().get(Delar.class, delarName);
	}

	@Override
	public Delar updateDelar(Delar delar) {
		sessionFactory.getCurrentSession().saveOrUpdate(delar);
		Delar d = sessionFactory.getCurrentSession().get(Delar.class, delar.getDelarName());
		if (d != null) {
			return d;
		} else {

			return null;
		}
	}

	@Override
	public Delar getDelarById(int delarId) {

		return sessionFactory.getCurrentSession().get(Delar.class, delarId);
	}

	@Override
	public Delar deleteById(int id) {

		return sessionFactory.getCurrentSession().get(Delar.class, id);
	}

}

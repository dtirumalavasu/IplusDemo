package com.toyota.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.toyota.model.Delar;


@Service
public interface DelarService {
	
	public boolean dRegister(Delar delar);

	public Delar dLogin(Delar delar);

	public ArrayList<Delar> getDelars();

	public Delar editDelar(String delarName);

	public Delar updateDelar(Delar delar);

	public Delar getDelarById(int customerId);

	public Delar deleteById(int id);


}

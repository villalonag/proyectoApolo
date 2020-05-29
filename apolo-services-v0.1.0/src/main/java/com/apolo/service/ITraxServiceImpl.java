package com.apolo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apolo.model.Trax;
import com.apolo.repo.ITraxRepo;


@Service
public class ITraxServiceImpl implements ITraxService{
	
	@Autowired
	private ITraxRepo repo;

	@Override
	public void create(Trax t) {
		repo.save(t);
	}

	@Override
	public void update(Trax t) {
		repo.save(t);		
	}

	@Override
	public void delete(int idtrx) {
		repo.deleteById(idtrx);
	}

	@Override
	public void select(int idtrx) {
	    repo.findById(idtrx);
	}

	@Override
	public void selectAll() {
		repo.findAll();
	}
		
}

package com.apolo.service;

import com.apolo.model.Trax;

import antlr.collections.List;

public interface ITraxService  {
	
	void create(Trax t);
	
	void update(Trax t);
	
	void delete(int idtrx);
	
	void select(int idtrx);
	
	void selectAll();
	
}

package com.apolo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apolo.model.Trax;

public interface ITraxRepo extends JpaRepository<Trax, Integer> {
	

}

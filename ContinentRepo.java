package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Continentinfo;

@Repository
public interface ContinentRepo extends JpaRepository<Continentinfo,String>
{
	
}

package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Continentinfo;
import com.example.demo.Repo.ContinentRepo;
import com.example.demo.Service.ContinentService;

@Service
public class ContinentDao implements ContinentService
{
	@Autowired
	ContinentRepo cr;
	

	@Override
	public void savedata(Continentinfo a1)
	{
		cr.save(a1);
		
	}
	
}

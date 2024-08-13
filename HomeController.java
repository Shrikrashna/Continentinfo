package com.example.demo.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Continentinfo;
import com.example.demo.Service.ContinentService;


@RestController
public class HomeController
{
	@Autowired
	ContinentService cs;
	
	@RequestMapping("/")
	public String one()
	{
		return "Hello API";
	}
	@PostMapping("/savedata")
	public String savedata(@RequestBody Continentinfo c1)
	{
		cs.savedata(c1);
		return "Data Saved";
	}
}

package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Continentinfo
{
	
	private String code;
	private String name;
	private long areaSqKm;
	private String lines;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int countries;
	private String oceans;
	private String developedCountries;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAreaSqKm() {
		return areaSqKm;
	}
	public void setAreaSqKm(long areaSqKm) {
		this.areaSqKm = areaSqKm;
	}
	public String getLines() {
		return lines;
	}
	public void setLines(String lines) {
		this.lines = lines;
	}
	public int getCountries() {
		return countries;
	}
	public void setCountries(int countries) {
		this.countries = countries;
	}
	public String getOceans() {
		return oceans;
	}
	public void setOceans(String oceans) {
		this.oceans = oceans;
	}
	public String getDevelopedCountries() {
		return developedCountries;
	}
	public void setDevelopedCountries(String developedCountries) {
		this.developedCountries = developedCountries;
	}
	
}

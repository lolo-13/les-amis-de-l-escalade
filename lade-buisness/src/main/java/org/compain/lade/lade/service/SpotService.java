package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.SpotDao;
import org.compain.lade.lade.entities.Spot;

public class SpotService {

	private static SpotService instance = new SpotService();

	private SpotDao spotDao = SpotDao.getInstance();

	private SpotService() {

	}

	public static SpotService getInstance() {
		return instance;
	}

	public List<Spot> findAll() {
		return spotDao.findAll();
	}
	
	public Spot getSpot(Integer idSpot) {
		return spotDao.getSpot(idSpot);
	}
	public List<Spot> findSpots(String region, String difficult, String country, String postcode, String name ) {
		return spotDao.findSpots(region, difficult, country, postcode, name);
	}
	
	public void addSpot(Spot spot) {
		spotDao.saveOrUpdateSpot(spot);
	}
	
}

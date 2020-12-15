package org.compain.lade.lade.service;

import java.util.List;


import org.compain.lade.lade.dao.SectorDao;
import org.compain.lade.lade.entities.Sector;

public class SectorService {
	
	private static SectorService instance = new SectorService();

	private SectorDao sectorDao = SectorDao.getInstance();

	private SectorService() {

	}

	public static SectorService getInstance() {
		return instance;
	}

	public List<Sector> findAll() {
		return sectorDao.findAll();
	}
	public Sector getSector(Long idSector) {
		return sectorDao.getSector(idSector);
	}

	public void addSector(Sector sector) {
		sectorDao.saveOrUpdateSector(sector);
	}

}

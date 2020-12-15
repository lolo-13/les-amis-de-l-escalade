package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.TopoDao;
import org.compain.lade.lade.entities.Topo;
import org.compain.lade.lade.entities.User;


public class TopoService {
	
	private static TopoService instance = new TopoService();

	private TopoDao topoDao = TopoDao.getInstance();

	private TopoService() {

	}

	public static TopoService getInstance() {
		return instance;
	}

	public List<Topo> findAll() {
		return topoDao.findAll();
	}
	
	public Topo getTopoById(Integer idTopo) {
		return topoDao.getTopoById(idTopo);
	}
	public List<Topo> getTopoByUser (Integer idUser) {		 
		return topoDao.getTopoByUser(idUser);
		 }
	public List<Topo> findTopos(String location, String name, Boolean available) {
		return topoDao.findTopos(location, name, available);
	}
	
	
	public void addTopo(Topo topo) {		
		topoDao.saveOrUpdateTopo(topo);
	}	
	public void  updateTopoAvailability(Topo newTopo, Integer idTopo ) {
		
		Topo old = topoDao.getTopoById(idTopo);
		
		old.setAvailable(newTopo.getAvailable());

		topoDao.saveOrUpdateTopo(old);
		
	}

}

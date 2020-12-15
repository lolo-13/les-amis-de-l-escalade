package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.ReservationInquiryDao;
import org.compain.lade.lade.entities.ReservationInquiry;


public class ReservationInquiryService {
	
	private static ReservationInquiryService instance = new ReservationInquiryService();

	private ReservationInquiryDao reservationInquiryDao = ReservationInquiryDao.getInstance();

	private ReservationInquiryService() {

	}

	public static ReservationInquiryService getInstance() {
		return instance;
	}

	public List<ReservationInquiry> findAll() {
		return reservationInquiryDao.findAll();
	}
	
	public ReservationInquiry getReservationInquiryById(Long idReservationInquiry) {
		return reservationInquiryDao.getReservationInquiryById(idReservationInquiry);
	}
	public List<ReservationInquiry> getReservationInquiryByTop (Integer idTopo) {		 
		return reservationInquiryDao.findReservationInquiryByIdTopo(idTopo);
		 }
	
	public List<ReservationInquiry> getReservationInquiryByUser (Integer idUser) {		 
		return reservationInquiryDao.findReservationInquiryByIdUser(idUser);
		 }
	
	public void addReservationInquiry(ReservationInquiry reservationInquiry) {		
		reservationInquiryDao.saveOrUpdateReservationInquiry(reservationInquiry);
	}	
	public void  updateReservationInquiryStatut(ReservationInquiry newReservationInquiry, Long idReservationInquiry ) {
		
		ReservationInquiry old = reservationInquiryDao.getReservationInquiryById(idReservationInquiry);
		
		old.setStatut(newReservationInquiry.getStatut());

		reservationInquiryDao.saveOrUpdateReservationInquiry(old);
		
	}



}

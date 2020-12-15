package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.AddressDao;
import org.compain.lade.lade.entities.Address;

public class AddressService {

	private static AddressService instance = new AddressService();

	private AddressDao addressDao = AddressDao.getInstance();

	private AddressService() {

	}

	public static AddressService getInstance() {
		return instance;
	}

	public List<Address> findAll() {
		return addressDao.findAll();
	}

	public Address getAddress(int idAddress) {
		return addressDao.getAddress(idAddress);
	}

	public void addAddress(Address address) {
		addressDao.saveOrUpdateUser(address);
	}

	public void updateAddress(Address newAddress, int idAddress) {

		Address old = addressDao.getAddress(idAddress);

		old.setStreetNumber(newAddress.getStreetNumber());
		old.setStreetName(newAddress.getStreetName());
		old.setPostCode(newAddress.getPostCode());
		old.setCity(newAddress.getCity());
		old.setCountry(newAddress.getCountry());
		old.setRegion(newAddress.getRegion());

	}

}

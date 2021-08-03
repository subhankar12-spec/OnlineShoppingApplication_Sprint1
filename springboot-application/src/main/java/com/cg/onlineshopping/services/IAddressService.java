package com.cg.onlineshopping.services;

import java.util.List;

import com.cg.onlineshopping.entities.Address;
import com.cg.onlineshopping.exceptions.address.AddressNotFoundException;



public interface IAddressService {
	
	public Address AddAddress(Address add);
	public Address updateAddress(int id,Address add) throws AddressNotFoundException;
	public Address removeAddress(Integer addressId) throws AddressNotFoundException;
	public List<Address> viewAllAddress();
	public Address viewAddress(Integer addressId) throws AddressNotFoundException;
	

}

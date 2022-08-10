package com.revature.service;

import java.util.List;

import com.revature.daos.CustomerDAO;
import com.revature.daos.CustomerDAOImp;
import com.revature.models.CustomerAccount;


public class CustomerService {
	public CustomerDAO customerDAO = new CustomerDAOImp();
	
	
	
	
}




//public class AvengerService {
//	
//	private AvengerDAO avengerDao = new AvengerDAOImpl();
//	
//	public Avenger getSingleAvenger(int id) {
//		return avengerDao.getAvengerById(id);
//	}
//	
//	public List<Avenger> avengersAssemble(){
//		return avengerDao.getAllAvengers();
//	}
//
//	public void recruitAvenger(Avenger avenger) {
//		avengerDao.insertAvenger(avenger);
//		
//	}
//
//}
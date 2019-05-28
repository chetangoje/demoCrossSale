package com.wcs.app.cs.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.BranchPurchaseOrder;
import com.wcs.app.cs.main.model.Login;
import com.wcs.app.cs.main.model.VenderInformation;
import com.wcs.app.cs.main.repository.IBranchInformationRepository;

import com.wcs.app.cs.main.repository.IBranchPurchesOrderRepository;
import com.wcs.app.cs.main.repository.ILoginRepository;
import com.wcs.app.cs.main.repository.IVenderInformationRepository;
import com.wcs.app.cs.main.service.IService;
@Service
public class ServiceImplementation implements IService {

	
	@Autowired
	IVenderInformationRepository venderInformationRepository;
	@Autowired
	IBranchInformationRepository branchInformationRepository;
	@Autowired
	IBranchPurchesOrderRepository branchPurchesOrderRepository;
	
	@Autowired
	ILoginRepository loginRepository;
	
	@Override
	public List<VenderInformation> getallVender() {
		List<VenderInformation> listVendor = (List<VenderInformation>) venderInformationRepository.findAll();
		System.out.println(listVendor);
		return listVendor;
	}
	
	@Override
	public List<BranchInformation> getallBranch() {
		
	return (List<BranchInformation>) branchInformationRepository.findAll();
	}
	
	@Override
	public List<BranchPurchaseOrder> getallBranchPurchaseOrder() {
		List<BranchPurchaseOrder>list= (List<BranchPurchaseOrder>) branchPurchesOrderRepository.findAll();
		return list;	
	}

	@Override
	public Login userAuthentication(String username, String password) {
		
		return loginRepository.findAllByUsernameAndPassword(username, password);
	}

	@Override
	public BranchInformation findBranchByLogin(Login login) {
		
		return branchInformationRepository.findAllByLogin(login);
	}

}

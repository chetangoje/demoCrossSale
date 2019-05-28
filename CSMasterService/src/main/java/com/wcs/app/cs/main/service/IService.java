package com.wcs.app.cs.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.BranchPurchaseOrder;
import com.wcs.app.cs.main.model.Login;
import com.wcs.app.cs.main.model.VenderInformation;

@Service
public interface IService {
	public List<VenderInformation> getallVender();
	public List<BranchInformation> getallBranch();
    public List<BranchPurchaseOrder> getallBranchPurchaseOrder();
    public Login userAuthentication(String username, String password);
    public BranchInformation findBranchByLogin(Login login);
}

package com.wcs.app.cs.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.Login;
import com.wcs.app.cs.main.model.VenderInformation;
import com.wcs.app.cs.main.service.IService;

@CrossOrigin("*")
@RestController
@RequestMapping("/masteradmin")
public class AdminController 
{
	@Autowired
	IService service;
	
	
	@RequestMapping("/masterAdmin")
	public String adminData()
	{
		return "AdminMaster";
	}
	
	@RequestMapping(value="userAuthentication",method=RequestMethod.POST)
	public Login userAuthentication(@RequestParam (name="username") String username,
			@RequestParam(name="password") String password) {
		System.out.println(username+""+password);
		return service.userAuthentication(username, password);	  
	}
	
	@RequestMapping(value="findBranchByLogin", method=RequestMethod.POST)
	public BranchInformation getBranchByLogin(@RequestBody Login login) {
		return service.findBranchByLogin(login);
	}
	
	@RequestMapping(value="/getallVender",produces="application/json")
	public List<VenderInformation> venderinfo()
	{
		List<VenderInformation> list=service.getallVender();
		System.out.println(list);
		VenderInformation vi=new VenderInformation();
		System.out.println(vi.getVendorId());
		System.out.println(vi.getVendorName());
		return list;	
	}
	@RequestMapping(value="/getallBranch",produces="application/json")
	public List<BranchInformation> branchinfo()
	{
		List<BranchInformation> list=service.getallBranch();
		System.out.println(list);
		BranchInformation bi=new BranchInformation();
		System.out.println(bi.getBranchName());
		return list;
	}
	
	
}
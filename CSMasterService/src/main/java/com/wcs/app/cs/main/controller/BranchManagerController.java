package com.wcs.app.cs.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masterbm")
public class BranchManagerController 
{
	@RequestMapping("/masterBm")
	public String adminData()
	{
		return "Branch Manager Admin";
	}
}

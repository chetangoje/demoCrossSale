package com.wcs.app.cs.main.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.BranchProductStock;
import com.wcs.app.cs.main.model.BranchProductStockWiseQuantity;
import com.wcs.app.cs.main.model.BranchProductTarget;
import com.wcs.app.cs.main.model.BranchProductTargetQuantity;
import com.wcs.app.cs.main.model.BranchPurchaseOrderRequest;
import com.wcs.app.cs.main.model.BranchStockTransfer;
import com.wcs.app.cs.main.model.DamageStockBranchComplain;
import com.wcs.app.cs.main.model.District;
import com.wcs.app.cs.main.model.ProductInformation;
import com.wcs.app.cs.main.model.ProductPriceMapping;
import com.wcs.app.cs.main.model.Role;
import com.wcs.app.cs.main.model.State;
import com.wcs.app.cs.main.service.BranchInfoService;
import com.wcs.app.cs.main.utility.DateSortedList;
import com.wcs.app.cs.main.utility.custom_generation;

@RestController
@CrossOrigin("*")
@RequestMapping("/masteradmin")

public class AdminController

{
	@Autowired
	BranchInfoService serviceimpl;

	//<*****************************************************************************************************************************************>
	//   Test method
	@RequestMapping("/masterAdmin")
	public String adminData() {
		return "AdminMaster";
	}
     //<*********************************************************************************************************************************************>
	// common  methods
	@RequestMapping("/getbranchlist")
	public List<BranchInformation> getallbrachdata() {
		// String url="http://zuul/getMasterService/getbranchlist";
		List<BranchInformation> getBranchdata = serviceimpl.getallbrachdata();
		System.out.println(getBranchdata);
		return getBranchdata;
	}
//<***********************************************************************************************************************************************>
	// Dashbord componant methods
	@RequestMapping("/getalldata")
	public List<BranchProductStock> getalldata() {

		List<BranchProductStock> bplist = serviceimpl.getbranchStock();
		System.out.println(bplist);
		return bplist;
	}

	@RequestMapping("/getallproductdata")
	public List<ProductInformation> getproductlist() {
		List<ProductInformation> productlist = serviceimpl.getproductlist();
		return productlist;
	}

	@PostMapping(value = "/getallProductPriceMapp/{prcode}", consumes = "application/json")
	public ProductPriceMapping getproductpriceMapping(@PathVariable String prcode) {
		System.out.println(prcode);
		ProductInformation pdi = serviceimpl.getproduct(prcode);
		ProductPriceMapping ppm = serviceimpl.getproductpricemapping(pdi);
		return ppm;
	}

	@RequestMapping(value = "/getByIdProductPriceMapp/{pricemappingid}", method = RequestMethod.GET, produces = "application/json")
	public ProductPriceMapping getProductPriceMappingbyID(@PathVariable(name = "pricemappingid") int pricemappingid) {
		return serviceimpl.getByIdProductPriceMapping(pricemappingid);
	}

	@RequestMapping(value = "/getproducttransferdata", method = RequestMethod.GET)
	public List<BranchStockTransfer> getbranchtransferdata() {
		List<BranchStockTransfer> transferlist = serviceimpl.getbranchtransferlist();
		return transferlist;
	}



	@RequestMapping(value = "/setbranchtarget", method = RequestMethod.POST, consumes = "application/json")
	public String SetTargettoBranch(@RequestBody String pmap)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Object[] o = mapper.readValue(pmap, Object[].class);
		System.out.println(pmap);
		System.out.println("length of o :- " + o.length);

		BranchProductTarget bproducttargetrequest = new BranchProductTarget();
		Map mm = (Map) o[0];
		
		Set<String> ss = mm.keySet();
		System.out.println("keys :" + ss);
		for (String s : ss) {
			if (s.equals("branchInformation")) {
				System.out.println("kay:" + s);
				ObjectMapper mapp = new ObjectMapper();
				mapp.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
				mapp.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
				String jsonResult = mapp.writerWithDefaultPrettyPrinter().writeValueAsString(mm.get(s)); //
				System.out.println(jsonResult);
				BranchInformation br = mapp.readValue(jsonResult, BranchInformation.class);
				System.out.println("branchInformation Name:-" + br.getBranchName());
				bproducttargetrequest.setBranchInformation(br);
			}
			if (s.equals("targetDate")) {
				System.out.println("kay:" + s);
				System.out.println("date :" + (String) mm.get(s));
				bproducttargetrequest.setTargetDate((String) mm.get(s));// setDate((String) mm.get(s));
			}
		}
		for (int i = 1; i < o.length; i++) {
			Map mm1 = (Map) o[i];
			System.out.println("direct object " + i + " " + mm1);
			ObjectMapper mapp = new ObjectMapper();
			String jsonResult = mapp.writerWithDefaultPrettyPrinter().writeValueAsString(mm1); //
			System.out.println(jsonResult);
			ProductPriceMapping ppm = mapp.readValue(jsonResult, ProductPriceMapping.class);
			System.out.println("product Name:- " + ppm.getProductInformation().getProductName());
			System.out.println("----------------------------------------------------");
			i = i + 1;
			Map mmm = (Map) o[i];

			BranchProductTargetQuantity quan = new BranchProductTargetQuantity();

			System.out.println("direct object 22 " + i + " " + mmm);

			Set<String> sss = mmm.keySet();
			System.out.println("keys :" + sss);
			System.out.println("mmmmmm: --" + mmm);
			for (Iterator iterator = sss.iterator(); iterator.hasNext();) {
				String s1 = (String) iterator.next();
				String s2 = (String) iterator.next();
				String s3 = (String) iterator.next();
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				if (s2.equals("initialTargetQuantity") && s3.equals("changeTargetQuantity")) {
					System.out.println("kay:" + s2);
					System.out.println("value:" + mmm.get(s2));
					String sd = String.valueOf(mmm.get(s2));
					Integer ds = Integer.parseInt(sd);
					System.out.println(sd);
					quan.setInitialTargetQuantity(ds);// setInitialTargetQuantity
					quan.setChangeTargetQuantity(ds);// set changed TargetQuantity
				}

			}
			bproducttargetrequest.getPmap().put(ppm, quan);
		}
		System.out.println(bproducttargetrequest.getPmap());
		System.out.println("*******************************************************");
		Set<ProductPriceMapping> setppm = bproducttargetrequest.getPmap().keySet();
		for (ProductPriceMapping productPriceMapping : setppm) {
			System.out.println("productname :" + productPriceMapping.getProductInformation().getProductName());
			BranchProductTargetQuantity pquanty = bproducttargetrequest.getPmap().get(productPriceMapping);// getPmap().get(productPriceMapping);
			System.out.println("quannty :" + pquanty.getInitialTargetQuantity());// BranchProductTargetQuantity());

		}

		serviceimpl.settargatetobranch(bproducttargetrequest);
		return pmap;

		/*
		 * ; ObjectMapper om = new ObjectMapper(); String json =
		 * om.writeValueAsString(service.registerbranchPurchaseOrderRequest(bporeRequest
		 * )); System.out.println("String = " + json); return json; }
		 */
	
	}

	
//<*********************************************************************************************************************>
	// code for branch product target view

	@RequestMapping(value = "/gettarget", method = RequestMethod.GET)
	public List<BranchProductTarget> productQuantityDisplay() {
		List<BranchProductTarget> getBranchTargetList = serviceimpl.BranchProductTargetDisplay();
		return getBranchTargetList;

	}

	@RequestMapping(value = "/dateSort/{Fromdate}/{Todate}")
	public List<BranchProductTarget> targetDateSort(@PathVariable(name = "Fromdate") String Fromdate,
			@PathVariable(name = "Todate") String Todate) {
		System.out.println("In targetDateSort Controller method");

		System.out.println("Todate from angular:" + Fromdate);
		System.out.println("Todate from angular:" + Todate);
		List<BranchProductTarget> datel = serviceimpl.BranchProductTargetDisplay();
		List<BranchProductTarget> sortedlist = DateSortedList.datesort(datel, Fromdate, Todate);
		return sortedlist;
	}
	//<************************************************************************************************************************>
	//code for branch master
	

	@RequestMapping(value="/BranchRegister",method=RequestMethod.POST,consumes="application/json")
	public String registerBranch(@RequestBody BranchInformation branchInformation)
	{
		
		String s=serviceimpl.getBranchcode();
		custom_generation gen=new custom_generation();
		String branchcode=gen.getid(s);
		branchInformation.setBranchCode(branchcode);
		//branchInformation.setState(null);
		System.out.println(branchInformation.getState().getStateId());
		System.out.println(branchInformation.getDistrict().getDistrictId());

		System.out.println(branchInformation.getBranchCode());
			
		System.out.println("branch info :"+branchInformation);
		System.out.println("before register method");
		serviceimpl.register(branchInformation);
		System.out.println("after register method");
		return "inserted";
	}
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/getstateinfo", consumes = "application/json")
	public List<State> getStateList() {
		List<State> statelist = serviceimpl.getstatelist();
		return statelist;
	}

	@RequestMapping(value = "/getdistrictinfo/{id}", consumes = "application/json")
	public List<District> getDistrictList(@PathVariable("id") int id) {
		List<District> districtlist = serviceimpl.getdistrictlist();
		return districtlist;
	}
	
	
	@RequestMapping(value="/getemail",method=RequestMethod.POST,produces="application/json")
	public void sendmail(@RequestBody BranchInformation branchinformation) throws MessagingException
	{
	String mailid=branchinformation.getBranchEmailId();
		System.out.println("mail to send"+mailid);
	serviceimpl.sendMailOfVenderInformation(branchinformation);
	}
	
	public BranchProductTarget getbranchtarget() {
	
		return serviceimpl.getbranchtarget();
			
		}
	
	
	
 
}

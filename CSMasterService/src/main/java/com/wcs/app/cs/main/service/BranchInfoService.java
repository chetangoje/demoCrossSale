package com.wcs.app.cs.main.service;

import java.util.List;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.BranchProductStock;
import com.wcs.app.cs.main.model.BranchProductTarget;
import com.wcs.app.cs.main.model.BranchPurchaseOrderRequest;
import com.wcs.app.cs.main.model.BranchStockTransfer;
import com.wcs.app.cs.main.model.DamageStockBranchComplain;
import com.wcs.app.cs.main.model.District;
import com.wcs.app.cs.main.model.ProductInformation;
import com.wcs.app.cs.main.model.ProductPriceMapping;
import com.wcs.app.cs.main.model.Role;
import com.wcs.app.cs.main.model.State;

public interface BranchInfoService {

	public List<BranchInformation> getallbrachdata();
	public List<BranchProductStock> getbranchStock();
	public List<ProductInformation> getproductlist();
	public ProductInformation getproduct(String prcode);
	public ProductPriceMapping getByIdProductPriceMapping(int pricemappingid);
	public List<BranchStockTransfer> getbranchtransferlist();
	public List<BranchPurchaseOrderRequest> getbranchpurchesorderlist();
	public void settargatetobranch(BranchProductTarget bporeRequest);
	public ProductPriceMapping getproductpricemapping(ProductInformation pdi);
	//<*************************************************************************************>
	//branch product target view code
	public List<BranchProductTarget> BranchProductTargetDisplay();
	//public ProductPriceMapping getByIdProductPriceMapping(int pricemappingid);
	//<**************************************************************************************>
	//branch master componant methods
	
	public List<State> getstatelist();
	public List<District> getdistrictlist();
	public List<District> findByState(State state);
	public void register(BranchInformation branchInfo);
	public String getBranchcode();
	public void sendMailOfVenderInformation(BranchInformation branchinformation);
	//<*****************************************************************************************>
	public BranchProductTarget getbranchtarget();
	//public BranchInformation getlogin(String username, String password);
	

}

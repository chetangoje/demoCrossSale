package com.wcs.app.cs.main.serviceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.BranchProductStock;
import com.wcs.app.cs.main.model.BranchProductTarget;
import com.wcs.app.cs.main.model.BranchProductTargetQuantity;
import com.wcs.app.cs.main.model.BranchPurchaseOrderRequest;
import com.wcs.app.cs.main.model.BranchStockTransfer;
import com.wcs.app.cs.main.model.DamageStockBranchComplain;
import com.wcs.app.cs.main.model.District;
import com.wcs.app.cs.main.model.Invoice;
import com.wcs.app.cs.main.model.InvoiceProductWiseQuantity;
import com.wcs.app.cs.main.model.Login;
import com.wcs.app.cs.main.model.ProductInformation;
import com.wcs.app.cs.main.model.ProductPriceMapping;
import com.wcs.app.cs.main.model.Role;
import com.wcs.app.cs.main.model.State;
import com.wcs.app.cs.main.repository.IBranchInformationRepository;
import com.wcs.app.cs.main.repository.IBranchProductStockRepositoty;
import com.wcs.app.cs.main.repository.IBranchProductTargetRepository;
import com.wcs.app.cs.main.repository.IBranchPurchesOrderRepository;
import com.wcs.app.cs.main.repository.IDistrictRepository;
import com.wcs.app.cs.main.repository.IProductInformationRepository;
import com.wcs.app.cs.main.repository.IProductTransferRepository;
import com.wcs.app.cs.main.repository.IProductpricemappingRepository;
import com.wcs.app.cs.main.repository.IRoleRepository;
import com.wcs.app.cs.main.repository.IStateRepository;
import com.wcs.app.cs.main.repository.IdamageStockBranchComplainRepository;
import com.wcs.app.cs.main.repository.IinvoiceRepositoty;
import com.wcs.app.cs.main.repository.IloginRepositoty;
import com.wcs.app.cs.main.service.BranchInfoService;
import com.wcs.app.cs.main.utility.Datesort2;

@Service
public class ServiceImpl implements BranchInfoService {

	@Autowired
	IloginRepositoty loginRepositoty;
	@Autowired
	IBranchProductStockRepositoty branchProductStockRepository;
	@Autowired
	IProductpricemappingRepository productPriceMappingRepository;
	@Autowired
	IBranchInformationRepository branchInformationRepository;
	@Autowired
	IStateRepository stateRepository;
	@Autowired
	IDistrictRepository districtRepository;
	@Autowired
	IProductInformationRepository productInformationRepository;
	@Autowired
	IProductTransferRepository productTransferRepository;
	@Autowired
	IBranchPurchesOrderRepository branchPurchesOrderRequestRepository;
	@Autowired
	IBranchProductTargetRepository branchProductTargetRepository;
	@Autowired
	JavaMailSender mailsender;
	@Autowired
	IRoleRepository roleRepositoty;
	@Autowired
	IinvoiceRepositoty invoiceRepositoty;
	@Autowired
	IdamageStockBranchComplainRepository damagestockbranchcomplainrepository;

	@Override
	public List getallbrachdata() {

		List blist = (List) branchInformationRepository.findAll();
		return blist;
	}

	@Override
	public List<BranchProductStock> getbranchStock() {
		List stocklist = (List) branchProductStockRepository.findAll();

		return stocklist;
	}

	/*
	 * @Override public List<ProductPriceMapping> getproductdata() { List
	 * productList=(List) productpricemapping.findAll(); return productList; }
	 */

	// <******************************************************************************************************************>
	// for branch master componant
	@Override

	public List<State> getstatelist() {

		return (List<State>) stateRepository.findAll();
	}

	@Override
	public List<District> getdistrictlist() {

		return (List<District>) districtRepository.findAll();
	}

	@Override
	public List<District> findByState(State state) {
		return districtRepository.findByState(state);
	}

	@Override
	public void register(BranchInformation branchInfo) {

		branchInfo.getLogin().setUsername(branchInfo.getBranchName());
		branchInfo.getLogin().setPassword(branchInfo.getBranchName());
		branchInfo.getLogin().setRole(roleRepositoty.findByRoleName());
		branchInformationRepository.save(branchInfo);

	}

//<********************************************************************************************************************************>
	// for dashbord componant
	@Override
	public List<ProductInformation> getproductlist() {
		return (List<ProductInformation>) productInformationRepository.findAll();
	}

	@Override
	public ProductInformation getproduct(String prcode) {

		return productInformationRepository.findByProductCode(prcode);
	}

	@Override
	public ProductPriceMapping getByIdProductPriceMapping(int pricemappingid) {

		return productPriceMappingRepository.findAllByPricemappingid(pricemappingid);
	}

	@Override
	public List<BranchStockTransfer> getbranchtransferlist() {

		return (List<BranchStockTransfer>) productTransferRepository.findAll();
	}

	@Override
	public List<BranchPurchaseOrderRequest> getbranchpurchesorderlist() {

		// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// LocalDate localDate = LocalDate.now();
		// System.out.println(dtf.format(localDate));

		/*
		 * final Calendar cal = Calendar.getInstance(); cal.add(Calendar.DATE, -10);
		 * System.out.println(cal.getTime()); // return cal.getTime(); //
		 * cal.add(Calendar.DATE,0); final Calendar cal2 = Calendar.getInstance();
		 * cal2.add(Calendar.DATE, 0);
		 * 
		 * DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy"); String date2
		 * = dateFormat.format(cal2.getTime()); String date1 =
		 * dateFormat.format(cal.getTime()); System.out.println(date1);
		 * 
		 * System.out.println(date2);
		 * 
		 * List<BranchPurchaseOrderRequest> BPOLIST = (List<BranchPurchaseOrderRequest>)
		 * branchPurchesOrderRequestRepository.findAllByDate(date1, date2);
		 * 
		 * for (BranchPurchaseOrderRequest b : BPOLIST) {
		 * System.out.println(b.getDate()); } return BPOLIST;
		 */

		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		System.out.println(cal.getTime()); // return cal.getTime(); //
		cal.add(Calendar.DATE, 0);
		final Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DATE, 0);

		DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");
		String Fromdate = dateFormat.format(cal2.getTime());
		String Todate = dateFormat.format(cal.getTime());
		System.out.println(Fromdate);
		System.out.println(Todate);

		List<BranchPurchaseOrderRequest> bpolist = (List) branchPurchesOrderRequestRepository.findAll();

		return Datesort2.datesort(bpolist, Fromdate, Todate);

	}

	@Override
	public void settargatetobranch(BranchProductTarget bporeRequest) {

		branchProductTargetRepository.save(bporeRequest);
	}

	@Override
	public ProductPriceMapping getproductpricemapping(ProductInformation pdi) {

		return productPriceMappingRepository.findByProductInformation(pdi);
	}
	
	
	

	// <*****************************************************************************************************************>
	// branch product target view code
	@Override
	public List<BranchProductTarget> BranchProductTargetDisplay() {

		return (List<BranchProductTarget>) branchProductTargetRepository.findAll();
	}

	@Override
	public String getBranchcode() {
		System.out.println(branchInformationRepository == null);
		List<BranchInformation> list = branchInformationRepository.findAllByOrderByBranchCodeDesc();
		System.out.println("list" + list);
		String s = null;
		for (BranchInformation b : list) {
			s = b.getBranchCode();
			break;
		}
		System.out.println("new branchcode" + s);
		return s;
	}

	@Override
	public void sendMailOfVenderInformation(BranchInformation branchinformation) {

		SimpleMailMessage message = new SimpleMailMessage();
		System.out.println("in  mail service impl");
		message.setSubject("new branch creation");
		message.setTo(branchinformation.getBranchEmailId());
		System.out.println("mail id:" + branchinformation.getBranchEmailId());
		message.setText("Branch Name:" + branchinformation.getBranchName() + System.lineSeparator() + "Branch Location"
				+ branchinformation.getBranchAddress());
		mailsender.send(message);
		System.out.println("mail send");
	}

	@Override
	public BranchProductTarget getbranchtarget() {
/*//
//		List<Invoice> invoicelist = (List<Invoice>) invoiceRepositoty.findAll();
//		List<BranchProductTarget> brprodtarlist = (List<BranchProductTarget>) branchProductTargetRepository.findAll();
//		for (Invoice invoice : invoicelist) {
//
//			String branchname = invoice.getBranchInformation().getBranchName();
//			for (BranchProductTarget brprodtarget : brprodtarlist) {
//				String branchname2 = brprodtarget.getBranchInformation().getBranchName();
//				if (branchname == branchname2) {
//					l.add(branchname);
//
//					Set<ProductPriceMapping> ppm = invoice.getProductQuantity().keySet();
//					System.out.println("set of prodprice mapping of invoice---" + ppm);
//					for (ProductPriceMapping pr : ppm) {
//						String productname = pr.getProductInformation().getProductName();
//						System.out.println(productname);
//
//						Set<ProductPriceMapping> ppm1 = brprodtarget.getPmap().keySet();
//						System.out.println("set of prodprice mapping of branchproducttarget----" + ppm1);
//
//						for (ProductPriceMapping pr1 : ppm1) {
//							String productname1 = pr1.getProductInformation().getProductName();
//							if (productname.equals(productname1)) {
//								l.add(productname1);
//
//								InvoiceProductWiseQuantity ipwq = invoice.getProductQuantity().get(pr);
//								BranchProductTargetQuantity bptq = brprodtarget.getPmap().get(pr1);
//
//								int invoicewiseprodquantity = ipwq.getInvoiceproductwisequantity();
//								int branchinitialquantity = bptq.getInitialTargetQuantity();
//
//								l.add(invoicewiseprodquantity);
//								l.add(branchinitialquantity);
//								// l.add(ipwq);
//								// l.add(bptq);
//
//							}
//						}
//
//					}
//
//				}
//			}
*/
		


		return null;
	}



	

	//<**********************************************************************************************>


}

package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.MyOpenTask_Action;
import appModules.RFS_Action;
import appModules.SignIn_Action;
import pageObjects.BaseClass;
import pageObjects.My_Open_Task;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Framework_002 extends Utils {






	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
  @BeforeMethod
 
  
  public void beforeMethod() throws Exception {
	   DOMConfigurator.configure("log4j.xml");
	  	
	  	sTestCaseName = this.toString();
	  	sTestCaseName = Utils.getTestCaseName(this.toString());
	  	Log.startTestCase(sTestCaseName);
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet2");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		
		driver = Utils.OpenBrowser(iTestCaseRow);
		new BaseClass(driver);  
		System.out.println("driver id " +driver); 
  }
  
  
  @Test 
  public void main() throws Exception {
	  WebElement e;
	  
	  try{
		  WebDriverWait wait = new WebDriverWait(driver, 150);
		  driver.manage().window().maximize();
		  
		
		  SignIn_Action.Execute(iTestCaseRow);
			 MyOpenTask_Action.click_MyOpenTask(iTestCaseRow);
			
			
			 Thread.sleep(50000);
	     
			
	    	MyOpenTask_Action.search_box(iTestCaseRow);
	    	System.out.println("entered value in search box");
	    	Thread.sleep(30000);
	    	MyOpenTask_Action.search_button(iTestCaseRow);
	    	Thread.sleep(7000);
	    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (1)*****************************");
    	Thread.sleep(70000);
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(70000);
    		   	 	
    	//#KCL RFS Process - Draft RFS Task with RFS #: 1001602269, Requester Name: Rahul Billorey
    	//Requester info section 	
		 My_Open_Task.txt_req_info_frst_name();
		 My_Open_Task.txt_req_info_last_name();
		 My_Open_Task.rfs_subsn_req_info_kaust_id();
		 My_Open_Task.txt_req_info_email();
		 My_Open_Task.txt_req_info_depart();
		 My_Open_Task.txt_req_info_tel();
		 My_Open_Task.rfs_subsn_req_info_mob();
		 My_Open_Task.rfs_subsn_req_info_pock_id();
		 My_Open_Task.txt_req_info_position();
		 My_Open_Task.rfs_subsn_req_info_pi_name();
		 My_Open_Task.rfs_subsn_req_info_pi_kaust_id();
		 My_Open_Task.rfs_subsn_req_info_pi_email();
		 My_Open_Task.rfs_subsn_req_info_pi_pos();
		 My_Open_Task.rfs_subsn_req_info_pi_tel();
		 
		 MyOpenTask_Action.clickOnNext(iTestCaseRow);
    	 Thread.sleep(2000);
    	
    	
    	//Service Area section
		 My_Open_Task.drp_dn_ser_area_sec_ser_area();
		 My_Open_Task.txt_ser_area_sec_req_complt_date();
		 My_Open_Task.txt_ser_area_sec_aim_of_study();
		 My_Open_Task.ser_area_sec_browse_btn();
		 My_Open_Task.ser_area_sec_upload_btn();
		 Thread.sleep(2000);
    	 MyOpenTask_Action.method(iTestCaseRow);
    	 MyOpenTask_Action.expectedData(iTestCaseRow);
    	 MyOpenTask_Action.clickOnNext(iTestCaseRow);
    	 Thread.sleep(2000);
    	
    	
    	
    	 //Sample section
		 My_Open_Task.txt_sam_sec_no_of_sam();
		 My_Open_Task.rfs_subsn_sam_sec_toxic_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_solid_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_powder_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_film_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_organic_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_inorganic_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_fluid_chkbx();
		 My_Open_Task.txt_sam_sec_sampls_data_specy();
		 My_Open_Task.sam_sec_browse_btn();
		 My_Open_Task.sam_sec_upld_btn();
		 MyOpenTask_Action.speci_instruc(iTestCaseRow);
    	 MyOpenTask_Action.clickOnNext(iTestCaseRow);
    	 Thread.sleep(5000);
    	
    	
    	 //Sample delivery section
		 My_Open_Task.sam_del_sec_ret_sampls_chkbx();
		 My_Open_Task.sam_del_sec_sam_del_mod();
		 My_Open_Task.sam_del_sec_reprt();
		 
    	MyOpenTask_Action.submitbutton(iTestCaseRow);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(70000);
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	Thread.sleep(50000);
    	
    	
    		MyOpenTask_Action.refresh(iTestCaseRow);
    	
    	
    	Thread.sleep(70000);
    	/*MyOpenTask_Action.reset_btn(iTestCaseRow);
    	Thread.sleep(5000);
    	MyOpenTask_Action.search_box(iTestCaseRow);
    	MyOpenTask_Action.search_button(iTestCaseRow);
    	Thread.sleep(2000);*/
    	Thread.sleep(70000);
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (2)*****************************");
    	Thread.sleep(5000);
    	//#KCL RFS Process - Review RFS Task with RFS #: 1001602340, Requester Name: Rahul Billorey
    	
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(15000);
		//Requester info section 	
    	My_Open_Task.txt_req_info_frst_name();
		 My_Open_Task.txt_req_info_last_name();
		 My_Open_Task.rfs_subsn_req_info_kaust_id();
		 My_Open_Task.txt_req_info_email();
		 My_Open_Task.txt_req_info_depart();
		 My_Open_Task.txt_req_info_tel();
		 My_Open_Task.rfs_subsn_req_info_mob();
		 My_Open_Task.rfs_subsn_req_info_pock_id();
		 My_Open_Task.txt_req_info_position();
		 My_Open_Task.rfs_subsn_req_info_pi_name();
		 My_Open_Task.rfs_subsn_req_info_pi_kaust_id();
		 My_Open_Task.rfs_subsn_req_info_pi_email();
		 My_Open_Task.rfs_subsn_req_info_pi_pos();
		 My_Open_Task.rfs_subsn_req_info_pi_tel();
    	MyOpenTask_Action.clickOnNext(iTestCaseRow);
    	Thread.sleep(2000);
    	
    	
    	//Service Area section
    	 My_Open_Task.drp_dn_ser_area_sec_ser_area();
		 My_Open_Task.txt_ser_area_sec_req_complt_date();
		 My_Open_Task.txt_ser_area_sec_aim_of_study();
		 My_Open_Task.ser_area_sec_browse_btn();
		 My_Open_Task.ser_area_sec_upload_btn();
		 My_Open_Task.txt_ser_area_sec_methd();
		 My_Open_Task.txt_ser_area_sec_exp_date();
    	 MyOpenTask_Action.clickOnNext(iTestCaseRow);
    	Thread.sleep(2000);
    	
    	
    	
    	 //Sample section
    	My_Open_Task.txt_sam_sec_no_of_sam();
		 My_Open_Task.rfs_subsn_sam_sec_toxic_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_solid_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_powder_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_film_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_organic_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_inorganic_chkbx();
		 My_Open_Task.rfs_subsn_sam_sec_fluid_chkbx();
		 My_Open_Task.txt_sam_sec_sampls_data_specy();
		 My_Open_Task.sam_sec_browse_btn();
		 My_Open_Task.sam_sec_upld_btn();
		 My_Open_Task.txt_sam_sec_specific_inst();
    	MyOpenTask_Action.clickOnNext(iTestCaseRow);
    	Thread.sleep(2000);
    	
    	
    	 //Sample delivery section
		 My_Open_Task.sam_del_sec_ret_sampls_chkbx();
		 My_Open_Task.sam_del_sec_sam_del_mod();
		 My_Open_Task.sam_del_sec_reprt();
    	MyOpenTask_Action.approvebutton(iTestCaseRow);
    	
    	

		 //Scope and changes
		 My_Open_Task.Equipment_drp_dwn1();
		 //Remove po is missing
		
    	MyOpenTask_Action.routine_chkbx(iTestCaseRow);
    	MyOpenTask_Action.advance_chkbx(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.sample_clarifications(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.method_applied(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.deliverables(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.sample_storg_loc_and_cond(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.equi_drpdn(iTestCaseRow);
    	
    	MyOpenTask_Action.equi_drpdn_option(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.quantity1(iTestCaseRow);
    	MyOpenTask_Action.SampConsum_drp_dwn(iTestCaseRow);
    	MyOpenTask_Action.SampConsum_drp_dwn_optn_select(iTestCaseRow);
    	MyOpenTask_Action.quantity_txt2(iTestCaseRow);
    	My_Open_Task.scop_eqipmnt_add_btn();
    	My_Open_Task.scop_eqipmnt_rmv_btn();
    	MyOpenTask_Action.analysis_reporting(iTestCaseRow);
    	MyOpenTask_Action.Equi_set_up(iTestCaseRow);
    	MyOpenTask_Action.Measurement(iTestCaseRow);
    	MyOpenTask_Action.Request_review(iTestCaseRow);
    	//MyOpenTask_Action.Sample_preparation(iTestCaseRow);
    	Thread.sleep(5000);
    	MyOpenTask_Action.Calender(iTestCaseRow);
    	
    	Thread.sleep(15000);
    	MyOpenTask_Action.submitbutton(iTestCaseRow);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(70000);
    	
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	Thread.sleep(5000);
    	
    	MyOpenTask_Action.refresh(iTestCaseRow);
    	
    	Thread.sleep(70000);
    	/*MyOpenTask_Action.search_button(iTestCaseRow);*/
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (3)*****************************");
    	Thread.sleep(50000);
    	//KCL RFS Process - Service Scope and Charges Review Task with RFS #: 1001602379, Requester Name: Rahul Billorey
    	
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(15000);
    
    	My_Open_Task.scop_routine_chkbx();
    	My_Open_Task.scop_advance_chkbx();
    	My_Open_Task.txt_scop_sam_clarfcsn();
    	My_Open_Task.txt_scop_methd_applied();
    	My_Open_Task.txt_scop_delvrbls();
    	My_Open_Task.txt_scop_sam_storg_loc_and_cond();
    	My_Open_Task.scop_eqipmnt_add_btn();
    	
    	My_Open_Task.scop_eqipmnt_rmv_btn();
    	Thread.sleep(1000);
    	My_Open_Task.scop_and_charges_man_power_ana_reporting();
    	Thread.sleep(1000);
    	My_Open_Task.scop_and_charges_man_power_measurement();
    	
    	//My_Open_Task.Man_Power_Measurement();
    	//My_Open_Task.Man_Power_Request_review();
    	My_Open_Task.scop_and_charges_man_power_eqip_setup();
    	Thread.sleep(5000);
    	
    	MyOpenTask_Action.scop_and_charges_approve_btn(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(70000);
    	
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	Thread.sleep(5000);
    	
    	MyOpenTask_Action.refresh(iTestCaseRow);
    	
    	Thread.sleep(70000);
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (4)*****************************");
    	
    	//KCL RFS Process - Service Scope and Charges Acceptance Task with RFS #: 1001602379, Requester Name: Rahul Billorey
    	Thread.sleep(5000);
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(5000);
    	My_Open_Task.scop_routine_chkbx();
    	My_Open_Task.scop_advance_chkbx();
    	My_Open_Task.txt_scop_sam_clarfcsn();
    	My_Open_Task.txt_scop_methd_applied();
    	My_Open_Task.txt_scop_delvrbls();
    	My_Open_Task.txt_scop_sam_storg_loc_and_cond();
    	My_Open_Task.scop_eqipmnt_add_btn();
    	
    	My_Open_Task.scop_eqipmnt_rmv_btn();
    	Thread.sleep(2000);
    	My_Open_Task.scop_and_charges_man_power_ana_reporting();
    	Thread.sleep(2000);
    	My_Open_Task.scop_and_charges_man_power_measurement();
    	
    	//My_Open_Task.Man_Power_Measurement();
    	//My_Open_Task.Man_Power_Request_review();
    	My_Open_Task.scop_and_charges_man_power_eqip_setup();
    	Thread.sleep(2000);
    	MyOpenTask_Action.scop_man_accept_btn(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(8000);
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	Thread.sleep(5000);
    	
    		MyOpenTask_Action.refresh(iTestCaseRow);
    	
    	Thread.sleep(70000);
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (5)*****************************");
    	Thread.sleep(5000);
    	
    	//KCL RFS Process - Lab Team Member Assignment Task after Service Scope and Charges Acceptance with RFS #: 1001602379, Requester Name: Rahul Billorey
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(15000);
    	My_Open_Task.scop_routine_chkbx();
    	My_Open_Task.scop_advance_chkbx();
    	My_Open_Task.txt_scop_sam_clarfcsn();
    	My_Open_Task.txt_scop_methd_applied();
    	My_Open_Task.txt_scop_delvrbls();
    	My_Open_Task.txt_scop_sam_storg_loc_and_cond();
    	My_Open_Task.scop_eqipmnt_add_btn();
    	
    	My_Open_Task.scop_eqipmnt_rmv_btn();
    	Thread.sleep(2000);
    	My_Open_Task.scop_and_charges_man_power_ana_reporting();
    	Thread.sleep(2000);
    	My_Open_Task.scop_and_charges_man_power_measurement();
    	
    	//My_Open_Task.Man_Power_Measurement();
    	//My_Open_Task.Man_Power_Request_review();
    	My_Open_Task.scop_and_charges_man_power_eqip_setup();
    	Thread.sleep(2000);
    	MyOpenTask_Action.Assigned_Scientist(iTestCaseRow);
    	MyOpenTask_Action.Assigned_Scientist_option(iTestCaseRow);
    	Thread.sleep(2000);
    	MyOpenTask_Action.submitbutton(iTestCaseRow);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(8000);
    	
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	Thread.sleep(5000);
    	//*[@id="uiTable1-rows-row0-col0"]
    		MyOpenTask_Action.refresh(iTestCaseRow);
    	Thread.sleep(70000);
    MyOpenTask_Action.clickOnLink(iTestCaseRow);
    System.out.println("******************************clicked on link (6)*****************************");
    	
    	//KCL RFS Process - Report Preparation Task with RFS #: 1001602379, Requester Name: Rahul Billorey
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(15000);
		 My_Open_Task.txt_rfs_rep_reprt_no();
		 My_Open_Task.txt_rfs_rep_rfs_no();
		 My_Open_Task.txt_rfs_rep_prep_by();
		 My_Open_Task.txt_rfs_rep_fname();
		 My_Open_Task.txt_rfs_rep_lname();
		 My_Open_Task.txt_rfs_rep_kasut_id();
		 My_Open_Task.txt_rfs_rep_dep();
		 My_Open_Task.txt_rfs_rep_tel();
		 My_Open_Task.txt_rfs_rep_email();
		 My_Open_Task.txt_rfs_rep_no_of_sampls();
		 My_Open_Task.txt_rfs_rep_sampls_data_specy();
		 My_Open_Task.txt_rfs_rep_ser_scope();
    	MyOpenTask_Action.Samples(iTestCaseRow);
    	MyOpenTask_Action.Summary(iTestCaseRow);
    	MyOpenTask_Action.Results(iTestCaseRow);
    	//browse missing
    	MyOpenTask_Action.uplaod_file(iTestCaseRow);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(8000);
    	MyOpenTask_Action.submitbutton(iTestCaseRow);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(8000);
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	Thread.sleep(8000);
    		MyOpenTask_Action.refresh(iTestCaseRow);
    	
    	
    	
    	Thread.sleep(70000);
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (7)*****************************");
    	
    	//KCL RFS Process - Report Acceptance Task with RFS #: 1001602379, Requester Name: Rahul Billorey
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(8000);
    	My_Open_Task.txt_rfs_rep_reprt_no();
		 My_Open_Task.txt_rfs_rep_rfs_no();
		 My_Open_Task.txt_rfs_rep_prep_by();
		 My_Open_Task.txt_rfs_rep_fname();
		 My_Open_Task.txt_rfs_rep_lname();
		 My_Open_Task.txt_rfs_rep_kasut_id();
		 My_Open_Task.txt_rfs_rep_dep();
		 My_Open_Task.txt_rfs_rep_tel();
		 My_Open_Task.txt_rfs_rep_email();
		 My_Open_Task.txt_rfs_rep_no_of_sampls();
		 My_Open_Task.txt_rfs_rep_sampls_data_specy();
		 My_Open_Task.txt_rfs_rep_ser_scope();
		 My_Open_Task.txt_rfs_rep_sampls();
		 My_Open_Task.txt_rfs_rep_sumry_of_analytical_methd();
		 My_Open_Task.txt_rfs_rep_results();
		 My_Open_Task.rfs_rep_upld_any_nessry_docs_browse_btn();
		 My_Open_Task.rfs_rep_upld_any_nessry_docs_upload_btn();
		 Thread.sleep(2000);
		 
    	MyOpenTask_Action.comments(iTestCaseRow);
    	MyOpenTask_Action.accept_btn(iTestCaseRow);
    	MyOpenTask_Action.average(iTestCaseRow);
    	MyOpenTask_Action.comments2(iTestCaseRow);
    	MyOpenTask_Action.submitbutton(iTestCaseRow);
    	Thread.sleep(8000);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	Thread.sleep(70000);
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	
    	MyOpenTask_Action.refresh(iTestCaseRow);
    	
    	Thread.sleep(70000);
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (8)*****************************");
    	Thread.sleep(5000);
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(5000);
    	My_Open_Task.txt_rfs_rep_reprt_no();
    	Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_rfs_no();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_prep_by();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_fname();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_lname();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_kasut_id();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_dep();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_tel();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_email();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_no_of_sampls();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_sampls_data_specy();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_ser_scope();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_sampls();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_sumry_of_analytical_methd();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_results();
		 Thread.sleep(2000);
		 My_Open_Task.rfs_rep_upld_any_nessry_docs_browse_btn();
		 Thread.sleep(2000);
		 My_Open_Task.rfs_rep_upld_any_nessry_docs_upload_btn();
		 Thread.sleep(2000);
		 My_Open_Task.txt_comments();
		 Thread.sleep(2000);
		 //My_Open_Task.btn_accept();
		 My_Open_Task.rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx();
		 Thread.sleep(2000);
		 My_Open_Task.rfs_rep_reqstr_feedbk_comments();
		 Thread.sleep(2000);
    	MyOpenTask_Action.close(iTestCaseRow);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	
    	Thread.sleep(20000);
    	
    	MyOpenTask_Action.frame_swich1(iTestCaseRow);
    	
    		System.out.println(" enter loop");
    		MyOpenTask_Action.refresh(iTestCaseRow);
    	Thread.sleep(70000);
    	MyOpenTask_Action.clickOnLink(iTestCaseRow);
    	System.out.println("******************************clicked on link (9)*****************************");
    	MyOpenTask_Action.frame_swich(iTestCaseRow);
    	Thread.sleep(70000);
    	My_Open_Task.txt_rfs_rep_reprt_no();
    	Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_rfs_no();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_prep_by();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_fname();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_lname();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_kasut_id();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_dep();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_tel();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_email();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_no_of_sampls();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_sampls_data_specy();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_ser_scope();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_sampls();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_sumry_of_analytical_methd();
		 Thread.sleep(2000);
		 My_Open_Task.txt_rfs_rep_results();
		 Thread.sleep(2000);
		 My_Open_Task.rfs_rep_upld_any_nessry_docs_browse_btn();
		 Thread.sleep(2000);
		 My_Open_Task.rfs_rep_upld_any_nessry_docs_upload_btn();
		 Thread.sleep(2000);
		 My_Open_Task.txt_comments();
		 Thread.sleep(2000);
		 //My_Open_Task.btn_accept();
		 My_Open_Task.rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx();
		 Thread.sleep(2000);
		 My_Open_Task.rfs_rep_reqstr_feedbk_comments();
		 
		 Thread.sleep(2000);
    	MyOpenTask_Action.submitbutton(iTestCaseRow);
    	Thread.sleep(70000);
    	MyOpenTask_Action.pop_up2(iTestCaseRow);
    	//KCL RFS Process - Close RFS Task with RFS #: 1001602379, Requester Name: Rahul Billorey
    	
    	//MyOpenTask_Action.frame_swich(iTestCaseRow);
    	
    	
    	
    	
    	
    	
    	if(BaseClass.bResult==true){
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
		}else{
			throw new Exception("Test Case Failed because of Verification");
		}
		
	   
	  }catch (Exception e1){
		
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
		
		  Utils.takeScreenshot(driver, sTestCaseName);
		
		  Log.error(e1.getMessage());
		
		  throw (e1);
	  }
		
  }
  
  
  

		
  		
  @AfterMethod
  public void afterMethod() {
	
	   Log.endTestCase(sTestCaseName);
	   
	  
	  //  driver.close();
	   
  		}

}
package appModules;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.My_Open_Task;
import pageObjects.New_RFS;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class MyOpenTask_Action extends BaseClass{

	public MyOpenTask_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public static void click_MyOpenTask(int iTestCaseRow) throws Exception{
	       
    	Log.info("page loades in the browser" );
    	 
        My_Open_Task.my_open_task().click();
        Log.info("Click action is performed on My open task button clicked");
        Reporter.log("My open task click action performed ");
    }

	
	
	
	public static void search_box(int iTestCaseRow) throws Exception{   
        //sample/data specifications
        String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_search);
        My_Open_Task.txt_search().sendKeys(sample_data);
        System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
        Log.info(sample_data+" is entered in search text box" );
        Thread.sleep(10000);
    	/*Robot robot= new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
        Log.info(sample_data+" is clicked on  search text box" );*/ }
	
	public static void search_button(int iTestCaseRow) throws Exception{
	
		Actions action20 = new Actions(driver); 
	     action20.moveToElement(My_Open_Task.search_btn()).click().perform();
       Log.info("clicked on search button ");
       Reporter.log(" search is clicked ");}
	
	public static void clickOnLink(int iTestCaseRow) throws Exception{
		
		Actions action20 = new Actions(driver); 
	     action20.moveToElement(My_Open_Task.task_title_link()).click().build().perform();
	     System.out.println("clicked on link in new RFS Tasks  ");
       Log.info("clicked on link ");
       Reporter.log("link is clicked ");}
	
	
	
	public static void frame_swich(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 System.out.println("RFS action swich to frame >>>>>>  ");
     //   New_RFS.selec_drop_list().click();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 WebElement element = driver.findElement(By.xpath("//*[@id='iframeId']"));
 	 	 driver.switchTo().frame(element);
    	System.out.println("RFS action has swiched to frame >>>>>>  ");
       
    	Log.info("framr switch from action");
        Reporter.log("frame switch from action");
    }
	
	
	//*[@id='iframeId']
	
public static void clickOnNext(int iTestCaseRow) throws Exception{
		
		Actions action20 = new Actions(driver); 
	     action20.moveToElement(My_Open_Task.btn_rfs_next()).click().perform();
       Log.info("clicked on next ");
       Reporter.log("next is clicked ");}
	
	
public static void method(int iTestCaseRow) throws Exception{   
    //sample/data specifications	
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_ser_area_sec_methd);
    My_Open_Task.txt_ser_area_sec_methd().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in method text box" );}
	
public static void expectedData(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_ser_area_sec_exp_date);
    My_Open_Task.txt_ser_area_sec_exp_date().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in expectedData text box" );}	
		
public static void speci_instruc(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_sam_sec_specific_inst);
    My_Open_Task.txt_sam_sec_specific_inst().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in speci_instruc text box" );}		
	
public static void submitbutton(int iTestCaseRow) throws Exception{ //  ************************************************************************
	
	
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.btn_submit()).click().perform();
  Log.info("clicked on submit button ");
  Reporter.log("submit button is clicked ");}	
	
public static void reset_btn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.reset_btn()).click().perform();
  Log.info("clicked on reset_btn ");
  Reporter.log("reset_btn is clicked ");}


public static void pop_up2(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.pop_up2()).click().perform();
  Log.info("clicked on pop-up ");
  Reporter.log("pop-up is clicked ");}
	
public static void frame_swich1(int iTestCaseRow) throws Exception{
    
	Log.info("click on drop down starts" );
	 System.out.println("RFS action swich to frame >>>>>>  ");
 //   New_RFS.selec_drop_list().click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 //WebElement element = driver.findElement(By.xpath("//*[@id='iframeId']"));
	 	 driver.switchTo().defaultContent();
	System.out.println("RFS action has swiched to default Content >>>>>>  ");
   
	Log.info("framr switch from action defaultContent");
    Reporter.log("frame switch from action defaultContent");
}	

public static void refresh(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.refresh_btn()).click().perform();
  Log.info("clicked on refresh ");
  Reporter.log("refresh is clicked ");}
	

public static void approvebutton(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.approve_btn()).click().perform();
  Log.info("clicked on approve ");
  Reporter.log("approve is clicked ");}

public static void scop_and_charges_approve_btn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.scop_and_charges_approve_btn()).click().perform();
  Log.info("clicked on approve ");
  Reporter.log("approve is clicked ");}

public static void scop_man_accept_btn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.scop_man_accept_btn()).click().perform();
  Log.info("clicked on approve ");
  Reporter.log("approve is clicked ");}





public static void routine_chkbx(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.scop_routine_chkbx()).click().perform();
  Log.info("clicked on routine chkbx ");
  Reporter.log("routine_chkbx is clicked ");}

public static void advance_chkbx(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.scop_advance_chkbx()).click().perform();
  Log.info("clicked on advance_chkbx ");
  Reporter.log("advance_chkbx is clicked ");}

public static void sample_clarifications(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_scop_sam_clarfcsn);
    Actions action20 = new Actions(driver); 
    My_Open_Task.txt_scop_sam_clarfcsn().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data Col_txt_scop_sam_clarfcsn > " +sample_data);
    Log.info(sample_data+" is entered in sample clarifications text box" );}

public static void method_applied(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_scop_methd_applied);
    My_Open_Task.txt_scop_methd_applied().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in method_applied text box" );}



public static void deliverables(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_scop_delvrbls);
    My_Open_Task.txt_scop_delvrbls().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in deliverables text box" );}

public static void sample_storg_loc_and_cond(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_scop_sam_storg_loc_and_cond);
    My_Open_Task.txt_scop_sam_storg_loc_and_cond().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}

public static void equi_drpdn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.Equipment_drp_dwn1()).click().perform();
  Log.info("clicked on equi_drpdn ");
  Reporter.log("equi_drpdn is clicked ");}

public static void equi_drpdn_option(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.Equipment_drp_dwn_optn_select1()).click().perform();
  Log.info("clicked on equi_drpdn ");
  Reporter.log("equi_drpdn is clicked ");}

public static void quantity1(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_quantity_txt1);
    My_Open_Task.quantity_txt1().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}

public static void add_btn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.scop_eqipmnt_add_btn()).click().perform();
  Log.info("clicked on add btn ");
  Reporter.log("add btn is clicked ");}

public static void analysis_reporting(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Man_Power_Analysis_reporting);
    My_Open_Task.Man_Power_Analysis_reporting().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}

public static void Equi_set_up(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Man_Power_Equi_set_up);
    My_Open_Task.Man_Power_Equi_set_up().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}


public static void Measurement(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Man_Power_Measurement);
    My_Open_Task.Man_Power_Measurement().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}

public static void Request_review(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Man_Power_Request_review);
    My_Open_Task.Man_Power_Request_review().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}

public static void Sample_preparation(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Man_Power_Sample_preparation);
    My_Open_Task.Man_Power_Sample_preparation().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in sample_storg_loc_and_cond text box" );}

public static void accept_btn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.btn_accept()).click().perform();
  Log.info("clicked on accept_btn ");
  Reporter.log("accept_btn is clicked ");}


public static void Assigned_Scientist(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.Assigned_Scientist_drpdn()).click().perform();
  Log.info("clicked on Assigned_Scientist ");
  Reporter.log("Assigned_Scientist is clicked ");}

public static void Assigned_Scientist_option(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.Assigned_Scientist_drpdn_option()).click().perform();
  Log.info("clicked on Assigned_Scientist_option ");
  Reporter.log("Assigned_Scientist_option is clicked ");}



public static void Samples(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_rfs_rep_sampls);
    My_Open_Task.txt_rfs_rep_sampls().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in Samples text box" );}

public static void Summary(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_rfs_rep_sumry_of_analytical_methd);
    My_Open_Task.txt_rfs_rep_sumry_of_analytical_methd().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in Summary text box" );}

public static void Results(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_rfs_rep_results);
    My_Open_Task.txt_rfs_rep_results().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in Results text box" );}

public static void uplaod_file(int iTestCaseRow) throws Exception{
    Actions action8 = new Actions(driver); 
    action8.moveToElement(My_Open_Task.rfs_rep_upld_any_nessry_docs_browse_btn()).click().perform();
    Log.info("clicked on browse button ");
    Reporter.log("browse button is clicked ");
    
    String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file1);
    System.out.println("RFS_Action  -----    row  > " +iTestCaseRow);
    System.out.println("RFS_Action  -----    col  > " +Constant.Col_file1);
    System.out.println("RFS_Action  -----    file > " +file);
	StringSelection selection=new StringSelection(file);
	Thread.sleep(5000);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
    Actions action9 = new Actions(driver); 
    action9.moveToElement(My_Open_Task.rfs_rep_upld_any_nessry_docs_upload_btn()).click().perform();
    Log.info("clicked on upload button ");
    Reporter.log(" upload is clicked ");
    
    Actions action10 = new Actions(driver); 
    action10.moveToElement(My_Open_Task.pop_up2()).click().perform();
    Log.info("clicked on pop-up ");
    Reporter.log("pop-up is clicked ");

}

public static void comments(int iTestCaseRow) throws Exception{
	String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_txt_comments);
    My_Open_Task.txt_comments().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in comments text box" );}

public static void average(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx()).click().perform();
  Log.info("clicked on averag ");
  Reporter.log("averag is clicked ");}


public static void comments2(int iTestCaseRow) throws Exception{
	String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_rfs_rep_reqstr_feedbk_comments);
    My_Open_Task.rfs_rep_reqstr_feedbk_comments().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in comments text box" );}



public static void close(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.btn_close()).click().perform();
  Log.info("clicked on close  rfs ");
  Reporter.log("close rfs is clicked ");}



public static void SampConsum_drp_dwn(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.SampConsum_drp_dwn1()).click().perform();
  Log.info("clicked on SampConsum_drp_dwn ");
  Reporter.log("SampConsum_drp_dwn is clicked ");}

public static void SampConsum_drp_dwn_optn_select(int iTestCaseRow) throws Exception{   
	Actions action20 = new Actions(driver); 
    action20.moveToElement(My_Open_Task.SampConsum_drp_dwn_optn_select1()).click().perform();
  Log.info("clicked on SampConsum_drp_dwn_optn_select ");
  Reporter.log("SampConsum_drp_dwn_optn_select is clicked ");}

public static void quantity_txt2(int iTestCaseRow) throws Exception{   
    //sample/data specifications
    String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_quantity_txt2);
    My_Open_Task.quantity_txt2().sendKeys(sample_data);
    System.out.println("MyOpenTask_Action  -----    sample_data > " +sample_data);
    Log.info(sample_data+" is entered in quantity_txt2" );}


public static void Calender(int iTestCaseRow) throws Exception{	

	
driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-icon']")).click(); 

String Smonth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_month1);
String Sdate= ExcelUtils.getCellData(iTestCaseRow, Constant.Col_date1);
System.out.println("date before  "+Sdate);
System.out.println("month before "+Smonth);
				int x = Integer.parseInt(Smonth);
                int b = Integer.parseInt(Sdate);
                
                System.out.println("month after "+x);
                
                System.out.println("date after "+b);
                
String monthString;

  switch (x) {
    case 1:  monthString = "January";
             break;
    case 2:  monthString = "February";
             break;
    case 3:  monthString = "March";
             break;
    case 4:  monthString = "April";
             break;
    case 5:  monthString = "May";
             break;
    case 6:  monthString = "June";
             break;
    case 7:  monthString = "July";
             break;
    case 8:  monthString = "August";
             break;
    case 9:  monthString = "September";
             break;
    case 10: monthString = "October";
             break;
    case 11: monthString = "November";
             break;
    case 12: monthString = "December";
             break;
    default: monthString = "Invalid month";
             break;
}





 List<WebElement> Melements = driver.findElements(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']"));
    System.out.println("list size" + Melements.size());
    for (int i = 1; i < Melements.size()+1; i++) {
        WebElement linkElement = driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']"));
        System.out.println("list containt " + linkElement.getText());
        
      //*[@id="__xmlview10--reqcompdate-cal--MP"]
        
      //  String month = "November";
        
   if(linkElement.getText() == monthString ){
	   
	   break;
	   
   }
   
   else {
	  int month1= x; 	
	  
	   
	     switch (month1) {
         case 1:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
				  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m0']")).click();
                  break;
         case 2:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m1']")).click();
                  break;
         case 3:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m2']")).click();
                  break;
         case 4:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m3']")).click();
                  break;
         case 5:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  	      driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m4']")).click();
                  break;
         case 6:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  	      driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m5']")).click();
                  break;
         case 7:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m6']")).click();
                  break;
         case 8:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m7']")).click();
                  break;
         case 9:  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m8']")).click();
                  break;
         case 10: driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m9']")).click();
                  break;
         case 11: driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m10']")).click();
                  break;
         case 12: driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--MP-m11']")).click();
                  break;
         default: monthString = "Invalid month";
                  break;
   }
  
    }
   
   String s1 ;
   
   if(x<=9)  {
   
	    s1 = "0";
   
   }
   else{
	   
	   s1= "";
       
       }
   String s2;
   
    if(b<=9){
    	
	   s2 = "0";	   
            }
    else{
    	
    	s2="";
    }
    	
		
    driver.findElement(By.xpath("//*[@id='__xmlview0--dateP-cal--Month0-2017"+s1+""+x+""+s2+""+b+"']/span")).click();
   
    }







}


}



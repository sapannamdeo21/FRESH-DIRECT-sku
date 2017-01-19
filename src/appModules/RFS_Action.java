package appModules;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

import com.thoughtworks.selenium.DefaultSelenium;

import pageObjects.BaseClass;
import pageObjects.LogIn_Page;
import pageObjects.New_RFS;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class RFS_Action extends BaseClass{

	public RFS_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void cliknewRFS(int iTestCaseRow) throws Exception{
	       
    	Log.info("page loades in the browser" );
    	 
        New_RFS.clik_RFS().click();
        Log.info("Click action is performed on RFS button clicked");
        Reporter.log("RFS clic action performed ");
    }
	
	
	

	public static void frame_swich(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 System.out.println("RFS action swich to frame >>>>>>  ");
     //   New_RFS.selec_drop_list().click();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 WebElement element = driver.findElement(By.xpath("//*[@id='contentFrameId']"));
 	 	 driver.switchTo().frame(element);
    	System.out.println("RFS action has swiched to frame >>>>>>  ");
       
    	Log.info("framr switch from action");
        Reporter.log("frame switch from action");
    }
	
	
	
	public static void selecet_drop(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 
     //   New_RFS.selec_drop_list().click();
    	
        Actions action = new Actions(driver); 
       
	     //New_RFS.selec_drop_list().click();
	    // Thread.sleep(2000);
	     
	     action.moveToElement(New_RFS.selec_drop_list()).click().perform();
	     System.out.println("drivers action in drop down after click "+(driver));
	     Thread.sleep(2000);
	     
	     String drp_option = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Lab_Sel);
	     System.out.println("drivers action in drop down value from excel "+drp_option);
	     String Analytical_Core_Lab="Analytical Chemistry Core Lab";
	     
	     if(drp_option.equals("Analytical Chemistry Core Lab"))
	     {
	     Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.drp_ana_cor_lab()).click().perform();
	     Log.info("Click on drp_ana_cor_lab");
	     System.out.println("drp_ana_cor_lab "+(driver));
	     }
	     
	     Thread.sleep(5000);
	     Actions action2 = new Actions(driver); 
	     action2.moveToElement(New_RFS.btn_req_for_servi()).click().perform();
         Log.info("Click btn next button clicked");
         Reporter.log("RFS clic action performed ");
	     
	     /*Actions action2 = new Actions(driver); 
	     action2.moveToElement(New_RFS.btn_req_for_servi()).click().perform();
         Log.info("clicked on service reqiest ");
         Reporter.log("request for service clicked btn ");*/
         
         
         
	}
	
	
	public static void Requester_Info(int iTestCaseRow) throws Exception{
         
         /* del this code 
         
         Actions action6 = new Actions(driver); 
	     action6.moveToElement(New_RFS.txt_F_Name());
         Log.info("clicked on service reqiest ");
         Reporter.log("request for service clicked btn ");*/
         
         //****click on pocket id

		
		// Fname 
		
		String drp_option1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PocketIdSelection);
        Actions action3 = new Actions(driver);
        
        System.out.println("pocet id col >> " + Constant.Col_PocketIdSelection);
        System.out.println("pocet id row >> " + iTestCaseRow);
        System.out.println("pocet id >> " + drp_option1);
        Thread.sleep(4000);
        
	     action3.moveToElement(New_RFS.pock_ID_drp_dwn()).click().perform();
	     System.out.println("drivers action in drop down after click "+(driver));
	    
	  
	     Log.info("clicked on pocket ID ");
         Reporter.log("pocket id drop down clicked ");
	     Thread.sleep(3000);
	     
	   
	     Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.Pock_ID_drp_dwn_Selec_first()).click().perform();
	     Log.info("Click on inorganics");
	     System.out.println("drp inorganics "+(driver));
	     System.out.println("f name method 1");
	        New_RFS.txt_F_Name();
	        System.out.println("f name method 2");
		    New_RFS.txt_L_Name();
		    System.out.println("f name method 3");
		    New_RFS.txt_Req_Info_Sec_Kaust_ID();
		    System.out.println("f name method 4");
		    New_RFS.txt_Req_Info_Sec_Email();
		    System.out.println("f name method 5");
		    New_RFS.txt_Req_Info_Sec_Pos();
		    System.out.println("f name method 6");
		    New_RFS.txt_Req_Info_Sec_Tel();
		    System.out.println("f name method 7");
		    New_RFS.txt_Dep();
		    System.out.println("f name method 8");
		    New_RFS.txt_Pri_Inv_Sec_Kaust_ID();
		    System.out.println("f name method 9");
		    New_RFS.txt_Pri_Inv_Sec_Email();
		    System.out.println("f name method 10 ");
		    New_RFS.txt_Pri_Inv_Sec_Tel();
		    System.out.println("f name method 11");
		    New_RFS.txt_Pri_Inv_Sec_Pos();
		    System.out.println("f name method 12");
		    New_RFS.txt_Mob();
		    System.out.println("f name method 13");
		    New_RFS.txt_PI_Name();
		    System.out.println("f name method 14");
		    New_RFS.txt_Req_Info_Sec_Kaust_ID();
		    System.out.println("f name method 15");
		    New_RFS.txt_Req_Info_Sec_Pos();
		    System.out.println("f name method 16");
		    New_RFS.txt_Req_Info_Sec_Tel();
		    System.out.println("f name method 17");
	    /* //selecting option from pocket id
         
         Actions action4 = new Actions(driver); 
	     action4.moveToElement(New_RFS.Pock_ID_drp_dwn_Selec_first()).click().perform();
         Log.info("selected pocket ID option ");
         Reporter.log("pocket id drop down option selected ");*/
         
         //next button
         
         Actions action5 = new Actions(driver); 
	     action5.moveToElement(New_RFS.req_info_next_btn()).click().perform();
         Log.info("clicked next btn ");
         Reporter.log("next btn is clicked ");
         
         //txt_F_Name
         
	}
	
	public static void Service_Area_Section(int iTestCaseRow) throws Exception{
	
	
		 Actions action6 = new Actions(driver); 
		 String drp_option2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ServiceAreaSection);
		 
		 Thread.sleep(4000);
	     action6.moveToElement(New_RFS.serv_area_drp_dwn()).click().perform();
         Log.info("clicked on service area dropdown ");
         Reporter.log("service area dropdown is clicked ");
         
         String Inorganics= "Inorganics";
         if(drp_option2.equals(Inorganics))
         {
        	 Actions action1 = new Actions(driver); 
    	     action1.moveToElement(New_RFS.serv_area_drp_dwn_selec_frst()).click().perform();
    	     Log.info("Click on inorganics");
    	     System.out.println("drp inorganics "+(driver)); 
        	 
         }
	
	}
	
	public static void aim_of_study(int iTestCaseRow) throws Exception{
         String Aim = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Aimstudy);
     	 New_RFS.txt_Aim_of_stdy().sendKeys(Aim);
         System.out.println("RFS_Action  -----    Aim > " +Aim);
         Log.info(Aim+" is entered in Aim of study text box" );  }
	
    
	
	public static void expected_data(int iTestCaseRow) throws Exception{
         String Expect = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Expected_data);
     	 New_RFS.txt_exp_data_del().sendKeys(Expect);
         System.out.println("RFS_Action  -----    Expect > " +Expect);
         Log.info(Expect+" is entered in Expected data text box" ); }
	
	
	public static void method(int iTestCaseRow) throws Exception{
         String method = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_method);
     	 New_RFS.txt_meth().sendKeys(method);
         System.out.println("RFS_Action  -----    method > " +method);
         Log.info(method+" is entered in method text box" ); }
    
	
	public static void uplaod_file(int iTestCaseRow) throws Exception{
         Actions action8 = new Actions(driver); 
	     action8.moveToElement(New_RFS.serv_area_Sec_browse_btn()).click().perform();
         Log.info("clicked on browse button ");
         Reporter.log("browse button is clicked ");
         
         String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file);
         System.out.println("RFS_Action  -----    row  > " +iTestCaseRow);
         System.out.println("RFS_Action  -----    col  > " +Constant.Col_file);
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
         
         Actions action9 = new Actions(driver); 
	     action9.moveToElement(New_RFS.serv_area_Sec_upload_btn()).click().perform();
         Log.info("clicked on upload button ");
         Reporter.log(" upload is clicked ");
         
         Actions action10 = new Actions(driver); 
	     action10.moveToElement(New_RFS.pop_up()).click().perform();
         Log.info("clicked on pop-up ");
         Reporter.log("pop-up is clicked ");    //--------> pop-up
         
         Actions action11 = new Actions(driver); 
	     action11.moveToElement(New_RFS.serv_area_Sec_next_btn()).click().perform();
         Log.info("clicked on next button ");
         Reporter.log("next button is clicked ");
	}
	
	
	public static void sample_section(int iTestCaseRow) throws Exception{
		
	
		Actions action12 = new Actions(driver); 
	    action12.moveToElement(New_RFS.tab_samp_sec()).click().perform();
        Log.info("clicked on sample section tab ");
        Reporter.log("sample section tab is clicked "); }
		
		//no of sample
       
	
	public static void no_of_sample(int iTestCaseRow) throws Exception{
        String No_Samp = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_No_Samp);
    	New_RFS.txt_no_of_samp().sendKeys(No_Samp);
        System.out.println("RFS_Action  -----    No_Samp > " +No_Samp);
        Log.info(No_Samp+" is entered in no of sample text box" );  }
     
	
	public static void solid(int iTestCaseRow) throws Exception{
	      //solid
	        Actions action14 = new Actions(driver); 
		    action14.moveToElement(New_RFS.solid_chkbx()).click().perform();
	        Log.info("clicked on solid ");
	        Reporter.log("solid is clicked ");  }
	 

		
		public static void organic(int iTestCaseRow) throws Exception{
		      //Inorganic
		        Actions action18 = new Actions(driver); 
			    action18.moveToElement(New_RFS.organic_chkbx()).click().perform();
		        Log.info("clicked on organic ");
		        Reporter.log("organic is clicked "); }
		
		public static void fluid(int iTestCaseRow) throws Exception{
		      //Inorganic
		        Actions action18 = new Actions(driver); 
			    action18.moveToElement(New_RFS.fluid_chkbx()).click().perform();
		        Log.info("clicked on fluid ");
		        Reporter.log("fluid is clicked "); }
		
		public static void toxic(int iTestCaseRow) throws Exception{
		      //Inorganic
		        Actions action18 = new Actions(driver); 
			    action18.moveToElement(New_RFS.toxic_chkbx()).click().perform();
		        Log.info("clicked on toxic ");
		        Reporter.log("toxic is clicked "); }
		
		public static void film(int iTestCaseRow) throws Exception{
		      //Inorganic
		        Actions action18 = new Actions(driver); 
			    action18.moveToElement(New_RFS.film_chkbx()).click().perform();
		        Log.info("clicked on film ");
		        Reporter.log("film is clicked "); }
		
		public static void powder(int iTestCaseRow) throws Exception{
		      //Inorganic
		        Actions action18 = new Actions(driver); 
			    action18.moveToElement(New_RFS.powder_chkbx()).click().perform();
		        Log.info("clicked on powder ");
		        Reporter.log("powder is clicked "); }
 
	public static void Inorganic(int iTestCaseRow) throws Exception{
      //Inorganic
        Actions action18 = new Actions(driver); 
	    action18.moveToElement(New_RFS.inorganic_chkbx()).click().perform();
        Log.info("clicked on Inorganic ");
        Reporter.log("Inorganic is clicked "); }
       
	public static void sample_specifications(int iTestCaseRow) throws Exception{   
        //sample/data specifications
        String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_sample_data);
    	New_RFS.txt_samp_speci().sendKeys(sample_data);
        System.out.println("RFS_Action  -----    sample_data > " +sample_data);
        Log.info(sample_data+" is entered in sample/data specifications text box" ); }
       
	
	public static void specific_instuction(int iTestCaseRow) throws Exception{
        //specific instuction
        String specific_instuct = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_specific_instuct);
    	New_RFS.txt_speci_instn().sendKeys(specific_instuct);
        System.out.println("RFS_Action  -----    sample_data > " +specific_instuct);
        Log.info(specific_instuct+" is entered in specific instuction text box" );  }
        
    
	public static void upload_flie_2(int iTestCaseRow) throws Exception{
	
	Actions action20 = new Actions(driver); 
	     action20.moveToElement(New_RFS.samp_sec_browse_btn()).click().perform();
        Log.info("clicked on browse button ");
        Reporter.log("browse button is clicked ");
        
        String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file);	
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
        
        Actions action21 = new Actions(driver); 
	     action21.moveToElement(New_RFS.samp_sec_upload_btn()).click().perform();
        Log.info("clicked on upload button ");
        Reporter.log("browse upload is clicked ");
        
        Actions action10 = new Actions(driver); 
	     action10.moveToElement(New_RFS.pop_up()).click().perform();
        Log.info("clicked on pop-up ");
        Reporter.log("pop-up is clicked "); }
        
	
	public static void next(int iTestCaseRow) throws Exception{
       Actions action23 = new Actions(driver); 
	     action23.moveToElement(New_RFS.samp_sec_next_btn()).click().perform();
       Log.info("clicked on next button ");
       Reporter.log("next button is clicked ");
        
	}
	
	public static void return_samples(int iTestCaseRow) throws Exception{
		
		//return samples
		Actions action23 = new Actions(driver); 
	     action23.moveToElement(New_RFS.ret_sampls_chkbx()).click().perform();
      Log.info("clicked on return samples ");
      Reporter.log("return samples is clicked ");
	}
      //sample delivery mode
     
	public static void sample_delivery_mode(int iTestCaseRow) throws Exception{
      Actions action6 = new Actions(driver); 
		 String drp_option3 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SampleDeliveryMode);
		 
		 Thread.sleep(4000);
	     action6.moveToElement(New_RFS.samp_del_mod_arrow_btn()).click().perform();
      Log.info("clicked on sample delivery mode dropdown ");
      Reporter.log("sample delivery mode dropdown is clicked ");
      
      //String str= "Other methods, specify";
      if(drp_option3.equals("Other methods, specify"))
      {
     	 Actions action1 = new Actions(driver); 
 	     action1.moveToElement(New_RFS.samp_del_mod_selec_drp_dwn_sec()).click().perform();
 	     Log.info("Click on Other methods, specify");
 	     System.out.println("drp sample delivery mode "+(driver)); 
     	 
      }
      
      String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_other_option);
  	New_RFS.other_option_txt().sendKeys(sample_data);
      System.out.println("RFS_Action  -----    sample_data > " +sample_data);
      Log.info(sample_data+" is entered in sample/data specifications text box" );
	}
      
    
	public static void report(int iTestCaseRow) throws Exception{
      //report
      Actions action5 = new Actions(driver); 
		 String drp_option4 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_report);
		 
		 Thread.sleep(4000);
	     action5.moveToElement(New_RFS.rep_arrow_btn()).click().perform();
   Log.info("clicked on report dropdown ");
   Reporter.log("report dropdown is clicked ");
   
   //String str2= "Raw Data only";
   if(drp_option4.equals("Raw Data only"))
   {
  	 Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.rep_drp_dwn_selec_sec()).click().perform();
	     Log.info("Click on Other methods, specify");
	     System.out.println("drp sample delivery mode "+(driver)); 
  	 
   }
	}
      
	public static void submit(int iTestCaseRow) throws Exception{
   //save
   
   Actions action11 = new Actions(driver); 
   action11.moveToElement(New_RFS.samp_del_sec_save_btn()).click().perform();
   Log.info("clicked on submit button ");
   Reporter.log("submit button is clicked ");
   System.out.println("F01 starting frame switch ");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 id_entry(2);

   Actions action10 = new Actions(driver); 
   action10.moveToElement(New_RFS.pop_up()).click().perform();
  
  Log.info("clicked on pop-up ");
  Reporter.log("pop-up is clicked ");
  
 
  
  
	} 
	
	
	public static void id_entry(int iTestCaseRow) throws Exception{
		WebElement element = driver.findElement((By.xpath("//*[@id='__mbox2--msg']")));	
		 System.out.println("value of req id " +element.getAttribute("title"));
		 String S1 = element.getAttribute("title");
		 String S2 =S1.substring(29, S1.length());
		 ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet2");
		 ExcelUtils.setCellData(S2, 1, Constant.Col_txt_search);
		 ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		 System.out.println("value of req id "  + S2);
		
	}
   //save
 
     
	
	public void robot(int iTestCaseRow) throws Exception{
		String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file);	
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
		}
    
	
	
public static void Calender(int iTestCaseRow) throws Exception{	

	
driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-icon']")).click(); 

String Smonth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_month);
String Sdate= ExcelUtils.getCellData(iTestCaseRow, Constant.Col_date);
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





 List<WebElement> Melements = driver.findElements(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']"));
    System.out.println("list size" + Melements.size());
    for (int i = 1; i < Melements.size()+1; i++) {
        WebElement linkElement = driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']"));
        System.out.println("list containt " + linkElement.getText());
        
      //*[@id="__xmlview10--reqcompdate-cal--MP"]
        
      //  String month = "November";
        
   if(linkElement.getText() == monthString ){
	   
	   break;
	   
   }
   
   else {
	  int month1= x; 	
	  
	   
	     switch (month1) {
         case 1:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m0']")).click();
                  break;
         case 2:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m1']")).click();
                  break;
         case 3:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m2']")).click();
                  break;
         case 4:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m3']")).click();
                  break;
         case 5:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  	      driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m4']")).click();
                  break;
         case 6:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  	      driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m5']")).click();
                  break;
         case 7:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m6']")).click();
                  break;
         case 8:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m7']")).click();
                  break;
         case 9:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m8']")).click();
                  break;
         case 10: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
         		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m9']")).click();
                  break;
         case 11: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m10']")).click();
                  break;
         case 12: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
		  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m11']")).click();
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
    	
   
    driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Month0-2017"+s1+""+x+""+s2+""+b+"']/span")).click();
   
    }
}}
     
        

         
    
	


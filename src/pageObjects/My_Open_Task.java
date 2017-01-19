package pageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class My_Open_Task extends BaseClass {
	

	static FileInputStream file;
	static Properties prop;
	static WebDriverWait wait = new WebDriverWait(driver, 500);
	
       private static WebElement element = null;
       
	
			public My_Open_Task(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//click on My Open Task
	
			public static WebElement my_open_task() throws Exception{
		    	try{
		    		prop=new Properties();
		    		file=new FileInputStream("D://Incture//Selenium//Kaust//src//OR//xpath.properties");
		    		prop.load(file);
		    		System.out.println("driver value from Utils txtbox - " + driver );
		    		System.out.println("wait value  from Utils txtbox - " + driver );
		    		System.out.println("load prop files " );
		    		
		    		
		    		 element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("my_open_task")))); 
						boolean status = true;
						if(element.isEnabled() == status)
			            {
			            System.out.println(element.isDisplayed());
			            ExcelUtils.setCellData("editable", 2, Constant.Col_my_open_task);

			            Log.info("My Open Task is displayed  ");
			            Log.info("My Open Task is Enabled   ");
			            }else
			            {    ExcelUtils.setCellData("non-editable", 2, Constant.Col_my_open_task);
			            	Log.info("My Open Task is not displayed/enabled");
			            }
			            Log.info("Links are found on the My Open Task");
			    	}catch (Exception e){
			       		Log.error("Links are not found on the My Open Task");
			       		
			       		throw(e);
			       		}
			       	return element;
			        }
		
			//reset_btn
			public static WebElement reset_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("reset_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_task_title_link);
    	             Log.info("reset_btn is displayed");
    	             Log.info("reset_btn is enabled ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("reset_btn is not displayed/enabled  ");
    	             }
    	             Log.info("reset_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" reset_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
		    	
			
			
				
		 //click on 1st link
				
				public static WebElement task_title_link() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("task_title_link"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println("displayed element >>>>"+element.isDisplayed());
	    	             System.out.println("editable element>>>>>>"+element.isEnabled());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_task_title_link);
	    	             Log.info("1st link is displayed");
	    	             Log.info("1st link is enabled ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
	    	             	Log.info("1st link is not displayed/enabled  ");
	    	             }
	    	             Log.info("1st link has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" 1st link has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
				
				
				
				
				
				public static WebElement btn_close() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("btn_close"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_task_title_link);
	    	             Log.info("btn_close is displayed");
	    	             Log.info("btn_close is enabled ");
	    	             }else
	    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
	    	             	Log.info("btn_close is not displayed/enabled  ");
	    	             }
	    	             Log.info("btn_close has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" btn_close has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
		//*******************************************RFS submission*****************************************************		
		 //RFS submission
				
				public static WebElement tab_rfs_submsn() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_rfs_submsn"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn);

	    	             Log.info("RFS submission is displayed in task details");
	    	             Log.info("RFS submission is enabled in task details ");
	    	             }else
	    	             {
	    	            	 ExcelUtils.setCellData("not editable", 2, Constant.Col_tab_rfs_submsn);

	    	             	Log.info("JRFS submission is not displayed/enabled in task details ");
	    	             }
	    	             Log.info("RFS submission has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" RFS submission has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
		
				//---------------------------------Requester Information-----------------------------------
		//Requester Information
				
				
				public static WebElement tab_rfs_submsn_req_info() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_rfs_submsn_req_info"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn_req_info);
	    	             Log.info("Requester Information tab is displayed in RFS submission");
	    	             Log.info("Requester Information tab is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn_req_info);
	    	             	Log.info("Requester Information tab is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Requester Information has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Requester Information has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
		
	    //Requester Information //first name
				
				
				public static WebElement txt_req_info_frst_name() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_frst_name"))));	
	    	    		 System.out.println("txt_req_info_frst_name");
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println("txt_req_info_frst_name"+element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_frst_name);
	    	             Log.info("first name textbox is displayed in RFS submission");
	    	             Log.info("first name textbox is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_frst_name);
	    	             	Log.info("first name textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("first name textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" first name textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 		
				
		//last name
				
				public static WebElement txt_req_info_last_name() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_last_name"))));	
	    	    		 System.out.println("txt_req_info_last_name");
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println("txt_req_info_last_name"+element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_last_name);
	    	             Log.info("last name textbox is displayed in RFS submission");
	    	             Log.info("last name textbox is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_last_name);
	    	             	Log.info("last name textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("last name textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" last name textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 	
				
				
				public static WebElement rfs_subsn_req_info_kaust_id() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_kaust_id"))));	
	    	    		 System.out.println("txt_req_info_last_name");
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println("rfs_subsn_req_info_kaust_id"+element.isDisplayed());
	    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_req_info_kaust_id);
	    	             Log.info("kaust id textbox is displayed in RFS submission");
	    	             Log.info("kaust id textbox is enabled in RFS submission ");
	    	             }else
	    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_subsn_req_info_kaust_id);
	    	             	Log.info("kaust id textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("kaust id textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" kaust id textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 	
				
		//Type of Organization
				
				public static WebElement txt_req_info_type_of_orgnsn() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_type_of_orgnsn"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_req_info_kaust_id);
	    	             Log.info("Type of Organization textbox is displayed in RFS submission");
	    	             Log.info("Type of Organization is enabled in RFS submission ");
	    	             }else
	    	             {//   ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_subsn_req_info_kaust_id);
	    	             	Log.info("Type of Organization textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Type of Organization textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Type of Organization textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 	
				
		//Position
				
				public static WebElement txt_req_info_position() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_position"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_position);
	    	             Log.info("TPosition textbox is displayed in RFS submission");
	    	             Log.info("Position is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_position);
	    	             	Log.info("Position textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Position textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Position textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
				
				public static WebElement rfs_subsn_req_info_pi_name() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_pi_name"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_position);
	    	             Log.info("pi name textbox is displayed in RFS submission");
	    	             Log.info("pi name is enabled in RFS submission ");
	    	             }else
	    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_position);
	    	             	Log.info("pi name textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("pi name textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" pi name textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
			
		//Organization Name
				
				public static WebElement txt_req_info_org_name() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_org_name"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_org_name);
	    	             Log.info("Organization Name textbox is displayed in RFS submission");
	    	             Log.info("Organization Name is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_org_name);
	    	             	Log.info("Organization Name textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Organization Name textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Organization Name textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
				
			//Department
				
				public static WebElement txt_req_info_depart() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_depart"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_depart);
	    	             Log.info("Department textbox is displayed in RFS submission");
	    	             Log.info("Department textbox is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_depart);
	    	             	Log.info("Department textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Department textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Department textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
		  //Telephone
				
				public static WebElement txt_req_info_tel() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_tel"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_tel);
	    	             Log.info("Telephone textbox is displayed in RFS submission");
	    	             Log.info("Telephone textbox is enabled in RFS submission ");
	    	             }else
	    	             {    ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_tel);
	    	             	Log.info("Telephone textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Telephone textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Telephone textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
				
				public static WebElement rfs_subsn_req_info_mob() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_mob"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_tel);
	    	             Log.info("mobile textbox is displayed in RFS submission");
	    	             Log.info("mobile textbox is enabled in RFS submission ");
	    	             }else
	    	             {    //ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_tel);
	    	             	Log.info("mobile textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("mobile textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" mobile textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
		 //Email
				
				public static WebElement txt_req_info_email() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_email"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_email);
	    	             Log.info("Email textbox is displayed in RFS submission");
	    	             Log.info("Email textbox is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_email);
	    	             	Log.info("Email textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Email textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Email textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
				
		//Authorized Person Name
			
				public static WebElement txt_req_info_auth_Person_Name() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_auth_Person_Name"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_auth_Person_Name);
	    	             Log.info("Authorized Person Name textbox is displayed in RFS submission");
	    	             Log.info("Authorized Person Name textbox is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_auth_Person_Name);
	    	             	Log.info("Authorized Person Name textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("Authorized Person Name textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" Authorized Person Name textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    } 
				
		//KAUST Customer Account No.	
				
			 public static WebElement txt_req_info_KAUST_Cust_Acnt_No() throws Exception{
	    	    	try{
	    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_KAUST_Cust_Acnt_No"))));	
	    	     		
	    	    	     boolean status = true;
	    	 			if(element.isEnabled() == status)
	    	             {
	    	             System.out.println(element.isDisplayed());
	    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_KAUST_Cust_Acnt_No);
	    	             Log.info("KAUST Customer Account No. textbox is displayed in RFS submission");
	    	             Log.info("KAUST Customer Account No. textbox is enabled in RFS submission ");
	    	             }else
	    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_KAUST_Cust_Acnt_No);
	    	             	Log.info("KAUST Customer Account No. textbox is not displayed/enabled in RFS submission ");
	    	             }
	    	             Log.info("KAUST Customer Account No. textbox has passed element");
	    	     	}catch (Exception e){
	    	        		Log.error(" KAUST Customer Account No. textbox has fail in catch ");
	    	        		
	    	        		throw(e);
	    	        		}

	    	        	return element;
	    	           
	    	    }	
				
		//Authorized Person Email
			 
			 public static WebElement txt_req_info_Auth_Prsn_Email() throws Exception{
	 	    	try{
	 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_req_info_Auth_Prsn_Email"))));	
	 	     		
	 	    	     boolean status = true;
	 	 			if(element.isEnabled() == status)
	 	             {
	 	             System.out.println(element.isDisplayed());
	 	            ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_Auth_Prsn_Email);
	 	             Log.info("Authorized Person Email textbox is displayed in RFS submission");
	 	             Log.info("Authorized Person Email textbox is enabled in RFS submission ");
	 	             }else
	 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_Auth_Prsn_Email);
	 	             	Log.info("Authorized Person Email textbox is not displayed/enabled in RFS submission ");
	 	             }
	 	             Log.info("Authorized Person Email textbox has passed element");
	 	     	}catch (Exception e){
	 	        		Log.error(" Authorized Person Email textbox has fail in catch ");
	 	        		
	 	        		throw(e);
	 	        		}

	 	        	return element;
	 	           
	 	    }	
			 
			 //---------------------------Service Area Section---------------------------------
			 
	   //Service Area Section tab
			 
			 public static WebElement tab_rfs_submsn_ser_area_sec() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_rfs_submsn_ser_area_sec"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn_ser_area_sec);
		 	             Log.info("Service Area Section tab is displayed in RFS submission");
		 	             Log.info("Service Area Section tab is enabled in RFS submission ");
		 	             }else
		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn_ser_area_sec);
		 	             	Log.info("Service Area Section tab is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Service Area Section tab has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Service Area Section tab has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			 
		//Service Area dropdown
			 
			 public static WebElement drp_dn_ser_area_sec_ser_area() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_dn_ser_area_sec_ser_area"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	          //  ExcelUtils.setCellData("editable", 2, Constant.Col_drp_dn__ser_area_sec_ser_area);
		 	             Log.info("Service Area dropdown is displayed in RFS submission");
		 	             Log.info("Service Area dropdown is enabled in RFS submission ");
		 	             }else
		 	             {
		 	             	Log.info("Service Area dropdown is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Service Area dropdown has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Service Area dropdown has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			//Requested Completion Date txtbox
			 
			 public static WebElement txt_ser_area_sec_req_complt_date() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_ser_area_sec_req_complt_date"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            
		 	            
		 	             Log.info("Requested Completion Date txtbox is displayed in RFS submission");
		 	             Log.info("Requested Completion Date txtbox is enabled in RFS submission ");
		 	             }else
		 	             {
		 	             	Log.info("Requested Completion Date txtbox is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Requested Completion Date txtbox has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Requested Completion Date txtbox has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			 
			 
		//Aim of Study textbox
			 
			 public static WebElement txt_ser_area_sec_aim_of_study() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_ser_area_sec_aim_of_study"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_aim_of_study);
		 	             Log.info("Aim of Study txtbox is displayed in RFS submission");
		 	             Log.info("Aim of Study txtbox is enabled in RFS submission ");
		 	             }else
		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_aim_of_study);
		 	             	Log.info("Aim of Study txtbox is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Aim of Study txtbox has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Aim of Study txtbox has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			 
		//Expected Data/Deliverables txtbox
			 
			 public static WebElement txt_ser_area_sec_exp_date() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_ser_area_sec_exp_date"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
		 	             Log.info("Expected Data/Deliverables txtbox is displayed in RFS submission");
		 	             Log.info("Expected Data/Deliverables txtbox is enabled in RFS submission ");
		 	             }else
		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
		 	             	Log.info("Expected Data/Deliverables txtbox is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Expected Data/Deliverables txtbox has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Expected Data/Deliverables txtbox has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			 
			 
			 
		//Method txt box
			 
			 public static WebElement txt_ser_area_sec_methd() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_ser_area_sec_methd"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_methd);
		 	             Log.info("Method txtbox is displayed in RFS submission");
		 	             Log.info("Method txtbox is enabled in RFS submission ");
		 	             }else
		 	             {    ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_methd);
		 	             	Log.info("Method txtbox is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Method txtbox has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Method txtbox has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			 
		//Browse button
			 
			 public static WebElement ser_area_sec_browse_btn() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("ser_area_sec_browse_btn"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_ser_area_sec_browse_btn);
		 	             Log.info("Browse button is displayed in RFS submission");
		 	             Log.info("Browse button is enabled in RFS submission ");
		 	             }else
		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_ser_area_sec_browse_btn);
		 	             	Log.info("Browse button is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("Browse button has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" Browse button has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
		//uplaod button
			 
			 public static WebElement ser_area_sec_upload_btn() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("ser_area_sec_upload_btn"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_ser_area_sec_upload_btn);
		 	             Log.info("uplaod button is displayed in RFS submission");
		 	             Log.info("uplaod button is enabled in RFS submission ");
		 	             }else
		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_ser_area_sec_upload_btn);
		 	             	Log.info("uplaod button is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("uplaod button has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" uplaod button has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;
		 	           
		 	    }	
			 
		//download document link
			 
			 public static WebElement ser_area_sec_doc_name_link() throws Exception{
		 	    	try{
		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("ser_area_sec_doc_name_link"))));	
		 	     		
		 	    	     boolean status = true;
		 	 			if(element.isEnabled() == status)
		 	             {
		 	             System.out.println(element.isDisplayed());
		 	          //  ExcelUtils.setCellData("editable", 2, Constant.Col_ser_area_sec_doc_name_links);
		 	             Log.info("download document link is displayed in RFS submission");
		 	             Log.info("download document link is enabled in RFS submission ");
		 	             }else
		 	             {
		 	             	Log.info("download document link is not displayed/enabled in RFS submission ");
		 	             }
		 	             Log.info("download document link has passed element");
		 	     	}catch (Exception e){
		 	        		Log.error(" download document link has fail in catch ");
		 	        		
		 	        		throw(e);
		 	        		}

		 	        	return element;}
	 
			 
			 //--------------------------------sample section--------------------------------
		//sample section tab
		 	        	
		 	        	public static WebElement tab_rfs_submsn_sam_sec() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_rfs_submsn_sam_sec"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	             System.out.println(element.isDisplayed());
		 		 	            ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn_sam_sec);

		 		 	             Log.info("sample section tab is displayed in RFS submission");
		 		 	             Log.info("sample section tab is enabled in RFS submission ");
		 		 	             }else
		 		 	             {    ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn_sam_sec);
		 		 	             	Log.info("sample section tab is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("sample section tab has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" sample section tab has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;}
			 
			 
			// no of samples
			 
		 	        	public static WebElement txt_sam_sec_no_of_sam() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_no_of_sam"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_sam_sec_no_of_sam);
		 		 	             Log.info("no of samples txtbox is displayed in RFS submission");
		 		 	             Log.info("no of samples txtbox is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_sam_sec_no_of_sam);
		 		 	             	Log.info("no of samples txtbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("no of samples txtbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" no of samples txtbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;}
			 
			 //sample origin text box
		 	        	
		 	        	public static WebElement txt_sam_sec_sam_origin() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_sam_origin"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_sam_sec_sam_origin);
		 		 	             Log.info("sample origin text box is displayed in RFS submission");
		 		 	             Log.info("sample origin text box is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_sam_sec_sam_origin);
		 		 	             	Log.info("sample origin text box is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("sample origin text box has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" sample origin text box has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;}
			 
			 //sample name text box
		 	        	
		 	        	public static WebElement txt_sam_sec_sam_name() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_sam_name"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_sam_sec_sam_name);
		 		 	             Log.info("sample name text box is displayed in RFS submission");
		 		 	             Log.info("sample name text box is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_sam_sec_sam_name);
		 		 	             	Log.info("sample name text box is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("sample name text box has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" sample name text box has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;}
		 	        	
		 //Human origin checkbox
		 	        	
		 	        	public static WebElement chkbox_sam_sec_human_origin() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbox_sam_sec_human_origin"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_chkbox_sam_sec_human_origin);
		 		 	             Log.info("Human origin checkbox is displayed in RFS submission");
		 		 	             Log.info("Human origin checkbox is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbox_sam_sec_human_origin);
		 		 	             	Log.info("Human origin checkbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Human origin checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Human origin checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;}      	
		 	        	
		//Transformed with viral vector checkbox
		 	        	
		 	        	public static WebElement chkbox_sam_sec_trans_with_viral() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbox_sam_sec_trans_with_viral"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_chkbox_sam_sec_trans_with_viral);
		 		 	             Log.info("Transformed with viral vector checkbox is displayed in RFS submission");
		 		 	             Log.info("Transformed with viral vector checkbox is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbox_sam_sec_trans_with_viral);
		 		 	             	Log.info("Transformed with viral vector checkbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Transformed with viral vector checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Transformed with viral vector checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 
		 //Live samples checkbox
		 	        	
		 	        	public static WebElement chkbox_sam_sec_live_sampls() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbox_sam_sec_live_sampls"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_chkbox_sam_sec_live_sampls);
		 		 	             Log.info("Live samples checkbox is displayed in RFS submission");
		 		 	             Log.info("Live samples checkbox is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbox_sam_sec_live_sampls);
		 		 	             	Log.info("Live samples checkbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Live samples checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Live samples checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
		 //Samples/Data Specifications textbox
		 	        	
		 	        	public static WebElement txt_sam_sec_sampls_data_specy() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_sampls_data_specy"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_sam_sec_sampls_data_specy);
		 		 	             Log.info("Samples/Data Specifications textbox is displayed in RFS submission");
		 		 	             Log.info("Samples/Data Specifications textbox is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_sam_sec_sampls_data_specy);
		 		 	             	Log.info("Samples/Data Specifications textbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Samples/Data Specifications textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Samples/Data Specifications textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
		//Specific Instructions textbx
		 	        	
		 	        	public static WebElement txt_sam_sec_specific_inst() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_specific_inst"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_sam_sec_specific_inst);
		 		 	             Log.info("Specific Instructions textbox is displayed in RFS submission");
		 		 	             Log.info("Specific Instructions textbox is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_sam_sec_specific_inst);
		 		 	             	Log.info("Specific Instructions textbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Specific Instructions textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Specific Instructions textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
		//browse button
		 	        	
		 	        	public static WebElement sam_sec_browse_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_browse_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_sam_sec_browse_btn);
		 		 	             Log.info("browse button is displayed in RFS submission");
		 		 	             Log.info("browse button is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_sec_browse_btn);
		 		 	             	Log.info("browse button is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("browse button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" browse button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
		 	        	
	//upload button
		 	        	
		 	        	public static WebElement sam_sec_upld_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_upld_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_sam_sec_upld_btn);
		 		 	             Log.info("upload button is displayed in RFS submission");
		 		 	             Log.info("upload button is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_sec_upld_btn);
		 		 	             	Log.info("upload button is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("upload button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" upload button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
		 	        	
	//download document ink
		 	        	public static WebElement sam_sec_doc_name_link() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_doc_name_link"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_sam_sec_doc_name_link);
		 		 	             Log.info("download document ink is displayed in RFS submission");
		 		 	             Log.info("download document ink is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_sec_doc_name_link);
		 		 	             	Log.info("download document ink is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("download document ink has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" download document ink has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}return element;}
		 	        	
		 	        	
	//---------------------Sample Delivery Mode-------------------------//	 	        	
	 //Sample Delivery Section tab
		 	        	
		 	        	public static WebElement tab_rfs_submsn_sam_del_sec() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_doc_name_link"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn_sam_del_sec);
		 		 	             Log.info("Sample Delivery Section tab is displayed in RFS submission");
		 		 	             Log.info("Sample Delivery Section tab is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn_sam_del_sec);
		 		 	             	Log.info("Sample Delivery Section tab is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Sample Delivery Section tab has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Sample Delivery Section tab has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
	//Return Samples checkbox

		 	        	
		 	        	
		 	        	public static WebElement sam_del_sec_ret_sampls_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_del_sec_ret_sampls_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	              ExcelUtils.setCellData("editable", 2, Constant.Col_sam_del_sec_ret_sampls_chkbx);

		 		 	             Log.info("Return Samples checkbox is displayed in RFS submission");
		 		 	             Log.info("Return Samples checkbox tab is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_del_sec_ret_sampls_chkbx);
		 		 	             	Log.info("Return Samples checkbox is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Return Samples checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Return Samples checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}

		 		 	        	return element;} 
		 	        	
		 	        	
	//Sample Delivery Mode drop down
	 
		 	        	
		 	        	public static WebElement sam_del_sec_sam_del_mod() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_del_sec_sam_del_mod"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_sam_del_sec_sam_del_mod);
		 		 	             Log.info("Sample Delivery Mode drop down is displayed in RFS submission");
		 		 	             Log.info("Sample Delivery Mode drop down is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_del_sec_sam_del_mod);
		 		 	             	Log.info("Sample Delivery Mode drop down is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Sample Delivery Mode drop down has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Sample Delivery Mode drop down has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	
		 		 	        	return element;} 
		 	        	
		 	        	
	//Report dropdown
		 	        	
		 	        	public static WebElement sam_del_sec_reprt() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_del_sec_reprt"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_sam_del_sec_reprt);
		 		 	             Log.info("Report drop down is displayed in RFS submission");
		 		 	             Log.info("Report drop down is enabled in RFS submission ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_del_sec_reprt);
		 		 	             	Log.info("Report drop down is not displayed/enabled in RFS submission ");
		 		 	             }
		 		 	             Log.info("Report drop down has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" Report drop down has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}
		 	        	
		 	        	
	//************************************************Scope and charges****************************************************	 	        	
		 	        	
		//scope routine checkbox
		 	        	
		 	        	public static WebElement scop_routine_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_routine_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_scop_routine_chkbx);
		 		 	             Log.info("scope routine checkbox is displayed in Scope and charges");
		 		 	             Log.info("scope routine checkbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_routine_chkbx);
		 		 	             	Log.info("scope routine checkbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("scope routine checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" scope routine checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}        	
		 	        	
	//scope advance checkbox
		 	        	
		 	        	
		 	        	public static WebElement scop_advance_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_advance_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_scop_advance_chkbx);
		 		 	             Log.info("scope advance checkbox is displayed in Scope and charges");
		 		 	             Log.info("scope advance checkbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {          ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_advance_chkbx);

		 		 	             	Log.info("scope advance checkbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("scope advance checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" scope advance checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}        

		 	        	
	//scope sample clarifications
		 	        	public static WebElement txt_scop_sam_clarfcsn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_sam_clarfcsn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
			 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_sam_clarfcsn);

		 		 	             Log.info("scope sample clarifications textbox is displayed in Scope and charges");
		 		 	             Log.info("scope sample clarifications textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_sam_clarfcsn);
		 		 	             	Log.info("scope sample clarifications is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("scope sample clarifications textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" scope sample clarifications textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}        
		 	        	
	//scope method applied
		 	        	
		 	        	public static WebElement txt_scop_methd_applied() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_methd_applied"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_methd_applied);
		 		 	             Log.info("scope method applied textbox is displayed in Scope and charges");
		 		 	             Log.info("scope method applied textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_methd_applied);
		 		 	             	Log.info("scope method applied is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("scope method applied textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" scope method applied textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//scope deliverables
		 	        	
		 	        	public static WebElement txt_scop_delvrbls() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_delvrbls"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_delvrbls);
		 		 	             Log.info("scope deliverables textbox is displayed in Scope and charges");
		 		 	             Log.info("scope deliverables textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_delvrbls);
		 		 	             	Log.info("scope deliverables is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("scope deliverables textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" scope deliverables textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}  
	//scope sample storage condition and location
		 	        	
		 	        	
		 	        	
		 	        	public static WebElement txt_scop_sam_storg_loc_and_cond() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_sam_storg_loc_and_cond"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_sam_storg_loc_and_cond);
		 		 	             Log.info("sample storage condition and location textbox is displayed in Scope and charges");
		 		 	             Log.info("sample storage condition and location textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_sam_storg_loc_and_cond);
		 		 	             	Log.info("sample storage condition and location is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("sample storage condition and location textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("sample storage condition and location textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}  
		 	        	
	//ibec approval required check box
		 	        	
		 	        	public static WebElement chkbx_scop_ibec_approval() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbx_scop_ibec_approval"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_chkbx_scop_ibec_approval);
		 		 	             Log.info("ibec approval required check box is displayed in Scope and charges");
		 		 	             Log.info("ibec approval required check box is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbx_scop_ibec_approval);
		 		 	             	Log.info("ibec approval required check box is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("ibec approval required check box has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" ibec approval required check box has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}  
		 	        	
		 	        	
	//material transport
		 	        	
		 	        	public static WebElement chkbx_scop_matrl_transprt() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbx_scop_matrl_transprt"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_chkbx_scop_matrl_transprt);
		 		 	             Log.info("ibec approval required check box is displayed in Scope and charges");
		 		 	             Log.info("ibec approval required check box is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbx_scop_matrl_transprt);
		 		 	             	Log.info("material transport check box is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("material transport check box has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" material transport check box has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}  
		 	        	
	//equipment add 
		 	        	
		 	        	
		 	        	
	//equipment remove 
		 	        	
		 	        	public static WebElement scop_eqipmnt_rmv_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_eqipmnt_rmv_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_scop_eqipmnt_rmv_btn);
		 		 	             Log.info("equipment remove button is displayed in Scope and charges");
		 		 	             Log.info("equipment remove button is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_eqipmnt_rmv_btn);
		 		 	             	Log.info("equipment remove button is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("equipment remove button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" equipment remove button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;}  
		 	        	 	        	
	//samples or consumables
		 	        	
		 	        	public static WebElement scop_sampls_or_consumables_add_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_sampls_or_consumables_add_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_scop_sampls_or_consumables_add_btn);
		 		 	             Log.info("samples or consumables add button is displayed in Scope and charges");
		 		 	             Log.info("samples or consumables add button is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_sampls_or_consumables_add_btn);
		 		 	             	Log.info("samples or consumables add button is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("samples or consumables add button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" samples or consumables add button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//samples or consumables remove button
		 	        	
		 	        	public static WebElement scop_sampls_or_consumables_rmv_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_sampls_or_consumables_rmv_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_scop_sampls_or_consumables_rmv_btn);
		 		 	             Log.info("samples or consumables remove button is displayed in Scope and charges");
		 		 	             Log.info("samples or consumables remove button is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_sampls_or_consumables_rmv_btn);
		 		 	             	Log.info("samples or consumables remove button is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("samples or consumables remove button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" samples or consumables remove button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
	//ECD
		 	        	
		 	        	public static WebElement txt_scop_ECD() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_ECD"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_ECD);
		 		 	             Log.info("ECD textbox is displayed in Scope and charges");
		 		 	             Log.info("ECD textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_ECD);
		 		 	             	Log.info("ECD textbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("ECD textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" ECD textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//assigned scientist 
		 	        	
		 	        	
		 	        	public static WebElement txt_scop_assignd_scintst() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_assignd_scintst"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_assignd_scintst);
		 		 	             Log.info("assigned scientist textbox is displayed in Scope and charges");
		 		 	             Log.info("assigned scientist textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_assignd_scintst);
		 		 	             	Log.info("assigned scientist textbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("assigned scientist textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" assigned scientist textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 

	//approved by care lab director
		 	        	
		 	        	public static WebElement txt_scop_aprvd_by_core_lab_dir() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_aprvd_by_core_lab_dir"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_aprvd_by_core_lab_dir);
		 		 	             Log.info("approved by care lab director textbox is displayed in Scope and charges");
		 		 	             Log.info("approved by care lab director textbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_aprvd_by_core_lab_dir);
		 		 	             	Log.info("approved by care lab director textbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("approved by care lab director textbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" approved by care lab director textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 

	//scope and charges tab
		 	        	
		 	        	public static WebElement tab_scop_and_charges() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_scop_and_charges"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	       //    ExcelUtils.setCellData("editable", 2, Constant.Col_tab_scop_and_charges);
		 		 	             Log.info("scope and charges tab is displayed in Scope and charges");
		 		 	             Log.info("scope and charges tab is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("scope and charges tab is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("scope and charges tab has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("scope and charges tab has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
	//equipment checkbox
		 	        	
		 	        	
		 	        	public static WebElement scop_eqipmnt_eqip_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_eqipmnt_eqip_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	     //      ExcelUtils.setCellData("editable", 2, Constant.Col_scop_eqipmnt_eqip_chkbx);
		 		 	           
		 		 	             Log.info("equipment checkbox is displayed in Scope and charges");
		 		 	             Log.info("equipment checkbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("equipment checkbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("equipment checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("equipment checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//equipment table
		 	        	
		 	        	public static WebElement scop_eqipmnt_table() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_eqipmnt_table"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
			 		 	         //  ExcelUtils.setCellData("editable", 2, Constant.Col_scop_eqipmnt_table);

		 		 	           
		 		 	             Log.info("equipment table is displayed in Scope and charges");
		 		 	             Log.info("equipment table is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("equipment table is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("equipment table has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("equipment table has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
	//samples and consumables checkbox
		 	        	
		 	        	public static WebElement scop_sampls_or_consumables_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_sampls_or_consumables_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	   //        ExcelUtils.setCellData("editable", 2, Constant.Col_scop_sampls_or_consumables_chkbx);
		 		 	             Log.info("samples and consumables checkbox is displayed in Scope and charges");
		 		 	             Log.info("samples and consumables checkbox is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("samples and consumables checkbox is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("samples and consumables checkbox has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("samples and consumables checkbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
	//man power table
		 	        	
		 	        	public static WebElement scop_man_power_table() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_man_power_table"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	        //   ExcelUtils.setCellData("editable", 2, Constant.Col_scop_man_power_table);
		 		 	             Log.info("man power table is displayed in Scope and charges");
		 		 	             Log.info("man power table is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("man power table is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("man power table has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("man power table has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
	//man power request change button
		 	        	
		 	        	public static WebElement scop_man_pwr_req_chnge_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_man_pwr_req_chnge_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	     //      ExcelUtils.setCellData("editable", 2, Constant.Col_scop_man_pwr_req_chnge_btn);
		 		 	             Log.info("man power request change button is displayed in Scope and charges");
		 		 	             Log.info("man power request change button is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("man power request change button is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("man power request change button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("man power request change button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
	//man query button
		 	        	
		 	        	public static WebElement scop_man_query_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_man_query_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	      //     ExcelUtils.setCellData("editable", 2, Constant.Col_scop_man_query_btn);
		 		 	             Log.info("man query button is displayed in Scope and charges");
		 		 	             Log.info("man query button is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("man query button is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("man query button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("man query button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//scop_man_accept_btn
		 	        	
		 	        	public static WebElement scop_man_accept_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_man_accept_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	       //    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_man_accept_btn);
		 		 	             Log.info("man accept button is displayed in Scope and charges");
		 		 	             Log.info("man accept button is enabled in Scope and charges ");
		 		 	             }else
		 		 	             {
		 		 	             	Log.info("man accept button is not displayed/enabled in Scope and charges ");
		 		 	             }
		 		 	             Log.info("man accept button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("man accept button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
	 	        	
		 	        	
		 	        	
	//*******************************************RFS Report*************************************************	 	        	
		 	        	
		 	        	
	//RFS report tab 
		 	        	
		 	        	
		 	        	
		 	        	public static WebElement tab_RFS_report() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_RFS_report"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_tab_RFS_report);
		 		 	             Log.info("RFS report tab  is displayed ");
		 		 	             Log.info("RFS report tab  is enabled  ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_RFS_report);
		 		 	             	Log.info("RFS report tab  is not displayed/enabled ");
		 		 	             }
		 		 	             Log.info("RFS report tab  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" RFS report tab  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//report number
		 	        	
		 	        	public static WebElement txt_rfs_rep_reprt_no() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_reprt_no"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_reprt_no);
		 		 	             Log.info("report number textbox is displayed in RFS Report");
		 		 	             Log.info("report number textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_reprt_no);
		 		 	             	Log.info("report number textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("report number textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" report number textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//RFS number
		 	        	
		 	      	
		 	        	public static WebElement txt_rfs_rep_rfs_no() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_rfs_no"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_rfs_no);
		 		 	             Log.info("RFS number textbox is displayed in RFS Report");
		 		 	             Log.info("RFS number textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_rfs_no);
		 		 	             	Log.info("RFS number textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("RFS number textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" RFS number textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 

		 	        	
	//prepared by	 	        	
		 	        	
		 	        	
		 	        	public static WebElement txt_rfs_rep_prep_by() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_prep_by"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_prep_by);
		 		 	             Log.info("prepared byr textbox is displayed in RFS Report");
		 		 	             Log.info("prepared by textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_prep_by);
		 		 	             	Log.info("prepared by textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("prepared by textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" prepared by textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//first name
		 	        	
		 	        	public static WebElement txt_rfs_rep_fname() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_fname"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_fname);
		 		 	             Log.info("first name textbox is displayed in RFS Report");
		 		 	             Log.info("first name textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_fname);
		 		 	             	Log.info("first name textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("first name textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" first name textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//last name
		 	        	
		 	        	public static WebElement txt_rfs_rep_lname() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_lname"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_lname);
		 		 	             Log.info("last name textbox is displayed in RFS Report");
		 		 	             Log.info("last name textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_lname);
		 		 	             	Log.info("last name textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("last name textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" last name textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//kaust id
		 	        	
		 	        	public static WebElement txt_rfs_rep_kasut_id() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_kasut_id"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_kasut_id);
		 		 	             Log.info("kaust id textbox is displayed in RFS Report");
		 		 	             Log.info("kaust id textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_kasut_id);
		 		 	             	Log.info("kaust id textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("kaust id textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" kaust id textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//department
		 	        	
		 	        	public static WebElement txt_rfs_rep_dep() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_dep"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_dep);
		 		 	             Log.info("department textbox is displayed in RFS Report");
		 		 	             Log.info("department textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {      ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_dep);

		 		 	             	Log.info("department textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("department textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" department textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//telephone
		 	        	
		 	        	public static WebElement txt_rfs_rep_tel() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_tel"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_tel);
		 		 	             Log.info("telephone textbox is displayed in RFS Report");
		 		 	             Log.info("telephone textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_tel);
		 		 	             	Log.info("telephone textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("telephone textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" telephone textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 

		 	        	
	//email
		 	        	
		 	        	
		 	        	public static WebElement txt_rfs_rep_email() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_email"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_email);
		 		 	             Log.info("email textbox is displayed in RFS Report");
		 		 	             Log.info("email textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_email);
		 		 	             	Log.info("email textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("email textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" email textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//organization name
		 	        	
		 	        	
		 	        	public static WebElement txt_rfs_rep_org_name() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_org_name"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_org_name);
		 		 	             Log.info("organization name textbox is displayed in RFS Report");
		 		 	             Log.info("organization name textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_org_name);
		 		 	             	Log.info("organization name textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("organization name textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" organization name textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//country
		 	        	
		 	        	public static WebElement txt_rfs_rep_country() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_country"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_country);
		 		 	             Log.info("country textbox is displayed in RFS Report");
		 		 	             Log.info("country textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {    ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_country);
		 		 	             	Log.info("country textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("country textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" country textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//address
		 	        	
		 	        	public static WebElement txt_rfs_rep_address() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_address"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_address);
		 		 	             Log.info("address textbox is displayed in RFS Report");
		 		 	             Log.info("address textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_address);
		 		 	             	Log.info("address textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("address textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" country textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//postcode
		 	        	
		 	        	public static WebElement txt_rfs_rep_postcode() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_postcode"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_postcode);
		 		 	             Log.info("postcode textbox is displayed in RFS Report");
		 		 	             Log.info("postcode textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_postcode);
		 		 	             	Log.info("postcode textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("postcode textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" postcode textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//kaust customer account number
		 	        	
		 	        	public static WebElement txt_rfs_rep_kaust_custmr_acc_no() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_kaust_custmr_acc_no"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_kaust_custmr_acc_no);
		 		 	             Log.info("kaust customer account number textbox is displayed in RFS Report");
		 		 	             Log.info("kaust customer account number textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {      ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_kaust_custmr_acc_no);
		 		 	             	Log.info("kaust customer account number textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("kaust customer account number textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" kaust customer account number textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//no of samples
		 	        	
		 	        	public static WebElement txt_rfs_rep_no_of_sampls() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_no_of_sampls"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_no_of_sampls);
		 		 	             Log.info("no of samples textbox is displayed in RFS Report");
		 		 	             Log.info("no of samples textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_no_of_sampls);
		 		 	             	Log.info("no of samples textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("no of samples textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error(" no of samples textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//sample data specifications
		 	        	
		 	        	public static WebElement txt_rfs_rep_sampls_data_specy() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_sampls_data_specy"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_sampls_data_specy);
		 		 	             Log.info("sample data specifications textbox is displayed in RFS Report");
		 		 	             Log.info("sample data specifications textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_sampls_data_specy);
		 		 	             	Log.info("sample data specifications textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("sample data specifications textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("sample data specifications textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//service scope
		 	        	
		 	        	public static WebElement txt_rfs_rep_ser_scope() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_ser_scope"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_ser_scope);
		 		 	             Log.info("service scope textbox is displayed in RFS Report");
		 		 	             Log.info("service scope textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_ser_scope);
		 		 	             	Log.info("service scope textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("service scope textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("service scope textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//samples
		 	        	
		 	        	
		 	        	public static WebElement txt_rfs_rep_sampls() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_sampls"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_sampls);
		 		 	             Log.info("samples textbox is displayed in RFS Report");
		 		 	             Log.info("samples textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_sampls);
		 		 	             	Log.info("samples textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("samples textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("samples textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 

	//summary of analytical method
		 	        	
		 	        	public static WebElement txt_rfs_rep_sumry_of_analytical_methd() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_sumry_of_analytical_methd"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_sumry_of_analytical_methd);
		 		 	          
		 		 	             Log.info("summary of analytical method textbox is displayed in RFS Report");
		 		 	             Log.info("summary of analytical method textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_sumry_of_analytical_methd);
		 		 	             	Log.info("summary of analytical method textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("summary of analytical method textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("summary of analytical method textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 

	//results
		 	        	
		 	        	public static WebElement txt_rfs_rep_results() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_results"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_results);
		 		 	             Log.info("results textbox is displayed in RFS Report");
		 		 	             Log.info("results textbox  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_results);
		 		 	             	Log.info("results textbox  is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("results textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("results textbox  has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//browse button
		 	        	
		 	        	public static WebElement rfs_rep_upld_any_nessry_docs_browse_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_upld_any_nessry_docs_browse_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_upld_any_nessry_docs_browse_btn);
		 		 	             Log.info("browse button is displayed in RFS Report");
		 		 	             Log.info("browse button  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_upld_any_nessry_docs_browse_btn);
		 		 	             	Log.info("browse button is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("browse button  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("browse button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//upload button
		 	        	
		 	        	
		 	        	public static WebElement rfs_rep_upld_any_nessry_docs_upload_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_upld_any_nessry_docs_upload_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_upld_any_nessry_docs_upload_btn);
		 		 	             Log.info("upload button is displayed in RFS Report");
		 		 	             Log.info("upload button  is enabled in RFS Report ");
		 		 	             }else
		 		 	             {
		 		 	            	ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_upld_any_nessry_docs_upload_btn);
		 		 	             	Log.info("upload button is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("upload button  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("upload button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
	        	
	//approved by core lab director
		 	        	
		 	        	public static WebElement txt_rfs_rep_apprvd_by_core_lab_dir() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_apprvd_by_core_lab_dir"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_apprvd_by_core_lab_dir);
		 		 	             Log.info("approved by core lab director textbox is displayed in RFS Report");
		 		 	             Log.info("approved by core lab director textbox is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_apprvd_by_core_lab_dir);
		 		 	             	Log.info("approved by core lab director textbox is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("approved by core lab director textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("approved by core lab director textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//result accepted by requester comments
		 	        	
		 	        	public static WebElement txt_rfs_rep_reslt_accpt_by_reqster_comments() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_rep_reslt_accpt_by_reqster_comments"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_rep_reslt_accpt_by_reqster_comments);
		 		 	             Log.info("result accepted by requester comments textbox is displayed in RFS Report");
		 		 	             Log.info("result accepted by requester comments textbox is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_rep_reslt_accpt_by_reqster_comments);
		 		 	             	Log.info("result accepted by requester comments textbox is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("result accepted by requester comments textbox  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("result accepted by requester comments textbox has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
	//service quality excellent chkbx
		 	        	
		 	        	public static WebElement rfs_rep_reqstr_feedbk_ser_qualty_excellent_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_reqstr_feedbk_ser_qualty_excellent_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_excellent_chkbx);
		 		 	             Log.info("service quality excellent chkbx is displayed in RFS Report");
		 		 	             Log.info("service quality excellent chkbx is enabled in RFS Report ");
		 		 	             }else
		 		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_excellent_chkbx);
		 		 	             	Log.info("service quality excellent chkbx is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("service quality excellent chkbx  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("service quality excellent chkbx has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//service quality good chkbx
		 	        	
		 	        	public static WebElement rfs_rep_reqstr_feedbk_ser_qualty_good_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_reqstr_feedbk_ser_qualty_good_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_good_chkbx);
		 		 	             Log.info("service quality good chkbx is displayed in RFS Report");
		 		 	             Log.info("service quality good chkbx is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_good_chkbx);
		 		 	             	Log.info("service quality good chkbx is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("service quality good chkbx  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("service quality good chkbx has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//service quality average chkbx
		 	        	
		 	        	public static WebElement rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx);
		 		 	             Log.info("service quality average chkbx is displayed in RFS Report");
		 		 	             Log.info("service quality average chkbx is enabled in RFS Report ");
		 		 	             }else
		 		 	             {   ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_avrg_chkbx);
		 		 	             	Log.info("service quality average chkbx is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("service quality average chkbx  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("service quality average chkbx has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//service quality poor chkbx
		 	        	
		 	        	public static WebElement rfs_rep_reqstr_feedbk_ser_qualty_poor_chkbx() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_reqstr_feedbk_ser_qualty_poor_chkbx"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_poor_chkbx);
		 		 	             Log.info("service quality poor chkbx is displayed in RFS Report");
		 		 	             Log.info("service quality poor chkbx is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ser_qualty_poor_chkbx);
		 		 	             	Log.info("service quality poor chkbx is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("service quality poor chkbx  has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("service quality poor chkbx has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
	//requester feedback comments
		 	        	
		 	        	public static WebElement rfs_rep_reqstr_feedbk_comments() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_reqstr_feedbk_comments"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_comments);
		 		 	             Log.info("requester feedback comments txtbx is displayed in RFS Report");
		 		 	             Log.info("requester feedback comments txtbx is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_comments);
		 		 	             	Log.info("requester feedback comments txtbx is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("requester feedback comments txtbx has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("requester feedback comments txtbx has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
	//requester feedback button
		 	        	
		 	        	public static WebElement rfs_rep_reqstr_feedbk_ret_sampl_btn() throws Exception{
		 		 	    	try{
		 		 	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_rep_reqstr_feedbk_ret_sampl_btn"))));	
		 		 	     		
		 		 	    	     boolean status = true;
		 		 	 			if(element.isEnabled() == status)
		 		 	             {
		 		 	 		     
		 		 	             System.out.println(element.isDisplayed());
		 		 	           ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ret_sampl_btn);
		 		 	             Log.info("requester feedback button is displayed in RFS Report");
		 		 	             Log.info("requester feedback button is enabled in RFS Report ");
		 		 	             }else
		 		 	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_rep_reqstr_feedbk_ret_sampl_btn);
		 		 	             	Log.info("requester feedback button is not displayed/enabled in RFS Report ");
		 		 	             }
		 		 	             Log.info("requester feedback button has passed element");
		 		 	     	}catch (Exception e){
		 		 	        		Log.error("requester feedback button has fail in catch ");
		 		 	        		
		 		 	        		throw(e);
		 		 	        		}
		 		 	    	return element;} 
		 	        	
		 	        	
		 	        		 	        







			public static WebElement Equipment_drp_dwn1() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Equipment_drp_dwn1"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_task_title_link);
    	             Log.info("Equipment_drp_dwn1 is displayed");
    	             Log.info("Equipment_drp_dwn1 is enabled ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("Equipment_drp_dwn1  not displayed/enabled  ");
    	             }
    	             Log.info("Equipment_drp_dwn1 has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Equipment_drp_dwn1 has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
			
	//*******************************************RFS submission*****************************************************		
	 //RFS submission
			
			public static WebElement Equipment_drp_dwn_optn_select1() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Equipment_drp_dwn_optn_select1"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn);

    	             Log.info("Equipment_drp_dwn_optn_select1 is displayed in task details");
    	             Log.info("Equipment_drp_dwn_optn_select1 is enabled in task details ");
    	             }else
    	             {
    	            	// ExcelUtils.setCellData("not editable", 2, Constant.Col_tab_rfs_submsn);

    	             	Log.info("Equipment_drp_dwn_optn_select1 is not displayed/enabled in task details ");
    	             }
    	             Log.info("Equipment_drp_dwn_optn_select1 has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Equipment_drp_dwn_optn_select1 has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
	
			//---------------------------------Requester Information-----------------------------------
	//Requester Information
			
			
			public static WebElement quantity_txt1() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("quantity_txt1"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	           //  ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn_req_info);
    	             Log.info("quantity_txt1 tab is displayed ");
    	             Log.info("quantity_txt1 tab is enabled ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn_req_info);
    	             	Log.info("quantity_txt1 tab is not displayed/enabled  ");
    	             }
    	             Log.info("quantity_txt1 has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" quantity_txt1 has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
	
    //Requester Information //first name
			
			
			public static WebElement scop_eqipmnt_add_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_eqipmnt_add_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_frst_name);
    	             Log.info("scop_eqipmnt_add_btn is displayed in RFS submission");
    	             Log.info("scop_eqipmnt_add_btn is enabled in RFS submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_frst_name);
    	             	Log.info("scop_eqipmnt_add_btnis not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("scop_eqipmnt_add_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" scop_eqipmnt_add_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 		
			
	//last name
			
			public static WebElement Man_Power_Analysis_reporting() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Man_Power_Analysis_reporting"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_last_name);
    	             Log.info("Man_Power_Analysis_reporting is displayed in RFS submission");
    	             Log.info("Man_Power_Analysis_reporting in RFS submission ");
    	             }else
    	             {//  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_last_name);
    	             	Log.info("Man_Power_Analysis_reporting is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Man_Power_Analysis_reporting has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Man_Power_Analysis_reporting has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
	//Type of Organization
			
			public static WebElement Man_Power_Equi_set_up() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Man_Power_Equi_set_up"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             Log.info("Man_Power_Equi_set_up is displayed in RFS submission");
    	             Log.info("Man_Power_Equi_set_up is enabled in RFS submission ");
    	             }else
    	             {  // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             	Log.info("Man_Power_Equi_set_up is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Man_Power_Equi_set_up has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Man_Power_Equi_set_up has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
			
			
			public static WebElement btn_accept() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("btn_accept"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             Log.info("btn_accept is displayed in RFS submission");
    	             Log.info("btn_accept is enabled in RFS submission ");
    	             }else
    	             {  // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             	Log.info("btn_accept is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("btn_accept has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" btn_accept has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
			
			
			public static WebElement Assigned_Scientist_drpdn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Assigned_Scientist_drpdn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             Log.info("Assigned_Scientist_drpdn is displayed in RFS submission");
    	             Log.info("Assigned_Scientist_drpdn is enabled in RFS submission ");
    	             }else
    	             {  // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             	Log.info("Assigned_Scientist_drpdn is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Assigned_Scientist_drpdn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Assigned_Scientist_drpdn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
			
			
			
			public static WebElement txt_comments() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_comments"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             Log.info("txt_comments is displayed in RFS submission");
    	             Log.info("txt_comments is enabled in RFS submission ");
    	             }else
    	             {  // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             	Log.info("txt_comments is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("v has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" txt_comments has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
			public static WebElement Assigned_Scientist_drpdn_option() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Assigned_Scientist_drpdn_option"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             Log.info("Assigned_Scientist_drpdn_option is displayed in RFS submission");
    	             Log.info("Assigned_Scientist_drpdn_option is enabled in RFS submission ");
    	             }else
    	             {  // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_type_of_orgnsn);
    	             	Log.info("Assigned_Scientist_drpdn_option is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Assigned_Scientist_drpdn_option has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Assigned_Scientist_drpdn_option has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
	//Position
			
			public static WebElement Man_Power_Measurement() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Man_Power_Measurement"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_position);
    	             Log.info("Man_Power_Measurement is displayed in RFS submission");
    	             Log.info("Man_Power_Measurement enabled in RFS submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_position);
    	             	Log.info("Man_Power_Measurement is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Man_Power_Measurement has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Man_Power_Measurement has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 	
			
		
	//Organization Name
			
			public static WebElement Man_Power_Request_review() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Man_Power_Request_review"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_org_name);
    	             Log.info("Man_Power_Request_review is displayed in RFS submission");
    	             Log.info("Man_Power_Request_reviewis enabled in RFS submission ");
    	             }else
    	             {  //ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_org_name);
    	             	Log.info("Man_Power_Request_review is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Man_Power_Request_review has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Man_Power_Request_review has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
			
			
		//Department
			
			public static WebElement Man_Power_Sample_preparation() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Man_Power_Sample_preparation"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             ExcelUtils.setCellData("editable", 2, Constant.Col_Man_Power_Sample_preparation);
    	             Log.info("Man_Power_Sample_preparation is displayed in RFS submission");
    	             Log.info("Man_Power_Sample_preparation is enabled in RFS submission ");
    	             }else
    	             { ExcelUtils.setCellData("non-editable", 2, Constant.Col_Man_Power_Sample_preparation);
    	             	Log.info("Man_Power_Sample_preparation is not displayed/enabled in RFS submission ");
    	             }
    	             Log.info("Man_Power_Sample_preparation has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" Man_Power_Sample_preparation has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
  	        	
		 	        	
			public static WebElement txt_search() throws Exception{
    	    	try{
    	    		element = driver.findElement(By.xpath(prop.getProperty("txt_search")));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_search);
    	             Log.info("txt_search is displayed ");
    	             Log.info("txt_search is enabled  ");
    	             }else
    	             {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_search);
    	             	Log.info("txt_search is not displayed/enabled  ");
    	             }
    	             Log.info("txt_search has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" txt_search has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    }  	 
			
			
			
			public static WebElement search_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("search_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             //ExcelUtils.setCellData("editable", 2, Constant.Col_);
    	             Log.info("search_btn is displayed ");
    	             Log.info("search_btn is enabled  ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_);
    	             	Log.info("search_btn is not displayed/enabled  ");
    	             }
    	             Log.info("search_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" search_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    }  	 
			
			
			
			public static WebElement btn_rfs_next() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("btn_rfs_next"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             //ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_depart);
    	             Log.info("btn_rfs_next is displayed ");
    	             Log.info("btn_rfs_next is enabled  ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_depart);
    	             	Log.info("btn_rfs_next is not displayed/enabled  ");
    	             }
    	             Log.info("btn_rfs_next has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" btn_rfs_next has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    }  	 
			
			
			
			
			public static WebElement btn_submit() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("btn_submit"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             //ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_depart);
    	             Log.info("sbmt_btn is displayed ");
    	             Log.info("sbmt_btn is enabled  ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_depart);
    	             	Log.info("sbmt_btn is not displayed/enabled  ");
    	             }
    	             Log.info("sbmt_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" sbmt_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    }  	 
		 	        	
		 	        	

			public static WebElement pop_up2() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pop_up2"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	             //ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_depart);
    	             Log.info("pop_up2 is displayed ");
    	             Log.info("pop_up2 is enabled  ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_depart);
    	             	Log.info("pop_up2 is not displayed/enabled  ");
    	             }
    	             Log.info("pop_up2 has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" pop_up2 has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    }  	 
		 	 
			
			public static WebElement refresh_btn() throws Exception{
    	    	try{
    	    		element = driver.findElement((By.xpath(prop.getProperty("refresh_btn"))));	
    	     		Thread.sleep(2000);
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println("refresh_btn"+element.isEnabled());
    	             //ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_depart);
    	             Log.info("refresh_btn is displayed ");
    	             Log.info("refresh_btn is enabled  ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_depart);
    	             	Log.info("refresh_btn is not displayed/enabled  ");
    	             }
    	             Log.info("refresh_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" refresh_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
			
			
			
			public static WebElement approve_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("approve_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println("approve_btn"+element.isEnabled());
    	             //ExcelUtils.setCellData("editable", 2, Constant.Col_txt_req_info_depart);
    	             Log.info("approve_btn is displayed ");
    	             Log.info("approve_btn is enabled  ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_req_info_depart);
    	             	Log.info("approve_btn is not displayed/enabled  ");
    	             }
    	             Log.info("approve_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" approve_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 
			
			
			
			public static WebElement rfs_subsn_req_info_pi_pos() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_pi_pos"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println("rfs_subsn_req_info_pi_pos"+element.isEnabled());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_req_info_pi_pos);
    	             Log.info("rfs_subsn_req_info_pi_pos is displayed in rfs submission");
    	             Log.info("rfs_subsn_req_info_pi_pos is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("btn_close is not displayed/enabled  ");
    	             }
    	             Log.info("rfs_subsn_req_info_pi_pos has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_req_info_pi_pos has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 





			
			public static WebElement rfs_subsn_req_info_pi_tel() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_pi_tel"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println("rfs_subsn_req_info_pi_tel"+element.isEnabled());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_req_info_pi_tel);
    	             Log.info("rfs_subsn_req_info_pi_tel is displayed in rfs submission");
    	             Log.info("rfs_subsn_req_info_pi_tel is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_req_info_pi_tel is not displayed/enabled  ");
    	             }
    	             Log.info("rfs_subsn_req_info_pi_tel has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_req_info_pi_tel has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 







			
			public static WebElement rfs_subsn_req_info_next_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_next_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_req_info_next_btn);
    	             Log.info("rfs_subsn_req_info_next_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_req_info_next_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_req_info_next_btn is not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_req_info_next_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_req_info_next_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 




public static WebElement rfs_subsn_ser_area_sec_tab() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_tab"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_tab);
    	             Log.info("rfs_subsn_ser_area_sec_tab is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_tab is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_tab is not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_tab has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_tab has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 




public static WebElement rfs_subsn_ser_area_sec_arrow_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_arrow_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_arrow_btn);
    	             Log.info("rfs_subsn_ser_area_sec_arrow_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_arrow_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_arrow_btn is not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_arrow_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_arrow_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
    	           
    	    } 






public static WebElement rfs_subsn_ser_area_sec_com_date() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_com_date"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_com_date);
    	             Log.info("rfs_subsn_ser_area_sec_com_date is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_com_date is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_com_date is not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_com_date has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_com_date has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_ser_area_sec_aim_of_study() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_aim_of_study"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_aim_of_study);
    	             Log.info("rfs_subsn_ser_area_sec_aim_of_study is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_aim_of_study is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_aim_of_study is not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_aim_of_study has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_aim_of_study has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}













public static WebElement rfs_subsn_ser_area_sec_exp_data() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_exp_data"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_exp_data);
    	             Log.info("rfs_subsn_ser_area_sec_exp_data is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_exp_data is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_exp_data is not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_exp_data has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_exp_data has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_ser_area_sec_method() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_method"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_method);
    	             Log.info("rfs_subsn_ser_area_sec_method is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_method is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_method not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_method has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_method has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}









public static WebElement rfs_subsn_ser_area_sec_brwse_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_brwse_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_brwse_btn);
    	             Log.info("rfs_subsn_ser_area_sec_brwse_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_brwse_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_brwse_btn not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_brwse_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_brwse_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}









public static WebElement rfs_subsn_ser_area_sec_upload_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_upload_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_upload_btn);
    	             Log.info("rfs_subsn_ser_area_sec_upload_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_upload_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_upload_btn not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_upload_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_upload_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}











public static WebElement rfs_subsn_ser_area_sec_next_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_ser_area_sec_next_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_ser_area_sec_next_btn);
    	             Log.info("rfs_subsn_ser_area_sec_next_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_ser_area_sec_next_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_ser_area_sec_next_btn not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_ser_area_sec_next_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_ser_area_sec_next_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}






public static WebElement rfs_subsn_sam_sec_no_of_samp() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_no_of_samp"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_no_of_samp);
    	             Log.info("rfs_subsn_sam_sec_no_of_samp is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_no_of_samp is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_no_of_samp not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_no_of_samp has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_no_of_samp has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_sam_sec_toxic_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_toxic_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_toxic_chkbx);
    	             Log.info("rfs_subsn_sam_sec_toxic_chkbx is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_toxic_chkbx is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_toxic_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_toxic_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_toxic_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}





public static WebElement rfs_subsn_sam_sec_solid_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_solid_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_solid_chkbx);
    	             Log.info("rfs_subsn_sam_sec_solid_chkbx is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_solid_chkbxis enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_solid_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_solid_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_solid_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}


public static WebElement rfs_subsn_sam_sec_powder_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_powder_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_powder_chkbx);
    	            // Log.inforfs_subsn_sam_sec_powder_chkbx is displayed in rfs submission");
    	             //Log.inforfs_subsn_sam_sec_powder_chkbx is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	//Log.inforfs_subsn_sam_sec_powder_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             //Log.inforfs_subsn_sam_sec_powder_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_powder_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}


public static WebElement rfs_subsn_sam_sec_film_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_film_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_film_chkbx);
    	             Log.info("rfs_subsn_sam_sec_film_chkbx is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_film_chkbx is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_film_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_film_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_film_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_sam_sec_organic_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_organic_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_organic_chkbx);
    	             Log.info("rfs_subsn_sam_sec_organic_chkbx is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_organic_chkbx is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_organic_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_organic_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_organic_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}






public static WebElement rfs_subsn_sam_sec_inorganic_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_inorganic_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_inorganic_chkbx);
    	             Log.info("rfs_subsn_sam_sec_inorganic_chkbx is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_inorganic_chkbx is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_inorganic_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_inorganic_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_inorganic_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_sam_sec_fluid_chkbx() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_fluid_chkbx"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_fluid_chkbx);
    	             Log.info("rfs_subsn_sam_sec_fluid_chkbx is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_fluid_chkbx is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_fluid_chkbx not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_fluid_chkbx has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_fluid_chkbx has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_sam_sec_samp_data() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_samp_data"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_samp_data);
    	             Log.info("rfs_subsn_sam_sec_samp_data is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_samp_data is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_samp_data not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_samp_data has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_samp_data has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}








public static WebElement rfs_subsn_sam_sec_specy_ins() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_specy_ins"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_specy_ins);
    	             Log.info("rfs_subsn_sam_sec_specy_ins is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_specy_ins is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_specy_ins not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_specy_ins has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_specy_ins has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}








public static WebElement rfs_subsn_sam_sec_brwse_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_brwse_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_brwse_btn);
    	             Log.info("rfs_subsn_sam_sec_brwse_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_brwse_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_brwse_btn not displayed/enabled  in rfs submission ");
    	             }
    	         //    Log.inforfs_subsn_sam_sec_brwse_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_brwse_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_sam_sec_upload_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_upload_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_upload_btn);
    	             Log.info("rfs_subsn_sam_sec_upload_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_upload_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_upload_btn not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_upload_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_upload_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}








public static WebElement rfs_subsn_sam_sec_next_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_sec_next_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_sec_next_btn);
    	             Log.info("rfs_subsn_sam_sec_next_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_sec_next_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_sec_next_btn not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_sec_next_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_sec_next_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}







public static WebElement rfs_subsn_sam_del_sec_tab() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_del_sec_tab"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_tab);
    	             Log.info("rfs_subsn_sam_del_sec_tab is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_del_sec_tab is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_del_sec_tab not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_del_sec_tab has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_del_sec_tab has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}






public static WebElement rfs_subsn_sam_del_sec_ret_sample() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_del_sec_ret_sample"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_ret_sample);
    	             Log.info("rfs_subsn_sam_del_sec_ret_sample is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_del_sec_ret_sample is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_del_sec_ret_sample not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_del_sec_ret_sample has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_del_sec_ret_sample has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}









public static WebElement rfs_subsn_sam_del_sec_samp_del_mode() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_del_sec_samp_del_mode"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_samp_del_mode);
    	             Log.info("rfs_subsn_sam_del_sec_samp_del_mode is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_del_sec_samp_del_mode is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_del_sec_samp_del_mode not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_del_sec_samp_del_mode has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_del_sec_samp_del_mode has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}








public static WebElement rfs_subsn_sam_del_sec_report() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_del_sec_report"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_report);
    	             Log.info("rfs_subsn_sam_del_sec_report is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_del_sec_report is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_del_sec_report not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_del_sec_report has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_del_sec_report has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}








public static WebElement rfs_subsn_sam_del_sec_submit() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_del_sec_submit"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_submit);
    	             Log.info("rfs_subsn_sam_del_sec_submit is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_del_sec_submit is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_del_sec_submit not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_del_sec_submit has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_del_sec_submit has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}






public static WebElement rfs_subsn_sam_del_sec_submit_pop_up_ok_btn() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_sam_del_sec_submit_pop_up_ok_btn"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_submit_pop_up_ok_btn);
    	             Log.info("rfs_subsn_sam_del_sec_submit_pop_up_ok_btn is displayed in rfs submission");
    	             Log.info("rfs_subsn_sam_del_sec_submit_pop_up_ok_btn is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_sam_del_sec_submit_pop_up_ok_btn not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_sam_del_sec_submit_pop_up_ok_btn has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_sam_del_sec_submit_pop_up_ok_btn has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}



public static WebElement rfs_subsn_req_info_pi_kaust_id() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_pi_kaust_id"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println("rfs_subsn_req_info_pi_kaust_id"+element.isEnabled());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_submit_pop_up_ok_btn);
    	             Log.info("rfs_subsn_req_info_pi_kaust_id is displayed in rfs submission");
    	             Log.info("rfs_subsn_req_info_pi_kaust_id is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_req_info_pi_kaust_id not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_req_info_pi_kaust_id has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_req_info_pi_kaust_id has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}

public static WebElement rfs_subsn_req_info_pi_email() throws Exception{
	try{
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_subsn_req_info_pi_email"))));	
 		
	     boolean status = true;
			if(element.isEnabled() == status)
         {
         System.out.println("rfs_subsn_req_info_pi_email"+element.isEnabled());
        // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_submit_pop_up_ok_btn);
         Log.info("pi email is displayed in rfs submission");
         Log.info("pi email  is enabled in rfs submission ");
         }else
         { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
         	Log.info("pi email  not displayed/enabled  in rfs submission ");
         }
         Log.info("pi email  has passed element");
 	}catch (Exception e){
    		Log.error(" pi email  has fail in catch ");
    		
    		throw(e);
    		}

    	return element;
}



			

public static WebElement rfs_subsn_req_info_pock_id() throws Exception{
    	    	try{
    	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_req_info_pock_id"))));	
    	     		
    	    	     boolean status = true;
    	 			if(element.isEnabled() == status)
    	             {
    	             System.out.println(element.isDisplayed());
    	            // ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_subsn_sam_del_sec_submit_pop_up_ok_btn);
    	             Log.info("rfs_subsn_req_info_pock_id is displayed in rfs submission");
    	             Log.info("rfs_subsn_req_info_pock_id is enabled in rfs submission ");
    	             }else
    	             { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link);
    	             	Log.info("rfs_subsn_req_info_pock_id not displayed/enabled  in rfs submission ");
    	             }
    	             Log.info("rfs_subsn_req_info_pock_id has passed element");
    	     	}catch (Exception e){
    	        		Log.error(" rfs_subsn_req_info_pock_id has fail in catch ");
    	        		
    	        		throw(e);
    	        		}

    	        	return element;
}

public static WebElement drp_dwn_Sel_bio_core_lab() throws Exception{
 	try{
 		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_dwn_Sel_bio_core_lab"))));	
  		
 	     boolean status = true;
			if(element.isEnabled() == status)
          {
          System.out.println(element.isDisplayed());
         ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          Log.info("Bio core lab drop down is displayed ");
          Log.info("Bio core lab drop down is enabled ");
          }else
          {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          	Log.info("Bio core lab is not displayed/enabled ");
          }
          Log.info("Bio core lab has passed element");
  	}catch (Exception e){
     		Log.error(" Bio core lab has fail in catch ");
     		
     		throw(e);
     		}

     	return element;
        
 }	


public static WebElement ser_area_drp_selec_capillary() throws Exception{
 	try{
 		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("ser_area_drp_selec_capillary"))));	
  		
 	     boolean status = true;
			if(element.isEnabled() == status)
          {
          System.out.println(element.isDisplayed());
         ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          Log.info("Service Area capillary drop down is displayed in service area section");
          Log.info("Service Area capillary drop down is enabled in service area section ");
          }else
          {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          	Log.info("Service Area capillary drop down not displayed/enabled  in service area section ");
          }
          Log.info("Bio core lab has passed element");
  	}catch (Exception e){
     		Log.error(" Service Area capillary drop down has fail in catch ");
     		
     		throw(e);
     		}

     	return element;
        
 }	



public static WebElement txt_sam_sec_samp_name() throws Exception{
 	try{
 		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_samp_name"))));	
  		
 	     boolean status = true;
			if(element.isEnabled() == status)
          {
          System.out.println(element.isDisplayed());
         ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          Log.info(" sample name textbox is displayed in sample section");
          Log.info("sample name textbox is enabled in sample section ");
          }else
          {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          	Log.info("sample name textbox not displayed/enabled  in sample section ");
          }
          Log.info("sample name textbox has passed element");
  	}catch (Exception e){
     		Log.error("sample name textbox  has failed in catch ");
     		
     		throw(e);
     		}

     	return element;
        
 }	




public static WebElement sam_sec_chkbx_transformed() throws Exception{
 	try{
 		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_chkbx_transformed"))));	
  		
 	     boolean status = true;
			if(element.isEnabled() == status)
          {
          System.out.println(element.isDisplayed());
         ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          Log.info(" Transformed checkbox  is displayed in Sample section  ");
          Log.info("Transformed checkbox  is enabled in Sample section  ");
          }else
          {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          	Log.info("Transformed checkbox  is not displayed/enabled  in sample section ");
          }
          Log.info("Transformed checkbox in Sample section has passed element");
  	}catch (Exception e){
     		Log.error("Transformed checkbox in Sample section  has fail in catch ");
     		
     		throw(e);
     		}

     	return element;
        
 }	



public static WebElement sam_sec_chkbx_live_sampls() throws Exception{
 	try{
 		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_chkbx_live_sampls"))));	
  		
 	     boolean status = true;
			if(element.isEnabled() == status)
          {
          System.out.println(element.isDisplayed());
         ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          Log.info(" Live samples checkbox is displayed in sample section ");
          Log.info("Live samples checkbox is enabled in sample section ");
          }else
          {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
          	Log.info("Live samples checkbox is not displayed/enabled  in sample section ");
          }
          Log.info("Transformed checkbox in Sample section has passed element");
  	}catch (Exception e){
     		Log.error("Transformed checkbox in Sample section  has fail in catch ");
     		
     		throw(e);
     		}

     	return element;
        
 }

public static WebElement btn_req_for_servi1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("btn_req_for_servi1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_ser_area_sec_exp_date);
     Log.info(" Live samples checkbox is displayed in sample section ");
     Log.info("Live samples checkbox is enabled in sample section ");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_btn_req_for_servi1);
     	Log.info("req for service button is not displayed/enabled  in sample section ");
     }
     Log.info("req for service button has passed element");
	}catch (Exception e){
		Log.error("req for service button has fail in catch ");
		
		throw(e);
		}

	return element;
   
} 

public static WebElement txt_Req_Info_F_Name() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_F_Name"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_F_Name);
     Log.info(" first name is displayed in requester info");
     Log.info("first name is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Req_Info_F_Name);
     	Log.info("first name is not displayed/enabled  in requester info");
     }
     Log.info("first name has passed element in requester info");
	}catch (Exception e){
		Log.error("first name has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	 

public static WebElement txt_Req_Info_L_Name() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_L_Name"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_L_Name);
     Log.info(" last name is displayed in requester info");
     Log.info("last name is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Req_Info_L_Name);
     	Log.info("last name is not displayed/enabled  in requester info");
     }
     Log.info("last name has passed element in requester info");
	}catch (Exception e){
		Log.error("last name has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  txt_Req_Info_Sec_Kaust_ID1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Kaust_ID1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Kaust_ID1);
     Log.info(" kaust id is displayed in requester info");
     Log.info("kaust id is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Req_Info_Sec_Kaust_ID1);
     	Log.info("kaust id is not displayed/enabled  in requester info");
     }
     Log.info("kaust id has passed element in requester info");
	}catch (Exception e){
		Log.error("kaust id has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  txt_Req_Info_Sec_Email1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Email1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Email1);
     Log.info(" email is displayed in requester info");
     Log.info("email is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Req_Info_Sec_Email1);
     	Log.info("email is not displayed/enabled  in requester info");
     }
     Log.info("email has passed element in requester info");
	}catch (Exception e){
		Log.error("email has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  txt_Dep1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Dep1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Dep1);
     Log.info(" department is displayed in requester info");
     Log.info("department is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Dep1);
     	Log.info("department is not displayed/enabled  in requester info");
     }
     Log.info("department has passed element in requester info");
	}catch (Exception e){
		Log.error("department has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	   

public static WebElement  txt_Req_Info_Sec_Tel1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Tel1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Tel1);
     Log.info(" telephone is displayed in requester info");
     Log.info("telephone is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Req_Info_Sec_Tel1);
     	Log.info("telephone is not displayed/enabled  in requester info");
     }
     Log.info("telephone has passed element in requester info");
	}catch (Exception e){
		Log.error("telephone has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	   

public static WebElement txt_Mob1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Mob1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Mob1);
     Log.info(" mobile is displayed in requester info");
     Log.info("mobile is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Mob1);
     	Log.info("mobile is not displayed/enabled  in requester info");
     }
     Log.info("mobile has passed element in requester info");
	}catch (Exception e){
		Log.error("mobile has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	   

public static WebElement  txt_Req_Info_Sec_Pos1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Pos1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Pos1);
     Log.info("position is displayed in requester info");
     Log.info("position is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Req_Info_Sec_Pos1);
     	Log.info("position is not displayed/enabled  in requester info");
     }
     Log.info("position has passed element in requester info");
	}catch (Exception e){
		Log.error("position has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    
public static WebElement  pock_ID_drp_dwn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pock_ID_drp_dwn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_pock_ID_drp_dwn1);
     Log.info("pock_ID_drp_dwn1 is displayed in requester info");
     Log.info("pock_ID_drp_dwn1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_pock_ID_drp_dwn1);
     	Log.info("pock_ID_drp_dwn1 is not displayed/enabled  in requester info");
     }
     Log.info("pock_ID_drp_dwn1 has passed element in requester info");
	}catch (Exception e){
		Log.error("pock_ID_drp_dwn1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    

public static WebElement  Pock_ID_drp_dwn_Selec_first1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Pock_ID_drp_dwn_Selec_first1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_first1);
     Log.info("Pock_ID_drp_dwn_Selec_first1 is displayed in requester info");
     Log.info("Pock_ID_drp_dwn_Selec_first1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_first1);
     	Log.info("Pock_ID_drp_dwn_Selec_first1 is not displayed/enabled  in requester info");
     }
     Log.info("Pock_ID_drp_dwn_Selec_first1 has passed element in requester info");
	}catch (Exception e){
		Log.error("Pock_ID_drp_dwn_Selec_first1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    

public static WebElement  Pock_ID_drp_dwn_Selec_last1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Pock_ID_drp_dwn_Selec_last1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_last1);
     Log.info("Pock_ID_drp_dwn_Selec_last1 is displayed in requester info");
     Log.info("Pock_ID_drp_dwn_Selec_last1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_last1);
     	Log.info("Pock_ID_drp_dwn_Selec_last1 is not displayed/enabled  in requester info");
     }
     Log.info("Pock_ID_drp_dwn_Selec_last1 has passed element in requester info");
	}catch (Exception e){
		Log.error("Pock_ID_drp_dwn_Selec_last1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    
     		        	
public static WebElement  txt_PI_Name1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_PI_Name1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_PI_Name1);
     Log.info("PI_Name1 is displayed in requester info");
     Log.info("PI_Name1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_PI_Name1);
     	Log.info("PI_Name1 is not displayed/enabled  in requester info");
     }
     Log.info("PI_Name1 has passed element in requester info");
	}catch (Exception e){
		Log.error("PI_Name1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    
     		        	
public static WebElement  txt_Pri_Inv_Sec_Kaust_ID1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Kaust_ID1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Kaust_ID1);
     Log.info("Pri_Inv_Sec_Kaust_ID is displayed in requester info");
     Log.info("Pri_Inv_Sec_Kaust_ID is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Pri_Inv_Sec_Kaust_ID1);
     	Log.info("Pri_Inv_Sec_Kaust_ID is not displayed/enabled  in requester info");
     }
     Log.info("Pri_Inv_Sec_Kaust_ID has passed element in requester info");
	}catch (Exception e){
		Log.error("Pri_Inv_Sec_Kaust_ID has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	          	 	           	
public static WebElement  txt_Pri_Inv_Sec_Email1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Email1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Email1);
     Log.info("Pri_Inv_Sec_Email1 is displayed in requester info");
     Log.info("Pri_Inv_Sec_Email1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Pri_Inv_Sec_Email1);
     	Log.info("Pri_Inv_Sec_Email1 is not displayed/enabled  in requester info");
     }
     Log.info("Pri_Inv_Sec_Email1 has passed element in requester info");
	}catch (Exception e){
		Log.error("Pri_Inv_Sec_Email1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	          	 	           	

public static WebElement txt_Pri_Inv_Sec_Pos1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Pos1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Pos1);
     Log.info("Pri_Inv_Sec_Pos1 is displayed in requester info");
     Log.info("Pri_Inv_Sec_Pos1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Pri_Inv_Sec_Pos1);
     	Log.info("Pri_Inv_Sec_Pos1 is not displayed/enabled  in requester info");
     }
     Log.info("Pri_Inv_Sec_Pos1 has passed element in requester info");
	}catch (Exception e){
		Log.error("Pri_Inv_Sec_Pos1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	          	 	           	
public static WebElement  txt_Pri_Inv_Sec_Tel1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Tel1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Tel1);
     Log.info("Pri_Inv_Sec_Tel1 is displayed in requester info");
     Log.info("Pri_Inv_Sec_Tel1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Pri_Inv_Sec_Tel1);
     	Log.info("Pri_Inv_Sec_Tel1 is not displayed/enabled  in requester info");
     }
     Log.info("Pri_Inv_Sec_Tel1 has passed element in requester info");
	}catch (Exception e){
		Log.error("Pri_Inv_Sec_Tel1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	          	 	           	

public static WebElement req_info_save_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_info_save_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_req_info_save_btn1);
     Log.info("req_info_save_btn1 is displayed in requester info");
     Log.info("req_info_save_btn1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_req_info_save_btn1);
     	Log.info("req_info_save_btn1 is not displayed/enabled  in requester info");
     }
     Log.info("req_info_save_btn1 has passed element in requester info");
	}catch (Exception e){
		Log.error("req_info_save_btn1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	          	 	           	

public static WebElement req_info_prev_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_info_prev_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_req_info_prev_btn1);
     Log.info("req_info_prev_btn1 is displayed in requester info");
     Log.info("req_info_prev_btn1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_req_info_prev_btn1);
     	Log.info("req_info_prev_btn1 is not displayed/enabled  in requester info");
     }
     Log.info("req_info_prev_btn1 has passed element in requester info");
	}catch (Exception e){
		Log.error("req_info_prev_btn1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	          	 	

public static WebElement  serv_area_drp_dwn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_drp_dwn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_drp_dwn1);
     Log.info("serv_area_drp_dwn1 is displayed in Service Area");
     Log.info("serv_area_drp_dwn1 is enabled in Service Area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_drp_dwn1);
     	Log.info("serv_area_drp_dwn1 is not displayed/enabled  in Service Area");
     }
     Log.info("serv_area_drp_dwn1 has passed element in Service Area");
	}catch (Exception e){
		Log.error("serv_area_drp_dwn1 has fail in catch in Service Area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  serv_area_drp_dwn_selec_second() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_drp_dwn_selec_second"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_drp_dwn_selec_second);
     Log.info("serv_area_drp_dwn_selec_second is displayed in service area");
     Log.info("serv_area_drp_dwn_selec_second is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_drp_dwn_selec_second);
     	Log.info("serv_area_drp_dwn_selec_second is not displayed/enabled  in service area");
     }
     Log.info("serv_area_drp_dwn_selec_second has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_drp_dwn_selec_second has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	     


public static WebElement  txt_Aim_of_stdy1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Aim_of_stdy1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Aim_of_stdy1);
     Log.info("Aim_of_stdy1 is displayed in service area");
     Log.info("Aim_of_stdy1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_Aim_of_stdy1);
     	Log.info("Aim_of_stdy1 is not displayed/enabled  in service area");
     }
     Log.info("Aim_of_stdy1 has passed element in service area");
	}catch (Exception e){
		Log.error("Aim_of_stdy1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement  txt_exp_data_del1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_exp_data_del1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_exp_data_del1);
     Log.info("exp_data_del1 is displayed in service area");
     Log.info("exp_data_del1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_exp_data_del1);
     	Log.info("exp_data_del1 is not displayed/enabled  in service area");
     }
     Log.info("exp_data_del1 has passed element in service area");
	}catch (Exception e){
		Log.error("exp_data_del1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  txt_meth1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_meth1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_meth1);
     Log.info("meth1 is displayed in service area");
     Log.info("meth1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_meth1);
     	Log.info("meth1 is not displayed/enabled  in service area");
     }
     Log.info("meth1 has passed element in service area");
	}catch (Exception e){
		Log.error("meth1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement serv_area_Sec_browse_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_browse_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_browse_btn1);
     Log.info("serv_area_Sec_browse_btn1 is displayed in service area");
     Log.info("serv_area_Sec_browse_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_Sec_browse_btn1);
     	Log.info("serv_area_Sec_browse_btn1 is not displayed/enabled  in service area");
     }
     Log.info("serv_area_Sec_browse_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_browse_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  serv_area_Sec_upload_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_upload_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_upload_btn1);
     Log.info("serv_area_Sec_upload_btn1 is displayed in service area");
     Log.info("serv_area_Sec_upload_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_Sec_upload_btn1);
     	Log.info("serv_area_Sec_upload_btn1 is not displayed/enabled  in service area");
     }
     Log.info("serv_area_Sec_upload_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_upload_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  pop_up1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pop_up1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_pop_up1);
     Log.info("pop_up1 is displayed in service area");
     Log.info("pop_up1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_pop_up1);
     	Log.info("pop_up1 is not displayed/enabled  in service area");
     }
     Log.info("pop_up1 has passed element in service area");
	}catch (Exception e){
		Log.error("pop_up1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement  serv_area_Sec_save_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_save_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_save_btn1);
     Log.info("serv_area_Sec_save_btn1 is displayed in service area");
     Log.info("serv_area_Sec_save_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_Sec_save_btn1);
     	Log.info("serv_area_Sec_save_btn1 is not displayed/enabled  in service area");
     }
     Log.info("serv_area_Sec_save_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_save_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement serv_area_Sec_prev_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_prev_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_prev_btn1);
     Log.info("serv_area_Sec_prev_btn1 is displayed in service area");
     Log.info("serv_area_Sec_prev_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_Sec_prev_btn1);
     	Log.info("serv_area_Sec_prev_btn1 is not displayed/enabled  in requester info");
     }
     Log.info("serv_area_Sec_prev_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_prev_btn1 has fail in catch in service area ");
		
		throw(e);
		}

	return element;
   
} 	    	 	    


public static WebElement  serv_area_Sec_next_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_next_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_next_btn1);
     Log.info("serv_area_Sec_next_btn1 is displayed in service area");
     Log.info("serv_area_Sec_next_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_serv_area_Sec_next_btn1);
     	Log.info("serv_area_Sec_next_btn1 is not displayed/enabled  in requester info");
     }
     Log.info("serv_area_Sec_next_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_next_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  No_Samp1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("No_Samp1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_No_Samp1);
     Log.info("No_Samp1 is displayed in sample section");
     Log.info("No_Samp1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_No_Samp1);
     	Log.info("No_Samp1 is not displayed/enabled  in sample section");
     }
     Log.info("No_Samp1 has passed element in sample section");
	}catch (Exception e){
		Log.error("No_Samp1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  txt_sam_sec_samp_origin() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_sam_sec_samp_origin"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_sam_sec_samp_origin);
     Log.info("Col_txt_sam_sec_samp_origin is displayed in sample section");
     Log.info("Col_txt_sam_sec_samp_origin is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_sam_sec_samp_origin);
     	Log.info("Col_txt_sam_sec_samp_origin is not displayed/enabled  in sample section");
     }
     Log.info("Col_txt_sam_sec_samp_origin has passed element in sample section");
	}catch (Exception e){
		Log.error("Col_txt_sam_sec_samp_origin has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    



public static WebElement  req_info_next_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_info_next_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_req_info_next_btn1);
     Log.info("req_info_next_btn1 is displayed in requester info");
     Log.info("req_info_next_btn1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_req_info_next_btn1);
     	Log.info("req_info_next_btn1 is not displayed/enabled  in requester info");
     }
     Log.info("req_info_next_btn1 has passed element in requester info");
	}catch (Exception e){
		Log.error("req_info_next_btn1 has fail in catch in requester info ");
		
		throw(e);
		}

	return element;
   
} 	    	 	    


public static WebElement  sam_sec_chkbx_human_origin() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sam_sec_chkbx_human_origin"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_sam_sec_chkbx_human_origin);
     Log.info("sam_sec_chkbx_human_origin is displayed insample section");
     Log.info("sam_sec_chkbx_human_origin is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sam_sec_chkbx_human_origin);
     	Log.info("sam_sec_chkbx_human_origin is not displayed/enabled  in sample section");
     }
     Log.info("sam_sec_chkbx_human_origin has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_chkbx_human_origin has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    






public static WebElement  sample_data1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sample_data1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_sample_data1);
     Log.info("sample_data1 is displayed insample section");
     Log.info("sample_data1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_sample_data1);
     	Log.info("sample_data1 is not displayed/enabled  in sample section");
     }
     Log.info("sample_data1 has passed element in sample section");
	}catch (Exception e){
		Log.error("sample_data1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    


public static WebElement specific_instuct1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("specific_instuct1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_specific_instuct1);
     Log.info("specific_instuct1 is displayed insample section");
     Log.info("specific_instuct1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_specific_instuct1);
     	Log.info("specific_instuct1 is not displayed/enabled  in sample section");
     }
     Log.info("specific_instuct1 has passed element in sample section");
	}catch (Exception e){
		Log.error("specific_instuct1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    


public static WebElement  tab_samp_del_sec1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_samp_del_sec1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_tab_samp_del_sec1);
     Log.info("samp_del_sec1 is displayed in sample del section");
     Log.info("samp_del_sec1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_samp_del_sec1);
     	Log.info("samp_del_sec1 is not displayed/enabled  in sample del section");
     }
     Log.info("samp_del_sec1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_sec1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  ret_sampls_chkbx1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("ret_sampls_chkbx1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_ret_sampls_chkbx1);
     Log.info("ret_sampls_chkbx1 is displayed in sample del section");
     Log.info("ret_sampls_chkbx1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_ret_sampls_chkbx1);
     	Log.info("ret_sampls_chkbx1 is not displayed/enabled  in sample del section");
     }
     Log.info("ret_sampls_chkbx1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("ret_sampls_chkbx1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement  samp_del_mod_arrow_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_mod_arrow_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_mod_arrow_btn1);
     Log.info("samp_del_mod_arrow_btn1 is displayed in sample del section");
     Log.info("samp_del_mod_arrow_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_samp_del_mod_arrow_btn1);
     	Log.info("samp_del_mod_arrow_btn1 is not displayed/enabled  in sample del section");
     }
     Log.info("samp_del_sec1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_mod_arrow_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement samp_del_mod_selec_drp_dwn_last() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_mod_selec_drp_dwn_last"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_mod_selec_drp_dwn_last);
     Log.info("samp_del_mod_selec_drp_dwn_last is displayed in sample del section");
     Log.info("samp_del_mod_selec_drp_dwn_last is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_samp_del_mod_selec_drp_dwn_last);
     	Log.info("samp_del_mod_selec_drp_dwn_last is not displayed/enabled  in sample del section");
     }
     Log.info("samp_del_mod_selec_drp_dwn_last has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_mod_selec_drp_dwn_last has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  rep_arrow_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rep_arrow_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rep_arrow_btn1);
     Log.info("rep_arrow_btn1 is displayed in sample del section");
     Log.info("rep_arrow_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rep_arrow_btn1);
     	Log.info("rep_arrow_btn1 is not displayed/enabled  in sample del section");
     }
     Log.info("rep_arrow_btn1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("rep_arrow_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement  rep_drp_dwn_selec_sec1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rep_drp_dwn_selec_sec1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rep_drp_dwn_selec_sec1);
     Log.info("rep_drp_dwn_selec_sec1 is displayed in sample del section");
     Log.info("rep_drp_dwn_selec_sec1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rep_drp_dwn_selec_sec1);
     	Log.info("rep_drp_dwn_selec_sec1 is not displayed/enabled  in sample del section");
     }
     Log.info("rep_drp_dwn_selec_sec1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("rep_drp_dwn_selec_sec1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement samp_del_sec_save_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_sec_save_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_sec_save_btn1);
     Log.info("samp_del_sec_save_btn1 is displayed in sample del section");
     Log.info("samp_del_sec_save_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_samp_del_sec_save_btn1);
     	Log.info("samp_del_sec_save_btn1 is not displayed/enabled  in sample del section");
     }
     Log.info("samp_del_sec_save_btn1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_sec_save_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  samp_del_sec_prev_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_sec_prev_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_sec_prev_btn1);
     Log.info("samp_del_sec_prev_btn1 is displayed in sample del section");
     Log.info("samp_del_sec_prev_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_samp_del_sec_prev_btn1);
     	Log.info("samp_del_sec_prev_btn1 is not displayed/enabled  in sample del section");
     }
     Log.info("samp_del_sec_prev_btn1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_sec_prev_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement samp_del_sec_submit_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_sec_submit_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_sec_submit_btn1);
     Log.info("samp_del_sec_submit_btn1 is displayed in sample del section");
     Log.info("samp_del_sec_submit_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_samp_del_sec_submit_btn1);
     	Log.info("samp_del_sec_submit_btn1 is not displayed/enabled  in sample del section");
     }
     Log.info("samp_del_sec_submit_btn1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_sec_submit_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	    
public static WebElement  rfs_no_pop_up_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_no_pop_up_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_no_pop_up_btn);
     Log.info("rfs_no_pop_up_btn is displayed in sample del section");
     Log.info("rfs_no_pop_up_btn is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_no_pop_up_btn);
     	Log.info("rfs_no_pop_up_btn is not displayed/enabled  in sample del section");
     }
     Log.info("rfs_no_pop_up_btn has passed element in sample del section");
	}catch (Exception e){
		Log.error("rfs_no_pop_up_btn has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    
public static WebElement my_open_task1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("my_open_task1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_my_open_task1);
     Log.info("my_open_task1 is displayed");
     Log.info("my_open_task1 is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_my_open_task1);
     	Log.info("my_open_task1 is not displayed/enabled");
     }
     Log.info("my_open_task1 has passed element");
	}catch (Exception e){
		Log.error("my_open_task1 has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  Col_task_title_link1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Col_task_title_link1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_task_title_link1);
     Log.info("task_title_link1 is displayed");
     Log.info("task_title_link1 is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_task_title_link1);
     	Log.info("task_title_link1 is not displayed/enabled");
     }
     Log.info("task_title_link1 has passed element");
	}catch (Exception e){
		Log.error("task_title_link1 has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement tab_rfs_submsn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_rfs_submsn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn1);
     Log.info("tab_rfs_submsn1 is displayed");
     Log.info("tab_rfs_submsn1 is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn1);
     	Log.info("tab_rfs_submsn1 is not displayed/enabled");
     }
     Log.info("tab_rfs_submsn1 has passed element");
	}catch (Exception e){
		Log.error("tab_rfs_submsn1 has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  tab_rfs_submsn_req_info1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_rfs_submsn_req_info1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_tab_rfs_submsn_req_info1);
     Log.info("tab_rfs_submsn_req_info1 is displayed in requester info");
     Log.info("tab_rfs_submsn_req_info1 is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_tab_rfs_submsn_req_info1);
     	Log.info("tab_rfs_submsn_req_info1 is not displayed/enabled in requester info");
     }
     Log.info("tab_rfs_submsn_req_info1 has passed element in requester info");
	}catch (Exception e){
		Log.error("tab_rfs_submsn_req_info1 has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	    

public static WebElement  txt_rfs_submsn_Req_Info_F_Name() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_F_Name"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_F_Name);
     Log.info("rfs_submsn_Req_Info_F_Name is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_F_Name is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_F_Name);
     	Log.info("rfs_submsn_Req_Info_F_Name is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_F_Name has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_F_Name has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_L_Name() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_L_Name"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_L_Name);
     Log.info("rfs_submsn_Req_Info_L_Name is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_L_Name is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_L_Name);
     	Log.info("rfs_submsn_Req_Info_L_Name is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_L_Name has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_L_Name has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement txt_rfs_submsn_Req_Info_Sec_Kaust_ID() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Kaust_ID"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Kaust_ID);
     Log.info("rfs_submsn_Req_Info_Sec_Kaust_ID is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Kaust_ID is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Kaust_ID);
     	Log.info("rfs_submsn_Req_Info_Sec_Kaust_ID is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Kaust_ID has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Kaust_ID has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Email() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Email"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Email);
     Log.info("rfs_submsn_Req_Info_Sec_Email is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Email is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Email);
     	Log.info("rfs_submsn_Req_Info_Sec_Email is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Email has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Email has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Dep() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Dep"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Dep);
     Log.info("rfs_submsn_Req_Info_Sec_Dep is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Dep is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Dep);
     	Log.info("rfs_submsn_Req_Info_Sec_Dep is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Dep has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Dep has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Tel() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Tel"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Tel);
     Log.info("rfs_submsn_Req_Info_Sec_Tel is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Tel is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Tel);
     	Log.info("rfs_submsn_Req_Info_Sec_Tel is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Tel has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Tel has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Mob() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Mob"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Mob);
     Log.info("rfs_submsn_Req_Info_Sec_Mob is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Mob is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Mob);
     	Log.info("rfs_submsn_Req_Info_Sec_Mob is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Mob has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Mob has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Pos() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Pos"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pos);
     Log.info("rfs_submsn_Req_Info_Sec_Pos is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Pos is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pos);
     	Log.info("rfs_submsn_Req_Info_Sec_Pos is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Pos has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Pos has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn);
     Log.info("rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn);
     	Log.info("rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_pock_ID_drp_dwn has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_first() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_first"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_first);
     Log.info("Pock_ID_drp_dwn_Selec_first is displayed in requester info");
     Log.info("Pock_ID_drp_dwn_Selec_first is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_first);
     	Log.info("Pock_ID_drp_dwn_Selec_first is not displayed/enabled in requester info");
     }
     Log.info("Pock_ID_drp_dwn_Selec_first has passed element in requester info");
	}catch (Exception e){
		Log.error("Pock_ID_drp_dwn_Selec_first has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_last() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_last"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_last);
     Log.info("Pock_ID_drp_dwn_Selec_last is displayed in requester info");
     Log.info("Pock_ID_drp_dwn_Selec_last is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_Req_Info_Sec_Pock_ID_drp_dwn_Selec_last);
     	Log.info("Pock_ID_drp_dwn_Selec_last is not displayed/enabled in requester info");
     }
     Log.info("Pock_ID_drp_dwn_Selec_last has passed element in requester info");
	}catch (Exception e){
		Log.error("Pock_ID_drp_dwn_Selec_last has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   
public static WebElement  txt_rfs_submsn_Req_Info_Sec_PI_Name() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_PI_Name"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_PI_Name);
     Log.info("Req_Info_Sec_PI_Name is displayed in requester info");
     Log.info("Req_Info_Sec_PI_Name is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_PI_Name);
     	Log.info("Req_Info_Sec_PI_Name is not displayed/enabled in requester info");
     }
     Log.info("Req_Info_Sec_PI_Name has passed element in requester info");
	}catch (Exception e){
		Log.error("Req_Info_Sec_PI_Name has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   
public static WebElement  txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Kaust_ID() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Kaust_ID"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Kaust_ID);
     Log.info("Req_Info_Sec_Pri_Inv_Sec_Kaust_ID is displayed in requester info");
     Log.info("Req_Info_Sec_Pri_Inv_Sec_Kaust_ID is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Kaust_ID);
     	Log.info("Req_Info_Sec_Pri_Inv_Sec_Kaust_ID is not displayed/enabled in requester info");
     }
     Log.info("Req_Info_Sec_Pri_Inv_Sec_Kaust_ID has passed element in requester info");
	}catch (Exception e){
		Log.error("Req_Info_Sec_Pri_Inv_Sec_Kaust_ID has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email);
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email);
     	Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Email has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos);
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos);
     	Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Pos has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel);
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel);
     	Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_Pri_Inv_Sec_Tel has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_Req_Info_Sec_next_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_Req_Info_Sec_next_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_next_btn);
     Log.info("rfs_submsn_Req_Info_Sec_next_btn is displayed in requester info");
     Log.info("rfs_submsn_Req_Info_Sec_next_btn is enabled in requester info");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_Req_Info_Sec_next_btn);
     	Log.info("rfs_submsn_Req_Info_Sec_next_btn is not displayed/enabled in requester info");
     }
     Log.info("rfs_submsn_Req_Info_Sec_next_btn has passed element in requester info");
	}catch (Exception e){
		Log.error("rfs_submsn_Req_Info_Sec_next_btn has fail in catch in requester info");
		
		throw(e);
		}

	return element;
   
} 	    	 	   

public static WebElement  txt_rfs_submsn_ser_area_sec_ser_area_drp_dwn_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_ser_area_sec_ser_area_drp_dwn_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_ser_area_sec_ser_area_drp_dwn_btn);
     Log.info("ser_area_sec_ser_area_drp_dwn_bt is displayed in service area");
     Log.info("ser_area_sec_ser_area_drp_dwn_bt is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_ser_area_sec_ser_area_drp_dwn_btn);
     	Log.info("ser_area_sec_ser_area_drp_dwn_bt is not displayed/enabled in service area");
     }
     Log.info("ser_area_sec_ser_area_drp_dwn_bt has passed element in service area");
	}catch (Exception e){
		Log.error("ser_area_sec_ser_area_drp_dwn_bt has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  txt_rfs_submsn_ser_area_sel_sec() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_ser_area_sel_sec"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_ser_area_sel_sec);
     Log.info("rfs_submsn_ser_area_sel_sec is displayed in service area");
     Log.info("rfs_submsn_ser_area_sel_sec is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_ser_area_sel_sec);
     	Log.info("ser_area_sec_ser_area_drp_dwn_bt is not displayed/enabled in service area");
     }
     Log.info("ser_area_sec_ser_area_drp_dwn_bt has passed element in service area");
	}catch (Exception e){
		Log.error("ser_area_sec_ser_area_drp_dwn_bt has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement txt_rfs_submsn_ser_area__Aim_of_stdy1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txtrfs_submsn_ser_area__Aim_of_stdy1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_ser_area__Aim_of_stdy1);
     Log.info("Aim_of_stdy1 is displayed in service area");
     Log.info("Aim_of_stdy1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_ser_area__Aim_of_stdy1);
     	Log.info("Aim_of_stdy1 is not displayed/enabled in service area");
     }
     Log.info("Aim_of_stdy1 has passed element in service area");
	}catch (Exception e){
		Log.error("Aim_of_stdy1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  txt_rfs_submsn_ser_area_exp_data_del1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_ser_area_exp_data_del1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_ser_area_exp_data_del1);
     Log.info("ser_area_exp_data_del1 is displayed in service area");
     Log.info("ser_area_exp_data_del1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_ser_area_exp_data_del1);
     	Log.info("ser_area_exp_data_del1 is not displayed/enabled in service area");
     }
     Log.info("ser_area_exp_data_del1 has passed element in service area");
	}catch (Exception e){
		Log.error("ser_area_exp_data_del1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  txt_rfs_submsn_ser_area_meth1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_ser_area_meth1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_ser_area_meth1);
     Log.info("ser_area_meth1 is displayed in service area");
     Log.info("ser_area_meth1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_ser_area_meth1);
     	Log.info("ser_area_meth1 is not displayed/enabled in service area");
     }
     Log.info("ser_area_meth1 has passed element in service area");
	}catch (Exception e){
		Log.error("ser_area_meth1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_serv_area_Sec_browse_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_serv_area_Sec_browse_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_serv_area_Sec_browse_btn1);
     Log.info("serv_area_Sec_browse_btn1 is displayed in service area");
     Log.info("serv_area_Sec_browse_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_serv_area_Sec_browse_btn1);
     	Log.info("serv_area_Sec_browse_btn1 is not displayed/enabled in service area");
     }
     Log.info("serv_area_Sec_browse_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_browse_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_serv_area_Sec_upload_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_serv_area_Sec_upload_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_serv_area_Sec_upload_btn1);
     Log.info("serv_area_Sec_upload_btn1 is displayed in service area");
     Log.info("serv_area_Sec_upload_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_serv_area_Sec_upload_btn1);
     	Log.info("serv_area_Sec_upload_btn1 is not displayed/enabled in service area");
     }
     Log.info("serv_area_Sec_upload_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_upload_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_ser_area_pop_up1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_ser_area_pop_up1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_ser_area_pop_up1);
     Log.info("ser_area_pop_up1 is displayed in service area");
     Log.info("ser_area_pop_up1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_ser_area_pop_up1);
     	Log.info("ser_area_pop_up1 is not displayed/enabled in service area");
     }
     Log.info("ser_area_pop_up1 has passed element in service area");
	}catch (Exception e){
		Log.error("ser_area_pop_up1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_serv_area_Sec_next_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_serv_area_Sec_next_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_serv_area_Sec_next_btn1);
     Log.info("serv_area_Sec_next_btn1 is displayed in service area");
     Log.info("serv_area_Sec_next_btn1 is enabled in service area");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_serv_area_Sec_next_btn1);
     	Log.info("serv_area_Sec_next_btn1 is not displayed/enabled in service area");
     }
     Log.info("serv_area_Sec_next_btn1 has passed element in service area");
	}catch (Exception e){
		Log.error("serv_area_Sec_next_btn1 has fail in catch in service area");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_sam_sec_No_Samp1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_sam_sec_No_Samp1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_sam_sec_No_Samp1);
     Log.info("sam_sec_No_Samp1 is displayed in sample section");
     Log.info("sam_sec_No_Samp1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_sam_sec_No_Samp1);
     	Log.info("sam_sec_No_Samp1 is not displayed/enabled in sample section");
     }
     Log.info("sam_sec_No_Samp1 has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_No_Samp1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 

public static WebElement txt_rfs_submsn_sam_sec_samp_origin() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_sam_sec_samp_origin"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_sam_sec_samp_origin);
     Log.info("sam_sec_samp_origin is displayed in sample section");
     Log.info("sam_sec_samp_origin is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_sam_sec_samp_origin);
     	Log.info("sam_sec_samp_origin is not displayed/enabled in sample section");
     }
     Log.info("sam_sec_samp_origin has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_samp_origin has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement txt_rfs_submsn_sam_sec_samp_name() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_rfs_submsn_sam_sec_samp_name"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_rfs_submsn_sam_sec_samp_name);
     Log.info("sam_sec_samp_name is displayed in sample section");
     Log.info("sam_sec_samp_name is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_rfs_submsn_sam_sec_samp_name);
     	Log.info("sam_sec_samp_name is not displayed/enabled in sample section");
     }
     Log.info("sam_sec_samp_name has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_samp_name has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_sam_sec_chkbx_human_origin() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_sam_sec_chkbx_human_origin"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_sam_sec_chkbx_human_origin);
     Log.info("sam_sec_chkbx_human_origin is displayed in sample section");
     Log.info("sam_sec_chkbx_human_origin is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_sam_sec_chkbx_human_origin);
     	Log.info("sam_sec_chkbx_human_origin is not displayed/enabled in sample section");
     }
     Log.info("sam_sec_chkbx_human_origin has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_chkbx_human_origin has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_sam_sec_chkbx_transformed() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_sam_sec_chkbx_transformed"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_sam_sec_chkbx_transformed);
     Log.info("sam_sec_chkbx_transformed is displayed in sample section");
     Log.info("sam_sec_chkbx_transformed is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_sam_sec_chkbx_transformed);
     	Log.info("sam_sec_chkbx_transformed is not displayed/enabled in sample section");
     }
     Log.info("sam_sec_chkbx_transformed has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_chkbx_transformed has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_sam_sec_chkbx_live_sampls() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_sam_sec_chkbx_live_sampls"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_sam_sec_chkbx_live_sampls);
     Log.info("sam_sec_chkbx_live_sampls is displayed in sample section");
     Log.info("sam_sec_chkbx_live_sampls is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_sam_sec_chkbx_live_sampls);
     	Log.info("sam_sec_chkbx_live_sampls is not displayed/enabled in sample section");
     }
     Log.info("sam_sec_chkbx_live_sampls has passed element in sample section");
	}catch (Exception e){
		Log.error("sam_sec_chkbx_live_sampls has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_sample_data1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_sample_data1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_sample_data1);
     Log.info("sample_data1 is displayed in sample section");
     Log.info("sample_data1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_sample_data1);
     	Log.info("sample_data1 is not displayed/enabled in sample section");
     }
     Log.info("sample_data1 has passed element in sample section");
	}catch (Exception e){
		Log.error("sample_data1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_specific_instuct1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_specific_instuct1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_specific_instuct1);
     Log.info("specific_instuct1 is displayed in sample section");
     Log.info("specific_instuct1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_specific_instuct1);
     	Log.info("specific_instuct1 is not displayed/enabled in sample section");
     }
     Log.info("specific_instuct1 has passed element in sample section");
	}catch (Exception e){
		Log.error("specific_instuct1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	


public static WebElement  rfs_submsn_tab_samp_del_sec1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_tab_samp_del_sec1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_tab_samp_del_sec1);
     Log.info("tab_samp_del_sec1 is displayed in sample del section");
     Log.info("tab_samp_del_sec1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_tab_samp_del_sec1);
     	Log.info("tab_samp_del_sec1 is not displayed/enabled in sample del section");
     }
     Log.info("tab_samp_del_sec1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("tab_samp_del_sec1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_sam_del_ret_sampls_chkbx1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_sam_del_ret_sampls_chkbx1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_sam_del_ret_sampls_chkbx1);
     Log.info("sam_del_ret_sampls_chkbx1 is displayed in sample del section");
     Log.info("sam_del_ret_sampls_chkbx1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_sam_del_ret_sampls_chkbx1);
     	Log.info("sam_del_ret_sampls_chkbx1 is not displayed/enabled in sample del section");
     }
     Log.info("sam_del_ret_sampls_chkbx1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("sam_del_ret_sampls_chkbx1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_samp_del_mod_arrow_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_mod_arrow_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_mod_arrow_btn1);
     Log.info("samp_del_mod_arrow_btn1 is displayed in sample del section");
     Log.info("samp_del_mod_arrow_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_mod_arrow_btn1);
     	Log.info("samp_del_mod_arrow_btn1 is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_mod_arrow_btn1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_mod_arrow_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_samp_del_mod_selec_drp_dwn_last() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_mod_selec_drp_dwn_last"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_mod_selec_drp_dwn_last);
     Log.info("samp_del_mod_selec_drp_dwn_last is displayed in sample del section");
     Log.info("samp_del_mod_selec_drp_dwn_last is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_mod_selec_drp_dwn_last);
     	Log.info("samp_del_mod_selec_drp_dwn_last is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_mod_selec_drp_dwn_last has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_mod_selec_drp_dwn_last has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	



public static WebElement  rfs_submsn_samp_del_rep_arrow_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_rep_arrow_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_rep_arrow_btn1);
     Log.info("samp_del_rep_arrow_btn1 is displayed in sample del section");
     Log.info("samp_del_rep_arrow_btn1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_rep_arrow_btn1);
     	Log.info("samp_del_rep_arrow_btn1 is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_rep_arrow_btn1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_rep_arrow_btn1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_samp_del_rep_drp_dwn_selec_sec1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_rep_drp_dwn_selec_sec1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_rep_drp_dwn_selec_sec1);
     Log.info("samp_del_rep_drp_dwn_selec_sec1 is displayed in sample del section");
     Log.info("samp_del_rep_drp_dwn_selec_sec1 is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_rep_drp_dwn_selec_sec1);
     	Log.info("samp_del_rep_drp_dwn_selec_sec1 is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_rep_drp_dwn_selec_sec1 has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_rep_drp_dwn_selec_sec1 has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_samp_Sec_browse_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_Sec_browse_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_Sec_browse_btn1);
     Log.info("submsn_samp_Sec_browse_btn1 is displayed in sample section");
     Log.info("submsn_samp_Sec_browse_btn1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_Sec_browse_btn1);
     	Log.info("submsn_samp_Sec_browse_btn1 is not displayed/enabled in sample section");
     }
     Log.info("submsn_samp_Sec_browse_btn1 has passed element in sample section");
	}catch (Exception e){
		Log.error("submsn_samp_Sec_browse_btn1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement rfs_submsn_samp_Sec_upload_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_Sec_upload_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_Sec_upload_btn1);
     Log.info("submsn_samp_Sec_upload_btn1 is displayed in sample section");
     Log.info("submsn_samp_Sec_upload_btn1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_Sec_upload_btn1);
     	Log.info("submsn_samp_Sec_upload_btn1 is not displayed/enabled in sample section");
     }
     Log.info("submsn_samp_Sec_upload_btn1 has passed element in sample section");
	}catch (Exception e){
		Log.error("submsn_samp_Sec_upload_btn1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_samp_pop_up1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_pop_up1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_pop_up1);
     Log.info("submsn_samp_pop_up1 is displayed in sample section");
     Log.info("submsn_samp_pop_up1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_pop_up1);
     	Log.info("submsn_samp_pop_up1 is not displayed/enabled in sample section");
     }
     Log.info("submsn_samp_pop_up1 has passed element in sample section");
	}catch (Exception e){
		Log.error("submsn_samp_pop_up1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	



public static WebElement  rfs_submsn_samp_Sec_next_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_Sec_next_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_Sec_next_btn1);
     Log.info("submsn_samp_Sec_next_btn1 is displayed in sample section");
     Log.info("submsn_samp_Sec_next_btn1 is enabled in sample section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_Sec_next_btn1);
     	Log.info("submsn_samp_Sec_next_btn1 is not displayed/enabled in sample section");
     }
     Log.info("submsn_samp_Sec_next_btn1 has passed element in sample section");
	}catch (Exception e){
		Log.error("submsn_samp_Sec_next_btn1 has fail in catch in sample section");
		
		throw(e);
		}

	return element;
   
} 	    	 	

public static WebElement  rfs_submsn_samp_del_sec_inquiry_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_inquiry_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_btn);
     Log.info("samp_del_sec_inquiry_btn is displayed in sample del section");
     Log.info("samp_del_sec_inquiry_btn is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_btn);
     	Log.info("samp_del_sec_inquiry_btn is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_sec_inquiry_btn has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_sec_inquiry_btn has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	

public static WebElement  rfs_submsn_samp_del_sec_inquiry_comments() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_inquiry_comments"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_comments);
     Log.info("samp_del_sec_inquiry_comments is displayed in sample del section");
     Log.info("samp_del_sec_inquiry_comments is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_comments);
     	Log.info("samp_del_sec_inquiry_comments is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_sec_inquiry_comments has passed element in sample del section");
	}catch (Exception e){
		Log.error("samp_del_sec_inquiry_comments has fail in catch in sample del section");
		
		throw(e);
		}

	return element;
   
} 	    	

public static WebElement  rfs_submsn_samp_del_sec_inquiry_comments_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_inquiry_comments_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_comments_submit_btn);
     Log.info("samp_del_sec_inquiry_comments_submit_btn is displayed in sample del section");
     Log.info("samp_del_sec_inquiry_comments_submit_btn is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_comments_submit_btn);
     	Log.info("samp_del_sec_inquiry_comments_submit_btn is not displayed/enabled in sample del section");
     }
     Log.info("samp_del_sec_inquiry_comments_submit_btn has passed element");
	}catch (Exception e){
		Log.error("samp_del_sec_inquiry_comments_submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	

public static WebElement rfs_submsn_samp_del_sec_inquiry_pop_up() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_inquiry_pop_up"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_pop_up);
     Log.info("rfs_submsn_samp_del_sec_inquiry_pop_up is displayed in sample del section");
     Log.info("rfs_submsn_samp_del_sec_inquiry_pop_up is enabled in sample del section");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_inquiry_pop_up);
     	Log.info("rfs_submsn_samp_del_sec_inquiry_pop_up is not displayed/enabled in sample del section");
     }
     Log.info("rfs_submsn_samp_del_sec_inquiry_pop_up has passed element");
	}catch (Exception e){
		Log.error("rfs_submsn_samp_del_sec_inquiry_pop_up has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	


public static WebElement  my_open_task_refresh_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("my_open_task_refresh_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_my_open_task_refresh_btn);
     Log.info("refresh_btn is displayed");
     Log.info("refresh_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_my_open_task_refresh_btn);
     	Log.info("refresh_btn is not displayed/enabled");
     }
     Log.info("refresh_btn has passed element");
	}catch (Exception e){
		Log.error("refresh_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	


public static WebElement  my_open_task_txt_search() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("my_open_task_txt_search"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_my_open_task_txt_search);
     Log.info("txt_search is displayed");
     Log.info("txt_search is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_my_open_task_txt_search);
     	Log.info("txt_search is not displayed/enabled in");
     }
     Log.info("txt_search has passed element");
	}catch (Exception e){
		Log.error("txt_search has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	    	




public static WebElement  my_open_task_search_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("my_open_task_search_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_my_open_task_search_btn);
     Log.info("search_btn is displayed");
     Log.info("search_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_my_open_task_search_btn);
     	Log.info("search_btn is not displayed/enabled in");
     }
     Log.info("search_btn has passed element");
	}catch (Exception e){
		Log.error("search_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_submsn_samp_del_sec_samp_design_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_samp_design_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_samp_design_btn);
     Log.info("samp_del_sec_samp_design_btn is displayed");
     Log.info("samp_del_sec_samp_design_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_samp_design_btn);
     	Log.info("samp_del_sec_samp_design_btn is not displayed/enabled in");
     }
     Log.info("samp_del_sec_samp_design_btn has passed element");
	}catch (Exception e){
		Log.error("samp_del_sec_samp_design_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_submsn_samp_del_sec_samp_design_ok_pop_up_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_samp_design_ok_pop_up_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_samp_design_ok_pop_up_btn);
     Log.info("samp_del_sec_samp_design_ok_pop_up_btn is displayed");
     Log.info("samp_del_sec_samp_design_ok_pop_up_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_samp_design_ok_pop_up_btn);
     	Log.info("samp_del_sec_samp_design_ok_pop_up_btn is not displayed/enabled in");
     }
     Log.info("samp_del_sec_samp_design_ok_pop_up_btn has passed element");
	}catch (Exception e){
		Log.error("samp_del_sec_samp_design_ok_pop_up_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_submsn_ser_area_uploaded_link() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_ser_area_uploaded_link"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_ser_area_uploaded_link);
     Log.info("ser_area_uploaded_lin is displayed");
     Log.info("ser_area_uploaded_lin is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_ser_area_uploaded_link);
     	Log.info("ser_area_uploaded_lin is not displayed/enabled in");
     }
     Log.info("ser_area_uploaded_lin has passed element");
	}catch (Exception e){
		Log.error("ser_area_uploaded_lin has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  rfs_submsn_samp_del_sec_approve_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_samp_del_sec_approve_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_samp_del_sec_approve_btn);
     Log.info("samp_del_sec_approve_btn is displayed");
     Log.info("samp_del_sec_approve_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_samp_del_sec_approve_btn);
     	Log.info("samp_del_sec_approve_btn is not displayed/enabled in");
     }
     Log.info("samp_del_sec_approve_btn has passed element");
	}catch (Exception e){
		Log.error("samp_del_sec_approve_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_submsn_scope_and_charges_tab() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_submsn_scope_and_charges_tab"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_submsn_scope_and_charges_tab);
     Log.info("scope_and_charges_tab is displayed");
     Log.info("scope_and_charges_tab is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_submsn_scope_and_charges_tab);
     	Log.info("scope_and_charges_tab is not displayed/enabled in");
     }
     Log.info("scope_and_charges_tab has passed element");
	}catch (Exception e){
		Log.error("scope_and_charges_tab has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement scope_and_charges_IBEC_chkbx() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scope_and_charges_IBEC_chkbx"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scope_and_charges_IBEC_chkbx);
     Log.info("Col_scope_and_charges_IBEC_chkbx is displayed");
     Log.info("Col_scope_and_charges_IBEC_chkbx is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scope_and_charges_IBEC_chkbx);
     	Log.info("Col_scope_and_charges_IBEC_chkbx is not displayed/enabled in");
     }
     Log.info("Col_scope_and_charges_IBEC_chkbx has passed element");
	}catch (Exception e){
		Log.error("Col_scope_and_charges_IBEC_chkbx has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_routine_chkbx() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_routine_chkbx"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_routine_chkbx);
     Log.info("scop_and_charges_routine_chkbx is displayed");
     Log.info("scop_and_charges_routine_chkbx is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_routine_chkbx);
     	Log.info("scop_and_charges_routine_chkbx is not displayed/enabled in");
     }
     Log.info("scop_and_charges_routine_chkbx has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_routine_chkbx has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement scop_and_charges_advance_chkbx() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_advance_chkbx"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_advance_chkbx);
     Log.info("scop_and_charges_advance_chkbx is displayed");
     Log.info("scop_and_charges_advance_chkbx is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_advance_chkbx);
     	Log.info("scop_and_charges_advance_chkbx is not displayed/enabled in");
     }
     Log.info("scop_and_charges_advance_chkbx has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_advance_chkbx has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  txt_scop_and_charges_sam_clarfcsn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_and_charges_sam_clarfcsn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_and_charges_sam_clarfcsn);
     Log.info("scop_and_charges_sam_clarfcsn is displayed");
     Log.info("scop_and_charges_sam_clarfcsn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_and_charges_sam_clarfcsn);
     	Log.info("scop_and_charges_sam_clarfcsn is not displayed/enabled in");
     }
     Log.info("scop_and_charges_sam_clarfcsn has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_sam_clarfcsn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement txt_scop_and_charges_methd_applied() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_and_charges_methd_applied"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_and_charges_methd_applied);
     Log.info("scop_and_charges_methd_applied is displayed");
     Log.info("scop_and_charges_methd_applied is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_and_charges_methd_applied);
     	Log.info("scop_and_charges_methd_applied is not displayed/enabled in");
     }
     Log.info("scop_and_charges_methd_applied has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_methd_applied has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  txt_scop_and_charges_delvrbls() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_and_charges_delvrbls"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_and_charges_delvrbls);
     Log.info("scop_and_charges_delvrbls is displayed");
     Log.info("scop_and_charges_delvrbls is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_and_charges_delvrbls);
     	Log.info("scop_and_charges_delvrbls is not displayed/enabled in");
     }
     Log.info("scop_and_charges_delvrbls has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_delvrbls has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement txt_scop_and_charges_sam_storg_loc_and_cond() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_scop_and_charges_sam_storg_loc_and_cond"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_txt_scop_and_charges_sam_storg_loc_and_cond);
     Log.info("scop_and_charges_sam_storg_loc_and_cond is displayed");
     Log.info("scop_and_charges_sam_storg_loc_and_cond is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_txt_scop_and_charges_sam_storg_loc_and_cond);
     	Log.info("scop_and_charges_sam_storg_loc_and_cond is not displayed/enabled in");
     }
     Log.info("scop_and_charges_sam_storg_loc_and_cond has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_sam_storg_loc_and_cond has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	 

public static WebElement chkbx_scop_and_charges_ibec_approval() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbx_scop_and_charges_ibec_approval"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_chkbx_scop_and_charges_ibec_approval);
     Log.info("scop_and_charges_ibec_approval is displayed");
     Log.info("scop_and_charges_ibec_approval is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbx_scop_and_charges_ibec_approval);
     	Log.info("scop_and_charges_ibec_approval is not displayed/enabled in");
     }
     Log.info("scop_and_charges_ibec_approval has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_ibec_approval has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  chkbx_scop_and_charges_matrl_transprt() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chkbx_scop_and_charges_matrl_transprt"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_chkbx_scop_and_charges_matrl_transprt);
     Log.info("scop_and_charges_matrl_transprt is displayed");
     Log.info("scop_and_charges_matrl_transprt is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_chkbx_scop_and_charges_matrl_transprt);
     	Log.info("scop_and_charges_matrl_transprt is not displayed/enabled in");
     }
     Log.info("scop_and_charges_matrl_transprt has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_matrl_transprt has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement scop_and_charges_eqipmnt_add_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_eqipmnt_add_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_eqipmnt_add_btn);
     Log.info("scop_and_charges_eqipmnt_add_btn is displayed");
     Log.info("scop_and_charges_eqipmnt_add_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_eqipmnt_add_btn);
     	Log.info("scop_and_charges_eqipmnt_add_btn is not displayed/enabled in");
     }
     Log.info("scop_and_charges_eqipmnt_add_btn has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_eqipmnt_add_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  scop_and_charges_eqipmnt_rmv_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_eqipmnt_rmv_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_eqipmnt_rmv_btn);
     Log.info("scop_and_charges_eqipmnt_rmv_btn is displayed");
     Log.info("scop_and_charges_eqipmnt_rmv_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_eqipmnt_rmv_btn);
     	Log.info("scop_and_charges_eqipmnt_rmv_btn is not displayed/enabled in");
     }
     Log.info("scop_and_charges_eqipmnt_rmv_btn has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_eqipmnt_rmv_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_sampls_or_consumables_add_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_sampls_or_consumables_add_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_sampls_or_consumables_add_btn);
     Log.info("sampls_or_consumables_add_btn is displayed");
     Log.info("sampls_or_consumables_add_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_sampls_or_consumables_add_btn);
     	Log.info("sampls_or_consumables_add_btn is not displayed/enabled in");
     }
     Log.info("sampls_or_consumables_add_btn has passed element");
	}catch (Exception e){
		Log.error("sampls_or_consumables_add_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  scop_and_charges_sampls_or_consumables_rmv_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_sampls_or_consumables_rmv_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_sampls_or_consumables_rmv_btn);
     Log.info("sampls_or_consumables_rmv_btn is displayed");
     Log.info("sampls_or_consumables_rmv_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_sampls_or_consumables_rmv_btn);
     	Log.info("sampls_or_consumables_rmv_btn is not displayed/enabled in");
     }
     Log.info("sampls_or_consumables_rmv_btn has passed element");
	}catch (Exception e){
		Log.error("sampls_or_consumables_rmv_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_ECD() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_ECD"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_ECD);
     Log.info("ECD is displayed");
     Log.info("ECD is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_ECD);
     	Log.info("ECD is not displayed/enabled in");
     }
     Log.info("ECD has passed element");
	}catch (Exception e){
		Log.error("ECD has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement scop_and_charges_eqipment_arrow_btn_frst() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_eqipment_arrow_btn_frst"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_eqipment_arrow_btn_frst);
     Log.info("eqipment_arrow_btn_frst is displayed");
     Log.info("eqipment_arrow_btn_frst is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_eqipment_arrow_btn_frst);
     	Log.info("eqipment_arrow_btn is not displayed/enabled in");
     }
     Log.info("eqipment_arrow_btn has passed element");
	}catch (Exception e){
		Log.error("eqipment_arrow_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_eqipment_select_drp_dwn_frst() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_eqipment_select_drp_dwn_frst"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_eqipment_select_drp_dwn_frst);
     Log.info("eqipment_select_drp_dwn is displayed");
     Log.info("eqipment_select_drp_dwn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_eqipment_select_drp_dwn_frst);
     	Log.info("eqipment_select_drp_dwn is not displayed/enabled in");
     }
     Log.info("eqipment_select_drp_dwn has passed element");
	}catch (Exception e){
		Log.error("eqipment_select_drp_dwn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement scop_and_charges_txt_eqipment_quant_frst() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_txt_eqipment_quant_frst"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_txt_eqipment_quant_frst);
     Log.info("eqipment_quant is displayed");
     Log.info("eqipment_quant is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_txt_eqipment_quant_frst);
     	Log.info("eqipment_quant is not displayed/enabled in");
     }
     Log.info("eqipment_quant has passed element");
	}catch (Exception e){
		Log.error("eqipment_quant has fail in catch");
		
		throw(e);
		}

	return element;
   
} 


public static WebElement  scop_and_charges_samp_and_consum_arrow_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_samp_and_consum_arrow_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_samp_and_consum_arrow_btn_frst);
     Log.info("samp_and_consum_arrow_btn is displayed");
     Log.info("samp_and_consum_arrow_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_samp_and_consum_arrow_btn_frst);
     	Log.info("samp_and_consum_arrow_btn is not displayed/enabled in");
     }
     Log.info("samp_and_consum_arrow_btn has passed element");
	}catch (Exception e){
		Log.error("samp_and_consum_arrow_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_samp_and_consum_selec_drp_dwn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_samp_and_consum_selec_drp_dwn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_samp_and_consum_arrow_btn_frst);
     Log.info("consum_selec_drp_dwn is displayed");
     Log.info("consum_selec_drp_dwn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_samp_and_consum_arrow_btn_frst);
     	Log.info("consum_selec_drp_dwn is not displayed/enabled in");
     }
     Log.info("consum_selec_drp_dwn has passed element");
	}catch (Exception e){
		Log.error("consum_selec_drp_dwn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_samp_and_consum_quant() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_samp_and_consum_quant"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_samp_and_consum_quant_frst);
     Log.info("samp_and_consum_quant is displayed");
     Log.info("samp_and_consum_quant is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_samp_and_consum_quant_frst);
     	Log.info("samp_and_consum_quant is not displayed/enabled in");
     }
     Log.info("samp_and_consum_quant has passed element");
	}catch (Exception e){
		Log.error("samp_and_consum_quant has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_man_power_ana_reporting() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_man_power_ana_reporting"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_man_power_ana_reporting);
     Log.info("man_power_ana_reporting is displayed");
     Log.info("man_power_ana_reporting is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_man_power_ana_reporting);
     	Log.info("man_power_ana_reporting is not displayed/enabled in");
     }
     Log.info("man_power_ana_reporting has passed element");
	}catch (Exception e){
		Log.error("man_power_ana_reporting has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_man_power_eqip_setup() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_man_power_eqip_setup"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_man_power_eqip_setup);
     Log.info("man_power_eqip_setup is displayed");
     Log.info("man_power_eqip_setup is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_man_power_eqip_setup);
     	Log.info("man_power_eqip_setup is not displayed/enabled in");
     }
     Log.info("man_power_eqip_setup has passed element");
	}catch (Exception e){
		Log.error("man_power_eqip_setup has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_man_power_measurement() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_man_power_measurement"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_man_power_measurement);
     Log.info("man_power_measurement is displayed");
     Log.info("man_power_measurement is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_man_power_measurement);
     	Log.info("man_power_measurement is not displayed/enabled in");
     }
     Log.info("man_power_measurement has passed element");
	}catch (Exception e){
		Log.error("man_power_measurement has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement scop_and_charges_man_power_req_review() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_man_power_req_review"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_man_power_req_review);
     Log.info("man_power_req_review is displayed");
     Log.info("man_power_req_review is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_man_power_req_review);
     	Log.info("man_power_req_review is not displayed/enabled in");
     }
     Log.info("man_power_req_review has passed element");
	}catch (Exception e){
		Log.error("man_power_req_review has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement scop_and_charges_man_power_samp_prep() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_man_power_samp_prep"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_man_power_samp_prep);
     Log.info("man_power_samp_prep is displayed");
     Log.info("man_power_samp_prep is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_man_power_samp_prep);
     	Log.info("man_power_samp_prep is not displayed/enabled in");
     }
     Log.info("man_power_samp_prep has passed element");
	}catch (Exception e){
		Log.error("man_power_samp_prep has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_submit_btn);
     Log.info("scop_and_charges_submit_btn is displayed");
     Log.info("scop_and_charges_submit_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_submit_btn);
     	Log.info("scop_and_charges_submit_btn is not displayed/enabled in");
     }
     Log.info("scop_and_charges_submit_btn has passed element");
	}catch (Exception e){
		Log.error("scop_and_charges_submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_submit_pop_up_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_submit_pop_up_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_submit_pop_up_btn);
     Log.info("submit_pop_up_btn is displayed");
     Log.info("submit_pop_up_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_submit_pop_up_btn);
     	Log.info("submit_pop_up_btn is not displayed/enabled in");
     }
     Log.info("submit_pop_up_btn has passed element");
	}catch (Exception e){
		Log.error("submit_pop_up_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement scop_and_charges_approve_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_approve_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_approve_btn);
     Log.info("approve_btn is displayed");
     Log.info("approve_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_approve_btn);
     	Log.info("approve_btn is not displayed/enabled in");
     }
     Log.info("approve_btn has passed element");
	}catch (Exception e){
		Log.error("approve_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  scop_and_charges_approve_pop_up_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_approve_pop_up_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_approve_pop_up_btn);
     Log.info("approve_pop_up_btn is displayed");
     Log.info("approve_pop_up_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_approve_pop_up_btn);
     	Log.info("approve_pop_up_btn is not displayed/enabled in");
     }
     Log.info("approve_pop_up_btn has passed element");
	}catch (Exception e){
		Log.error("approve_pop_up_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_req_change() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_req_change"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_req_change);
     Log.info("req_change is displayed");
     Log.info("req_change is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_req_change);
     	Log.info("req_change is not displayed/enabled in");
     }
     Log.info("req_change has passed element");
	}catch (Exception e){
		Log.error("req_change has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement scop_and_charges_req_change_comments_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_req_change_comments_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_req_change_comments_submit_btn);
     Log.info("comments_submit_btn is displayed");
     Log.info("comments_submit_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_req_change_comments_submit_btn);
     	Log.info("comments_submit_btn is not displayed/enabled in");
     }
     Log.info("comments_submit_btn has passed element");
	}catch (Exception e){
		Log.error("comments_submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_req_change_comments_submit_pop_up_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_req_change_comments_submit_pop_up_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_req_change_comments_submit_pop_up_btn);
     Log.info("submit_pop_up_btn is displayed");
     Log.info("submit_pop_up_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_req_change_comments_submit_pop_up_btn);
     	Log.info("submit_pop_up_btn is not displayed/enabled in");
     }
     Log.info("submit_pop_up_btn has passed element");
	}catch (Exception e){
		Log.error("submit_pop_up_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  scop_and_charges_req_change_comments_box() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_req_change_comments_box"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_req_change_comments_box);
     Log.info("req_change_comments_box is displayed");
     Log.info("req_change_comments_box is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_req_change_comments_box);
     	Log.info("req_change_comments_box is not displayed/enabled in");
     }
     Log.info("req_change_comments_box has passed element");
	}catch (Exception e){
		Log.error("req_change_comments_box has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_req_change_accept() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_req_change_accept"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_req_change_accept);
     Log.info("req_change_accept is displayed");
     Log.info("req_change_accept is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_req_change_accept);
     	Log.info("req_change_accept is not displayed/enabled in");
     }
     Log.info("req_change_accept has passed element");
	}catch (Exception e){
		Log.error("req_change_accept has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_req_change_accept_pop_up_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_req_change_accept_pop_up_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_req_change_accept_pop_up_btn);
     Log.info("req_change_accept_pop_up_btn is displayed");
     Log.info("req_change_accept_pop_up_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_req_change_accept_pop_up_btn);
     	Log.info("req_change_accept_pop_up_btn is not displayed/enabled in");
     }
     Log.info("req_change_accept_pop_up_btn has passed element");
	}catch (Exception e){
		Log.error("req_change_accept_pop_up_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_assigned_scientist_arrow_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_assigned_scientist_arrow_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_assigned_scientist_arrow_btn);
     Log.info("assigned_scientist_arrow_btn is displayed");
     Log.info("assigned_scientist_arrow_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_assigned_scientist_arrow_btn);
     	Log.info("assigned_scientist_arrow_btn is not displayed/enabled in");
     }
     Log.info("assigned_scientist_arrow_btn has passed element");
	}catch (Exception e){
		Log.error("assigned_scientist_arrow_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_selec_drp_dwn_rahul_chkbx() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_selec_drp_dwn_rahul_chkbx"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_selec_drp_dwn_rahul_chkbx);
     Log.info("drp_dwn_rahul_chkbx is displayed");
     Log.info("drp_dwn_rahul_chkbx is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_selec_drp_dwn_rahul_chkbx);
     	Log.info("drp_dwn_rahul_chkbx is not displayed/enabled in");
     }
     Log.info("drp_dwn_rahul_chkbx has passed element");
	}catch (Exception e){
		Log.error("drp_dwn_rahul_chkbx has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  scop_and_charges_assign_scientist_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scop_and_charges_assign_scientist_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_scop_and_charges_assign_scientist_submit_btn);
     Log.info("assign_scientist_submit_btn is displayed");
     Log.info("assign_scientist_submit_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_scop_and_charges_assign_scientist_submit_btn);
     	Log.info("assign_scientist_submit_btn is not displayed/enabled in");
     }
     Log.info("assign_scientist_submit_btn has passed element");
	}catch (Exception e){
		Log.error("assign_scientist_submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_txt_samples() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_txt_samples"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_txt_samples);
     Log.info("txt_samples is displayed");
     Log.info("txt_samples is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_txt_samples);
     	Log.info("txt_samples is not displayed/enabled in");
     }
     Log.info("txt_samples has passed element");
	}catch (Exception e){
		Log.error("txt_samples has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_txt_Summary_of_Analytical_Method() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_txt_Summary_of_Analytical_Method"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_txt_Summary_of_Analytical_Method);
     Log.info("Summary_of_Analytical_Method is displayed");
     Log.info("Summary_of_Analytical_Method is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_txt_Summary_of_Analytical_Method);
     	Log.info("Summary_of_Analytical_Method is not displayed/enabled in");
     }
     Log.info("Summary_of_Analytical_Method has passed element");
	}catch (Exception e){
		Log.error("Summary_of_Analytical_Method has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_txt_Results() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_txt_Results"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_txt_Results);
     Log.info("Results is displayed");
     Log.info("Results is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_txt_Results);
     	Log.info("Results is not displayed/enabled in");
     }
     Log.info("Results has passed element");
	}catch (Exception e){
		Log.error("Results has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_btn);
     Log.info("submit_btn is displayed");
     Log.info("submit_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_btn);
     	Log.info("submit_btn is not displayed/enabled in");
     }
     Log.info("submit_btn has passed element");
	}catch (Exception e){
		Log.error("submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_submit_pop_up_ok_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_submit_pop_up_ok_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_pop_up_ok_btn);
     Log.info("submit_pop_up_ok_btn is displayed");
     Log.info("submit_pop_up_ok_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_pop_up_ok_btn);
     	Log.info("submit_pop_up_ok_btn is not displayed/enabled in");
     }
     Log.info("submit_pop_up_ok_btn has passed element");
	}catch (Exception e){
		Log.error("submit_pop_up_ok_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_accept_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_accept_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_accept_btn);
     Log.info("accept_btn is displayed");
     Log.info("accept_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_accept_btn);
     	Log.info("accept_btn is not displayed/enabled in");
     }
     Log.info("accept_btn has passed element");
	}catch (Exception e){
		Log.error("accept_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_req_feedback_good_chkbx() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_req_feedback_good_chkbx"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_req_feedback_good_chkbx);
     Log.info("feedback_good_chkbx is displayed");
     Log.info("feedback_good_chkbx is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_req_feedback_good_chkbx);
     	Log.info("feedback_good_chkbx is not displayed/enabled in");
     }
     Log.info("feedback_good_chkbx has passed element");
	}catch (Exception e){
		Log.error("feedback_good_chkbx has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_req_feedback_comments_box() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_req_feedback_comments_box"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_req_feedback_comments_box);
     Log.info("feedback_comments_box is displayed");
     Log.info("feedback_comments_box is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_req_feedback_comments_box);
     	Log.info("feedback_comments_box is not displayed/enabled in");
     }
     Log.info("feedback_comments_box has passed element");
	}catch (Exception e){
		Log.error("feedback_comments_box has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  

public static WebElement  rfs_report_feedback_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_feedback_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_feedback_submit_btn);
     Log.info("feedback_submit_btn is displayed");
     Log.info("feedback_submit_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_feedback_submit_btn);
     	Log.info("feedback_submit_btn is not displayed/enabled in");
     }
     Log.info("feedback_submit_btn has passed element");
	}catch (Exception e){
		Log.error("feedback_submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  


public static WebElement  rfs_report_return_sample_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_return_sample_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_return_sample_btn);
     Log.info("return_sample_btn is displayed");
     Log.info("return_sample_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_return_sample_btn);
     	Log.info("return_sample_btn is not displayed/enabled in");
     }
     Log.info("return_sample_btn has passed element");
	}catch (Exception e){
		Log.error("return_sample_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  rfs_report_return_sample_comment_box() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_return_sample_comment_box"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_return_sample_comment_box);
     Log.info("return_sample_comment_box is displayed");
     Log.info("return_sample_comment_box is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_return_sample_comment_box);
     	Log.info("return_sample_comment_box is not displayed/enabled in");
     }
     Log.info("return_sample_comment_box has passed element");
	}catch (Exception e){
		Log.error("return_sample_comment_box has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement rfs_report_return_sample_comments_submit_btn() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_return_sample_comments_submit_btn"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_return_sample_comments_submit_btn);
     Log.info("sample_comments_submit_btn is displayed");
     Log.info("sample_comments_submit_btn is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_return_sample_comments_submit_btn);
     	Log.info("sample_comments_submit_btn is not displayed/enabled in");
     }
     Log.info("sample_comments_submit_btn has passed element");
	}catch (Exception e){
		Log.error("sample_comments_submit_btn has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  rfs_report_submit_btn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_submit_btn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_btn1);
     Log.info("report_submit_btn1 is displayed");
     Log.info("report_submit_btn1 is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_btn1);
     	Log.info("report_submit_btn1 is not displayed/enabled in");
     }
     Log.info("report_submit_btn1 has passed element");
	}catch (Exception e){
		Log.error("report_submit_btn1 has fail in catch");
		
		throw(e);
		}

	return element;
   
} 	  
public static WebElement  rfs_report_submit_btn2() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rfs_report_submit_btn2"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
    ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_btn2);
     Log.info("report_submit_btn2 is displayed");
     Log.info("report_submit_btn2 is enabled");
     }else
     {  ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_btn2);
     	Log.info("report_submit_btn2 is not displayed/enabled in");
     }
     Log.info("report_submit_btn2 has passed element");
	}catch (Exception e){
		Log.error("report_submit_btn2 has fail in catch");
		
		throw(e);
		}

	return element;
   
} 

public static WebElement  SampConsum_drp_dwn1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("SampConsum_drp_dwn1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
  //  ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_btn2);
     Log.info("SampConsum_drp_dwn1 is displayed");
     Log.info("SampConsum_drp_dwn1 is enabled");
     }else
     { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_btn2);
     	Log.info("SampConsum_drp_dwn1 is not displayed/enabled in");
     }
     Log.info("SampConsum_drp_dwn1 has passed element");
	}catch (Exception e){
		Log.error("SampConsum_drp_dwn1 has fail in catch");
		
		throw(e);
		}

	return element;
   
}

public static WebElement  SampConsum_drp_dwn_optn_select1() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("SampConsum_drp_dwn_optn_select1"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
  //  ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_btn2);
     Log.info("SampConsum_drp_dwn_optn_select1 is displayed");
     Log.info("SampConsum_drp_dwn_optn_select1 is enabled");
     }else
     { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_btn2);
     	Log.info("SampConsum_drp_dwn_optn_select1 is not displayed/enabled in");
     }
     Log.info("SampConsum_drp_dwn_optn_select1 has passed element");
	}catch (Exception e){
		Log.error("SampConsum_drp_dwn_optn_select1 has fail in catch");
		
		throw(e);
		}

	return element;
   
}

public static WebElement  quantity_txt2() throws Exception{
try{
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("quantity_txt2"))));	
		
     boolean status = true;
		if(element.isEnabled() == status)
     {
     System.out.println(element.isDisplayed());
  //  ExcelUtils.setCellData("editable", 2, Constant.Col_rfs_report_submit_btn2);
     Log.info("quantity_txt2 is displayed");
     Log.info("quantity_txt2 is enabled");
     }else
     { // ExcelUtils.setCellData("non-editable", 2, Constant.Col_rfs_report_submit_btn2);
     	Log.info("quantity_txt2 is not displayed/enabled in");
     }
     Log.info("quantity_txt2 has passed element");
	}catch (Exception e){
		Log.error("quantity_txt2 has fail in catch");
		
		throw(e);
		}

	return element;
   
}















}	 	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	 	        	


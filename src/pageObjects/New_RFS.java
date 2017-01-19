package pageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;


public class New_RFS extends BaseClass


{
	static FileInputStream file;
	static Properties prop;
	static WebDriverWait wait = new WebDriverWait(driver, 500);
	
       private static WebElement element = null;
       	
	
	
	
	//click on New RFS
	
			public New_RFS(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


			public static WebElement clik_RFS() throws Exception{
		    	try{
		    		prop=new Properties();
		    		file=new FileInputStream("D://Incture//Selenium//Kaust//src//OR//xpath.properties");
		    		prop.load(file);
		    		System.out.println("driver value from Utils txtbox - " + driver );
		    		System.out.println("wait value  from Utils txtbox - " + driver );
		    		System.out.println("load prop files " );
		    		
		    		
		            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("New_RFS")))); 
					boolean status = true;
					if(element.isDisplayed() && element.isEnabled() == status)
		            {
		            System.out.println(element.isDisplayed());
		            Log.info("RFS displayed is true ");
		            Log.info("RFS Enabled  is true ");
		            }else
		            {
		            	Log.info("Username displayed is false");
		            }
		            Log.info("Username text box is found on the Login Page");
		    	}catch (Exception e){
		       		Log.error("UserName text box is not found on the Login Page");
		       		
		       		throw(e);
		       		}
		       	return element;
		        }
			
			
		//select drop down
			
			public static WebElement selec_drop_list() throws Exception{
		    	try{
		    		//Thread.sleep(2000);
		    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_selec"))));	
		     		
		    	     boolean status = true;
		 			if(element.isDisplayed() && element.isEnabled() == status)
		             {
		             System.out.println(element.isDisplayed());
		             System.out.println(element.isEnabled());
		             ExcelUtils.setCellData("editable", 2, Constant.Col_selec_drop_list);
		            
		             Log.info("RFS select dropdown displayed is true ");
		             Log.info("RFS select dropdown Enabled  is true ");
		         	Log.info("drop down displayed and enebled ");
		             }else
		             {
		             	Log.info("drop down failed in display and enabled  ");
		             
		             }
		 			Log.info("drop down returns element ");
		            
		     	}catch (Exception e){
		        		Log.error("drop down fail in catch ");
		        		
		        		throw(e);
		        		}
		        	return element;
		    	     
		    	     
		    }
			
			//Nano fabrication
			
			public static WebElement drp_nano_fab() throws Exception{
		    	try{
		    		//Thread.sleep(2000);
		    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_nano_fab"))));	
		     		
		    	     boolean status = true;
		 			if(element.isDisplayed() && element.isEnabled() == status)
		             {
		             System.out.println(element.isDisplayed());
		             ExcelUtils.setCellData("editable", 2, Constant.Col_drp_nano_fab);
		             Log.info("nano fabric  is true ");
		             Log.info("nano fabric is true ");
		             }else
		             {
		             	Log.info("nano fabric  failed ");
		             }
		             Log.info("drop element returns nano select ");
		     	}catch (Exception e){
		        		Log.error(" nano fabric fail");
		        		
		        		throw(e);
		        		}
		        	return element;
		    	     
		    	     
		    }
			
			
			//Analytical core labs
			
			public static WebElement drp_ana_cor_lab() throws Exception{
		    	try{
		    		//Thread.sleep(2000);
		    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_ana_cor_lab"))));	
		     		
		    	     boolean status = true;
		 			if(element.isDisplayed() && element.isEnabled() == status)
		             {
		             System.out.println(element.isDisplayed());
		             ExcelUtils.setCellData("editable", 2, Constant.Col_drp_ana_cor_lab);
		             Log.info("nano fabric  is true ");
		             Log.info("nano fabric is true ");
		             }else
		             {
		             	Log.info("nano fabric  failed ");
		             }
		             Log.info("drop element returns nano select ");
		     	}catch (Exception e){
		        		Log.error(" nano fabric fail");
		        		
		        		throw(e);
		        		}
		        	return element;
		    	     
		    	     
		    }
			
			//Request for service button 
			
			public static WebElement btn_req_for_servi() throws Exception{
		    	try{
		    		
		    		Thread.sleep(20000);
		    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("btn_req_for_servi"))));	
		     		
		    	     boolean status = true;
		 			if(element.isDisplayed() && element.isEnabled() == status)
		             {
		             System.out.println(element.isDisplayed());
		             ExcelUtils.setCellData("editable", 2, Constant.Col_btn_req_for_servi);
		             Log.info("req for service btn is true ");
		             Log.info("req for service btn is true ");
		             }else
		             {
		             	Log.info("req for service btn has  failed ");
		             }
		             Log.info("req for service btn has passed element");
		     	}catch (Exception e){
		        		Log.error(" req for service btn has fail in catch ");
		        		
		        		throw(e);
		        		}
		        	return element;
		    	     
		    	     
		    } 
			
			
			
			
	
	//********************************Requester Information************************************//
	
	
	  //Requester Information //Requester Info Section
	
	
	//First Name
	 public static WebElement txt_F_Name() throws Exception{
	    	try{
	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_F_Name"))));	
	     		
	    	     boolean status = true;
	 			if(element.isDisplayed() && element.isEnabled() == status)
	             {
	             System.out.println(element.isDisplayed());
	             System.out.println("read only for first name = "+element.getAttribute("readonly"));
	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_F_Name);
		          /*  String ele= element.getAttribute("name");
		            ExcelUtils.setCellData(ele, 3, Constant.Col_UserName);*/
	             Log.info("First_Name txt_bx is displayed ");
	             Log.info("First_Name txt_bx is enabled ");
	             }else
	             {
	             	Log.info("First_Name txt_bx is not displayed/enabled in Req Info  ");
	             	 ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_F_Name);
	             }
	             Log.info("First_Name txt_bx has passed element");
	     	}catch (Exception e){
	        		Log.error(" First_Name txt_bx has fail in catch  ");
	        		
	        		throw(e);
	        		}
	        	return element;
	 }
	  
	 
	 //Last Name      	
	   public static WebElement txt_L_Name() throws Exception{
	        	    	try{
	        	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_L_Name"))));	
	        	     		
	        	    	     boolean status = true;
	        	 			if(element.isDisplayed() && element.isEnabled() == status)
	        	             {
	        	             System.out.println(element.isDisplayed());
	        	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_L_Name);
	        	             Log.info("Last_Name txt_bx is displayed ");
	        	             Log.info("Last_Name txt_bx is enabled ");
	        	             }else
	        	             {
	        	             	Log.info("Last_Name txt_bx is not displayed/enabled in Req Info ");
	        	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_L_Name);
	        	             }
	        	             Log.info("Last_Name txt_bx has passed element");
	        	     	}catch (Exception e){
	        	        		Log.error(" Last_Name txt_bx has fail in catch ");
	        	        		
	        	        		throw(e);
	        	        		}
	        	        	return element;
	   }
	       
	        // KAUST ID
	        	        	
	     	public static WebElement txt_Req_Info_Sec_Kaust_ID() throws Exception{
	        	            	try{
	        	            		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Kaust_ID"))));	
	        	             		
	        	            	     boolean status = true;
	        	         			if(element.isDisplayed() && element.isEnabled() == status)
	        	                     {
	        	                     System.out.println(element.isDisplayed());
	        	                     ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Kaust_ID);
	        	                     Log.info("KAUST ID txt_bx is displayed in Requester Info Section ");
	        	                     Log.info("KAUST ID txt_bx is enabled in Requester Info Section");
	        	                     }else
	        	                     {
	        	                     	Log.info("KAUST ID txt_bx is not displayed/enabled in Req Info");
	        	                     	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Req_Info_Sec_Kaust_ID);
	        	                     }
	        	                     Log.info("KAUST ID txt_bx has passed element");
	        	             	}catch (Exception e){
	        	                		Log.error(" KAUST ID txt_bx has fail in catch ");
	        	                		
	        	                		throw(e);
	        	                		}
	        	                	return element;
	     	}
	                         
	        	                	
	        	                	
	             	// Email           	
	        	                	
	        	            public static WebElement txt_Req_Info_Sec_Email() throws Exception{
	    	        	                 try{
	    	        	            		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Email"))));	
	    	        	             		
	    	        	            	     boolean status = true;
	    	        	         			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                     {
	    	        	                     System.out.println(element.isDisplayed());
	    	        	                     ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Email);
	    	        	                     Log.info("Email txt_bx is displayed in Requester Info Section ");
	    	        	                     Log.info("Email txt_bx is  enabled in Requester Info Section");
	    	        	                     }else
	    	        	                     {
	    	        	                     	Log.info("Email txt_bx is not displayed/enabled in Req Info ");
	    	        	                     	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Req_Info_Sec_Email);
	    	        	                     }
	    	        	                     Log.info("Email txt_bx has passed element");
	    	        	             	}catch (Exception e){
	    	        	                		Log.error(" Email txt_bx has fail in catch ");
	    	        	                		
	    	        	                		throw(e);
	    	        	                		}
	    	        	                	return element;
	        	        	
	        	            }
	        	        	//Department
	    	        	                	
	    	        	                	 public static WebElement txt_Dep() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Dep"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Dep);
	    	        	                	             Log.info("Department txt_bx is displayed");
	    	        	                	             Log.info("Department txt_bx is enabled ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Department txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Dep);
	    	        	                	             }
	    	        	                	             Log.info("Department txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Department txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }

	        	        	
	        	        	//Telephone
	    	        	                	 
	    	        	                	 public static WebElement txt_Req_Info_Sec_Tel() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Tel"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Tel);
	    	        	                	             Log.info("Telephone txt_bx is displayed in Requester Info Section ");
	    	        	                	             Log.info("Telephone txt_bx is enabled in Requester Info Section ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Telephone txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Req_Info_Sec_Tel);
	    	        	                	             }
	    	        	                	             Log.info("Telephone txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Telephone txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }

	          //Mobile
	    	        	                	 
	    	        	                	 public static WebElement txt_Mob() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Mob"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Mob);
	    	        	                	             Log.info("Mobile txt_bx is displayed ");
	    	        	                	             Log.info("Mobile txt_bx is enabled ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Mobile txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Mob);
	    	        	                	             }
	    	        	                	             Log.info("Mobile txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Mobile txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }

	       //Position
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement txt_Req_Info_Sec_Pos() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Req_Info_Sec_Pos"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Req_Info_Sec_Pos);
	    	        	                	             Log.info("Position txt_bx is displayed Requester Info Section");
	    	        	                	             Log.info("Position txt_bx is enabled Requester Info Section");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Position txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Req_Info_Sec_Pos);
	    	        	                	             	
	    	        	                	             }
	    	        	                	             Log.info("Position txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Position txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
      	                	 
	    	       //Pocket ID
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement pock_ID_drp_dwn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pock_ID_drp_dwn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_pock_ID_drp_dwn);
	    	        	                	             Log.info("Pocket ID drop_down is displayed in Req Info");
	    	        	                	             Log.info("Pocket ID drop_down is enabled in Req Info");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Pocket ID drop_down is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_pock_ID_drp_dwn);
	    	        	                	             }
	    	        	                	             Log.info("Pocket ID drop_down has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Pocket ID drop_down has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
   	                	 	                	 
	    	        	                	 
	    	        	   //Pocket ID //first option
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement Pock_ID_drp_dwn_Selec_first() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pock_ID_drp_dwn_Selec_first"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_first);
	    	        	                	             Log.info("Pocket ID first option is displayed in Req Info");
	    	        	                	             Log.info("Pocket ID first option is enabled in Req Info");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Pocket ID first option is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_first);
	    	        	                	             }
	    	        	                	             Log.info("Pocket ID first option has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Pocket ID first option has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
	                	 	                	 
	    	        	                	 
	    	        	      //Pocket ID //last option
	    	        	                	 
	    	        	                	 public static WebElement Pock_ID_drp_dwn_Selec_last() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Pock_ID_drp_dwn_Selec_last"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_last);
	    	        	                	             Log.info("Pocket ID last option is displayed Requester Info Section");
	    	        	                	             Log.info("Pocket ID last option is enabled Requester Info Section");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Pocket ID last option is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_Pock_ID_drp_dwn_Selec_last);
	    	        	                	             }
	    	        	                	             Log.info("Pocket ID last option has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Pocket ID last option has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    //Requester Information//Principal Investigator Section	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	   //PI Name
	    	        	                	 public static WebElement txt_PI_Name() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_PI_Name"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_PI_Name);
	    	        	                	             Log.info("PI Name txt_bx is displayed ");
	    	        	                	             Log.info("PI Name txt_bx is enabled ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("PI Name txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_PI_Name);
	    	        	                	             }
	    	        	                	             Log.info("PI Name txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" PI Name txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }   	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	     //KAUST ID
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement txt_Pri_Inv_Sec_Kaust_ID() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Kaust_ID"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Kaust_ID);
	    	        	                	             Log.info("KAUST ID txt_bx is displayed in Principal Investigator Section ");
	    	        	                	             Log.info("KAUST ID txt_bx is enabled in Principal Investigator Section");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("KAUST ID txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Pri_Inv_Sec_Kaust_ID);
	    	        	                	             }
	    	        	                	             Log.info("KAUST ID txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" KAUST ID txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	 //Email
	    	        	                	 
	    	        	                
	    	        	                	 public static WebElement txt_Pri_Inv_Sec_Email() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Email"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Email);
	    	        	                	             Log.info("Email txt_bx is displayed in Principal Investigator Section ");
	    	        	                	             Log.info("Email txt_bx is enabled in Principal Investigator Section ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Email txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Pri_Inv_Sec_Email);
	    	        	                	             }
	    	        	                	             Log.info("Email txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Email txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	                    
	    	        	       //Position
	    	        	
	    	        	                	 public static WebElement txt_Pri_Inv_Sec_Pos() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Pos"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Pos);
	    	        	                	             Log.info("Position txt_bx is displayed in Principal Investigator Section");
	    	        	                	             Log.info("Position txt_bx is enabled in Principal Investigator Section ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Position txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Pri_Inv_Sec_Pos);
	    	        	                	             	
	    	        	                	             }
	    	        	                	             Log.info("Position txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Position txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	       //Telephone
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement txt_Pri_Inv_Sec_Tel() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Pri_Inv_Sec_Tel"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Pri_Inv_Sec_Tel);
	    	        	                	             Log.info("Telephone txt_bx is displayed in Principal Investigator Section");
	    	        	                	             Log.info("Telephone txt_bx is enabled in Principal Investigator Section ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Telephone txt_bx is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Pri_Inv_Sec_Tel);
	    	        	                	             }
	    	        	                	             Log.info("Telephone txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Telephone txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	            //save button
	    	        	                	 
	    	        	                	 public static WebElement req_info_save_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_info_save_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_req_info_save_btn);
	    	        	                	             Log.info("save button is displayed in Req Info");
	    	        	                	             Log.info("save button is enabled in Req Info ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("save button is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_req_info_save_btn);
	    	        	                	             }
	    	        	                	             Log.info("save button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" save button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	        //prev button
	    	        	                	 
	    	        	                	
	    	        	                	 public static WebElement req_info_prev_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_info_prev_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_req_info_prev_btn);
	    	        	                	             Log.info("prev button is displayed in Req Info");
	    	        	                	             Log.info("prev button is enabled in Req Info ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("prev button is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_req_info_prev_btn);
	    	        	                	             }
	    	        	                	             Log.info("prev button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" prev button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
	    	        	                	 
	    	        	                	 
	    	        	             //next button
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement req_info_next_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_info_next_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_req_info_next_btn);
	    	        	                	             Log.info("next button is displayed in Req Info");
	    	        	                	             Log.info("next button is enabled in Req Info ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("next button is not displayed/enabled in Req Info ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_req_info_prev_btn);
	    	        	                	             }
	    	        	                	             Log.info("next button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" next button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
	    	        	                	 
	    	        	                	 
	        	        	
	        	        	
	    //***************************Sample Section********************************//
	        	    
	    	        	                	 
	    	        	      //Sample Section tab
	    	        	                	 public static WebElement tab_samp_sec() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_samp_sec"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_tab_samp_sec);
	    	        	                	             Log.info("Sample Section tab is displayed in Samp Sec");
	    	        	                	             Log.info("Sample Section tab is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Sample Section tab is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_tab_samp_sec);
	    	        	                	             }
	    	        	                	             Log.info("Sample Section tab has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Sample Section tab has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
	        	        	
	        	        	//No. of Samples
	    	        	                	 
	    	        	                	 public static WebElement txt_no_of_samp() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_no_of_samp"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_no_of_samp);
	    	        	                	             Log.info("No. of Samples txt_bx is displayed in Samp Sec");
	    	        	                	             Log.info("No. of Samples txt_bx is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Sample Section tab is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_no_of_samp);
	    	        	                	             }
	    	        	                	             Log.info("Sample Section tab has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Sample Section tab has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 	 
	    	        	                	 
	    	        	                	 
	    	        	      //Magnetic checkbox          	 
	    	        	                	 
	    	        	                	 public static WebElement magnetic_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("magnetic_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_magnetic_chkbx);
	    	        	                	             Log.info("Magnetic checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("Magnetic checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Magnetic checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_magnetic_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("Magnetic checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Magnetic checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	    	        	                	 
	        	        	
	        	        	
	        	        	//Powder checkbox
	    	        	                	 
	    	        	                	 public static WebElement powder_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("powder_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_powder_chkbx);
	    	        	                	             Log.info("Powder checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("Powder checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Powder checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_powder_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("Powder checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Powder checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	    	        	                	 	 
	    	        	                	 
	    	        	     //Film checkbox         	 
	    	        	                	 
	    	        	                	 public static WebElement film_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("film_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_film_chkbx);
	    	        	                	             Log.info("Film checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("Film checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Film checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_film_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("Film checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Film checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	      //toxic checkbox          	 
	    	        	                	 
	    	        	                	 public static WebElement toxic_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("toxic_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_toxic_chkbx);
	    	        	                	             Log.info("toxic checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("toxic checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("toxic checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_toxic_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("toxic checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" toxic checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	          //solid checkbox
	    	        	                	 
	    	        	                	 public static WebElement solid_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("solid_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_solid_chkbx);
	    	        	                	             Log.info("solid checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("solid checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("solid checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_solid_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("solid checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" solid checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	               //organic checkbox
	    	        	                	 
	    	        	                	 public static WebElement organic_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("organic_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_organic_chkbx);
	    	        	                	             Log.info("organic checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("organic checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("organic checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_organic_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("organic checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" organic checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                //inorganic checkbox
	    	        	                	 
	    	        	                	 public static WebElement inorganic_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("inorganic_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_inorganic_chkbx);
	    	        	                	             Log.info("inorganic checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("inorganic checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("inorganic checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_inorganic_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("inorganic checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" inorganic checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	
	    	        	                	 //fluid checkbox
	    	        	                	 
	    	        	                	 public static WebElement fluid_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("fluid_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_fluid_chkbx);
	    	        	                	             Log.info("fluid checkbox is displayed in Samp Sec");
	    	        	                	             Log.info("fluid checkbox is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("fluid checkbox is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_fluid_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("fluid checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" fluid checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	                	        	return element; }
	    	        	                	 
                          //Samples/Data Specifications        	 
	    	        	                	 
	    	        	                	 public static WebElement txt_samp_speci() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_samp_speci"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_samp_speci);
	    	        	                	             Log.info("Samples/Data Specifications txt_bx is displayed in Samp Sec");
	    	        	                	             Log.info("Samples/Data Specifications txt_bx is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Samples/Data Specifications txt_bx is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_samp_speci);
	    	        	                	             }
	    	        	                	             Log.info("Samples/Data Specifications txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Samples/Data Specifications txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 	            	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	    //Specific Instructions
	    	        	                	 
	    	        	                	 public static WebElement txt_speci_instn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_speci_instn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_speci_instn);
	    	        	                	             Log.info("Specific Instructions txt_bx is displayed in Samp Sec");
	    	        	                	             Log.info("Specific Instructions txt_bx is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Specific Instructions txt_bx is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_speci_instn);
	    	        	                	             }
	    	        	                	             Log.info("Specific Instructions txt_bx has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Specific Instructions txt_bx has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	 //Browse button
	    	        	                
	    	        	                	 public static WebElement samp_sec_browse_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_sec_browse_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_sec_browse_btn);
	    	        	                	             Log.info("Browse button is displayed in Samp Sec");
	    	        	                	             Log.info("Browse button is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Browse button is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_sec_browse_btn);
	    	        	                	             }
	    	        	                	             Log.info("Browse button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Browse button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	 //upload button
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement samp_sec_upload_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_sec_upload_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_sec_upload_btn);
	    	        	                	             Log.info("upload button is displayed in Samp Sec");
	    	        	                	             Log.info("upload button is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("upload button is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_sec_upload_btn);
	    	        	                	             }
	    	        	                	             Log.info("upload button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" upload button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	  //save button
	    	        	                	 
	    	        	                	 public static WebElement samp_sec_save_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_sec_save_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_sec_save_btn);
	    	        	                	             Log.info("save button is displayed in Samp Sec");
	    	        	                	             Log.info("save button is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("save button is not displayed/enabled in Samp Sec ");
	    	        	                	            	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_sec_save_btn);
	    	        	                	             }
	    	        	                	             Log.info("save button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" save button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }
	    	        	                	 
	    	        	                	 
	    	        	                	 
                                  //prev button
	    	        	                	 
	    	        	                	 public static WebElement samp_sec_prev_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_sec_prev_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_sec_prev_btn);
	    	        	                	             Log.info("prev button is displayed in Samp Sec");
	    	        	                	             Log.info("prev button is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("prev button is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_sec_prev_btn);
	    	        	                	             }
	    	        	                	             Log.info("prev button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" prev button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }             	 
	    	        	                	 
	    	        	                	 
                                   //next button
	    	        	                	 
	    	        	                	 public static WebElement samp_sec_next_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_sec_next_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_sec_next_btn);
	    	        	                	             Log.info("next button is displayed in Samp Sec");
	    	        	                	             Log.info("next button is enabled in Samp Sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("next button is not displayed/enabled in Samp Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_sec_next_btn);
	    	        	                	             }
	    	        	                	             Log.info("next button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" next button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }       	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	  //*************************calendar***********************//
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	  //Requested Completion Date//calendar
	    	        	                	 
	    	        	                	 
	    	        	                //Requested Completion Date	 
	    	        	                	 
	    	        	                	 public static WebElement req_comp_date_cal_icon() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("req_comp_date_cal_icon"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	         
	    	        	                	             Log.info("Requested Completion Date calender is displayed in serv area sec");
	    	        	                	             Log.info("Requested Completion Date calender is enabled in serv area sec ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Requested Completion Date calender is not displayed/enabled in serv area sec ");
	    	        	                	             	
	    	        	                	             }
	    	        	                	             Log.info("Requested Completion Date calender has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Requested Completion Date calender has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	    	        	                	 
	    	        	                	 
	    	        	        // calender month button       	
	    	        	                	 public static WebElement cal_month_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_month_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("month button is displayed in calendar");
	    	        	                	             Log.info("month button is enabled in calendar ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("month button is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("month button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" month button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }       
	    	        	              
	    	        	      	 //January
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m0() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m0"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("January month is displayed in month_page");
	    	        	                	             Log.info("January month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("January month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("January month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" January month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }       	 	                	 
	    	        	                	 
	    	        	                	 
                                    //February
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m1() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m1"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("February month is displayed in month_page");
	    	        	                	             Log.info("February month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("February month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("February month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" February month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	    	        	                	 
	    	        	                	 
                                       //March
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m2() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m2"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("March month is displayed in month_page");
	    	        	                	             Log.info("March month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("March month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("March month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" March month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }     	 
	    	        	                	 
                                     //April
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m3() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m3"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("April month is displayed in month_page");
	    	        	                	             Log.info("April month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("April month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("April month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" April month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  	
	    	        	                	 
                                       //May
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m4() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m4"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("May month is displayed in month_page");
	    	        	                	             Log.info("May month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("May month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("May month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" May month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  	
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
                                       //June
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m5() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m5"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("June month is displayed in month_page");
	    	        	                	             Log.info("June month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("June month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("June month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" June month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  	
	    	        	                	 
                                       //July
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m6() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m6"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("July month is displayed in month_page");
	    	        	                	             Log.info("July month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("July month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("July month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" July month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 	 
	    	        	                	 
                                        //August
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m7() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m7"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("August month is displayed in month_page");
	    	        	                	             Log.info("August month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("August month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("August month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" August month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
                                        //September
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m8() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m8"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("September month is displayed in month_page");
	    	        	                	             Log.info("September month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("September month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("September month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" September month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  	 
	    	        	              
	    	        	                	 
	    	        	                	 
	    	        	                	 
                                         //October
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m9() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m9"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("October month is displayed in month_page");
	    	        	                	             Log.info("October month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("October month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("October month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" October month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
                                         //November
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m10() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m10"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("November month is displayed in month_page");
	    	        	                	             Log.info("November month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("November month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("November month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" November month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 	 
	    	        	                	 
                                   //December
	    	        	                 	 
	    	        	                	 public static WebElement cal_MP_m11() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cal_MP_m11"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             Log.info("December month is displayed in month_page");
	    	        	                	             Log.info("December month is enabled in month_page ");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("December month is not displayed/enabled in month_page ");
	    	        	                	             }
	    	        	                	             Log.info("December month has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" December month has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 	 
	    	        	                	 
	    	        	                	 
	   //***********************Sample Delivery Section**********************//
	    	        	                	 
	    	        	                	 
	    	     //Sample Delivery Section tab
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement tab_samp_del_sec() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_samp_del_sec"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_tab_samp_del_sec);
	    	        	                	             Log.info("Sample Delivery Section tab is displayed");
	    	        	                	             Log.info("Sample Delivery Section tab is enabled");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Sample Delivery Section tab is not displayed/enabled ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_tab_samp_del_sec);
	    	        	                	             }
	    	        	                	             Log.info("Sample Delivery Section tab has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Sample Delivery Section tab has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 	 
                	 
	    	        	      //Return Samples checkbox
	    	        	                	 
	    	        	                	 public static WebElement ret_sampls_chkbx() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("ret_sampls_chkbx"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_ret_sampls_chkbx);
	    	        	                	             Log.info("Return Samples checkbox is displayed in Samp Del Sec");
	    	        	                	             Log.info("Return Samples checkbox is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Return Samples checkbox is not displayed/enabled in Samp Del Sec ");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_ret_sampls_chkbx);
	    	        	                	             }
	    	        	                	             Log.info("Return Samples checkbox has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Return Samples checkbox has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	       //Sample Delivery Mode drop down
	    	        	                	 
	    	        	                	 public static WebElement samp_del_mod_arrow_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_mod_arrow_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_mod_arrow_btn);
	    	        	                	             Log.info("Sample Delivery Mode drop down is displayed in Samp Del Sec");
	    	        	                	             Log.info("Sample Delivery Mode drop down is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Sample Delivery Mode drop down is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_del_mod_arrow_btn);
	    	        	                	             }
	    	        	                	             Log.info("Sample Delivery Mode drop down has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Sample Delivery Mode drop down has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
                            //Sample Delivery Mode drop down option
	    	        	                	 
	    	        	                	 public static WebElement samp_del_mod_selec_drp_dwn_sec() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_mod_selec_drp_dwn_sec"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_mod_selec_drp_dwn_sec);
	    	        	                	             Log.info("Sample Delivery Mode drop down option is displayed in Samp Del Sec");
	    	        	                	             Log.info("Sample Delivery Mode drop down option is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Sample Delivery Mode drop down is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_del_mod_selec_drp_dwn_sec);
	    	        	                	             }
	    	        	                	             Log.info("Sample Delivery Mode drop down has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Sample Delivery Mode drop down has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }          	 
	    	        	                	 
	    	        	    //Other option text box
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement other_option_txt() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("other_option_txt"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_other_option);
	    	        	                	             Log.info("Sample Delivery Mode drop down option is displayed in Samp Del Sec");
	    	        	                	             Log.info("Sample Delivery Mode drop down option is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Sample Delivery Mode drop down is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_other_option);
	    	        	                	             }
	    	        	                	             Log.info("Sample Delivery Mode drop down has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Sample Delivery Mode drop down has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	    	        	                	 
	    	        	                	 
	    	        	          //Report drop_down
	    	        	                	 
	    	        	                	 public static WebElement rep_arrow_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rep_arrow_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_rep_arrow_btn);
	    	        	                	             Log.info("Report drop_down is displayed in Samp Del Sec");
	    	        	                	             Log.info("Report drop_down is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Report drop_down is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_rep_arrow_btn);
	    	        	                	             }
	    	        	                	             Log.info("Report drop_down has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Report drop_down has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	    	        	                	 
	    	        	          //Report drop down option
	    	        	                	 
	    	        	                	 public static WebElement rep_drp_dwn_selec_sec() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rep_drp_dwn_selec_sec"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_rep_drp_dwn_selec_sec);
	    	        	                	             Log.info("Report drop down option is displayed in Samp Del Sec");
	    	        	                	             Log.info("Report drop down option is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Report drop down option is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_rep_drp_dwn_selec_sec);
	    	        	                	             }
	    	        	                	             Log.info("Report drop down option has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Report drop down option has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	           //save button
	    	        	                	 
	    	        	                	 public static WebElement samp_del_sec_save_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_sec_save_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_sec_save_btn);
	    	        	                	             Log.info("save button is displayed in Samp Del Sec");
	    	        	                	             Log.info("save button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("save button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_sec_save_btn);
	    	        	                	             }
	    	        	                	             Log.info("save button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" save button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	               //prev button
	    	        	                	 
	    	        	                	 public static WebElement samp_del_sec_prev_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_sec_prev_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_sec_prev_btn);
	    	        	                	             Log.info("prev button is displayed in Samp Del Sec");
	    	        	                	             Log.info("prev button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("prev button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_del_sec_prev_btn);
	    	        	                	             }
	    	        	                	             Log.info("prev button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" prev button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                //submit button
	    	        	                	 
	    	        	                	 public static WebElement samp_del_sec_submit_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("samp_del_sec_submit_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_samp_del_sec_submit_btn);
	    	        	                	             Log.info("next button is displayed in Samp Del Sec");
	    	        	                	             Log.info("next button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("next button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_samp_del_sec_submit_btn);
	    	        	                	             }
	    	        	                	             Log.info("next button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" next button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	  
	    	        	                	 
	    	        	                	 
//*************************Service Area Section***********************//  	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 //service area section tab
	    	        	                	 
	    	        	                	 public static WebElement tab_serv_area_sec() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("tab_serv_area_sec"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_tab_serv_area_sec);
	    	        	                	             Log.info("service area section tab is displayed in Samp Del Sec");
	    	        	                	             Log.info("service area section tab is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("service area section tab is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_tab_serv_area_sec);
	    	        	                	             }
	    	        	                	             Log.info("service area section tab has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" service area section tab has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }                	 
	    	        	                	 
	        	        	
	        	        	               //service area drop_down
	    	        	                	 
	    	        	                	 public static WebElement serv_area_drp_dwn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_drp_dwn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_drp_dwn);
	    	        	                	             Log.info("service area drop_down is displayed in Samp Del Sec");
	    	        	                	             Log.info("service area drop_down is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("service area drop_down is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_drp_dwn);
	    	        	                	             }
	    	        	                	             Log.info("service area drop_down has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" service area drop_down has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }   
	        	        	
	        	        	             //service area drop_down first option
	    	        	                	 
	    	        	                	 public static WebElement serv_area_drp_dwn_selec_frst() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_drp_dwn_selec_frst"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_drp_dwn_selec_frst);
	    	        	                	             Log.info("service area drop_down first option is displayed in Samp Del Sec");
	    	        	                	             Log.info("service area drop_down first option is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("service area drop_down first option is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_drp_dwn_selec_frst);
	    	        	                	             }
	    	        	                	             Log.info("service area drop_down first option has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" service area drop_down first option has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	        	        	
	        	        	
	        	        	            //service area drop_down last option
	    	        	                	 
	    	        	                	 public static WebElement serv_area_drp_dwn_selec_last() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_drp_dwn_selec_last"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_drp_dwn_selec_last);
	    	        	                	             Log.info("service area drop_down last option is displayed in Samp Del Sec");
	    	        	                	             Log.info("service area drop_down last option is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("service area drop_down last option is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_drp_dwn_selec_last);
	    	        	                	             }
	    	        	                	             Log.info("service area drop_down last option has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" service area drop_down last option has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    }  
	        	        	
	        	        	     //Aim of study
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement txt_Aim_of_stdy() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_Aim_of_stdy"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_Aim_of_stdy);
	    	        	                	             Log.info("Aim of study text box is displayed in Samp Del Sec");
	    	        	                	             Log.info("Aim of study text box is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Aim of study text box is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_Aim_of_stdy);
	    	        	                	             }
	    	        	                	             Log.info("Aim of study text box has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Aim of study text box has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	        	        	//Expected Data/Deliverables 
	    	        	                	 
	    	        	                	 public static WebElement txt_exp_data_del() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_exp_data_del"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_exp_data_del);
	    	        	                	             Log.info("Aim of study text box is displayed in Samp Del Sec");
	    	        	                	             Log.info("Aim of study text box is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Expected Data/Deliverables  text box is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_exp_data_del);
	    	        	                	             }
	    	        	                	             Log.info("Expected Data/Deliverables  text box has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Expected Data/Deliverables  text box has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	    //Method
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement txt_meth() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("txt_meth"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_txt_meth);
	    	        	                	             Log.info("Method text box is displayed in Samp Del Sec");
	    	        	                	             Log.info("Method text box is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Method text box is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_txt_meth);
	    	        	                	             }
	    	        	                	             Log.info("Method text box has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Method text box has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	        	        	//Browse button
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 public static WebElement serv_area_Sec_browse_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_browse_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_browse_btn);
	    	        	                	             Log.info("Browse button is displayed in Samp Del Sec");
	    	        	                	             Log.info("Browse button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Browse button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_Sec_browse_btn);
	    	        	                	             }
	    	        	                	             Log.info("Browse button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Browse button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	        	        	
	        	        	
	        	        	//Upload button
	    	        	                	 
	    	        	                	 public static WebElement serv_area_Sec_upload_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_upload_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_upload_btn);
	    	        	                	             Log.info("Upload button is displayed in Samp Del Sec");
	    	        	                	             Log.info("Upload button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Upload button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_Sec_upload_btn);
	    	        	                	             }
	    	        	                	             Log.info("Upload button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Upload button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	        //pop-up        	 
	    	        	                	 public static WebElement pop_up() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pop_up"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_pop_up);
	    	        	                	             Log.info("pop-up is displayed in Samp Del Sec");
	    	        	                	             Log.info("pop-up is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("pop-up is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_pop_up);
	    	        	                	             }
	    	        	                	             Log.info("pop-up has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" pop-up has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
      	 
	    	        	                	     	 
	    	        	                	 
	    	        	  //Save button
	    	        	                	 
	    	        	             
	    	        	                	 public static WebElement serv_area_Sec_save_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_save_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_save_btn);
	    	        	                	             Log.info("Save button is displayed in Samp Del Sec");
	    	        	                	             Log.info("Save button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("Save button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_Sec_save_btn);
	    	        	                	             }
	    	        	                	             Log.info("Save button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" Save button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	   //prev button
	    	        	                	 
	    	        	                	 public static WebElement serv_area_Sec_prev_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_prev_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_prev_btn);
	    	        	                	             Log.info("prev button is displayed in Samp Del Sec");
	    	        	                	             Log.info("prev button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("prev button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_Sec_prev_btn);
	    	        	                	             }
	    	        	                	             Log.info("prev button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" prev button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	     //next button
	    	        	                	 
	    	        	                	 public static WebElement serv_area_Sec_next_btn() throws Exception{
	    	        	                	    	try{
	    	        	                	    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("serv_area_Sec_next_btn"))));	
	    	        	                	     		
	    	        	                	    	     boolean status = true;
	    	        	                	 			if(element.isDisplayed() && element.isEnabled() == status)
	    	        	                	             {
	    	        	                	             System.out.println(element.isDisplayed());
	    	        	                	             ExcelUtils.setCellData("editable", 2, Constant.Col_serv_area_Sec_next_btn);
	    	        	                	             Log.info("next button is displayed in Samp Del Sec");
	    	        	                	             Log.info("next button is enabled in Samp Del Sec");
	    	        	                	             }else
	    	        	                	             {
	    	        	                	             	Log.info("next button is not displayed/enabled in in Samp Del Sec");
	    	        	                	             	ExcelUtils.setCellData("NOT editable", 2, Constant.Col_serv_area_Sec_next_btn);
	    	        	                	             }
	    	        	                	             Log.info("next button has passed element");
	    	        	                	     	}catch (Exception e){
	    	        	                	        		Log.error(" next button has fail in catch ");
	    	        	                	        		
	    	        	                	        		throw(e);
	    	        	                	        		}
	    	        	        
	    	        	                	        	return element;
	    	        	                	           
	    	        	                	    } 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	    	        	                	 
	 
}

package PageComponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebPageUtil;

public class LoginPage extends WebPageUtil{
	
	
	//Page object model framework
		
		
		@FindBy(id = "btn-make-appointment") // login page
		WebElement Clickapp;
		
		@FindBy(id = "txt-username")
		WebElement username;
		
		@FindBy(id = "txt-password")
		WebElement password;
		
		@FindBy(id = "btn-login")
		WebElement login;
		
		//Make appoinment 
		
		@FindBy(id="combo_facility")
		WebElement Facility;
		
		
		@FindBy(id = "chk_hospotal_readmission")
		WebElement box;
		
		@FindBy(id="radio_program_medicaid")
		WebElement button;
		
		@FindBy(id="txt_visit_date")
		WebElement dob;
		
		@FindBy(id="txt_visit_date")
		WebElement date;
		
		@FindBy(id="btn-book-appointment")
		WebElement book;
		
		//Appoinment confirmation
		
		@FindBy(xpath = "//*[@id=\"summary\"]/div/div/div[7]/p/a")
		WebElement Homepage;
		
		@FindBy(id = "menu-toggle")
		WebElement menu;
		
		//take history of Appoinment
		
		
		@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")
		WebElement History;
		
		@FindBy(id = "menu-toggle")
		WebElement menu1;
		
		
        // logout the website
		
		
		@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a")
		WebElement logout;
		
		
		public LoginPage() {   //pagefactory
			
			PageFactory.initElements(driver,this);
		}
		
		public void openpage()  {     //method of page object model
			
			iconclick(Clickapp);
			
			keyinput(username, "John Doe");
			
			keyinput(password,"ThisIsNotAPassword");
			
			iconclick(login);
			
		}
		public void booking() throws Throwable  {
			
		    keyinput(Facility,"HongKong CURA HealthCare Centre");
			
         	iconclick(box);
         	
         	iconclick(button);
         	
	        iconclick(dob);
	        
	        keyinput(date,"1/7/24");
	        
	        iconclick(book);
		
	        iconclick(Homepage);
	        
	        iconclick(menu);
	        
	        Thread.sleep(1000);
	        
	        WebPageUtil.TakeScreenshot();
	        
	        iconclick(History);
	         
	        iconclick(menu1);
	          
	         waitImplicit(30);
	          
	         iconclick(logout);
		}

		
	}


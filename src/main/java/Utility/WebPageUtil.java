package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebPageUtil {

public static WebDriver driver;
	
	 
	
	
	public static void init() {  //create webbrowser
	   driver = new ChromeDriver();
	   //ChromeDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");	
	}
		
	 public static void iconclick(WebElement element)   { //craete the click button method
    	element.click();
    }
    
     public static void browserclose() { //create the close browser method
    	
    	 driver.close();
    }
     public static void keyinput(WebElement element, String value) { //create the inputkey for sendkey
    		
    		element.sendKeys(value);
    	}

    	public static void waitImplicit( int Value) {  //create the waitimplicit method
    	  
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Value));
    	}

    	public static void waitExplicit(WebElement element, int Value) { //create the explicitwait method
    	  
    	  waitExplicit(element, Value);
    	}

    	public static String keyoutput(WebElement element) { //create the output for get the key 
    		
    		waitExplicit(element, 10);
    		String value = element.getText();
    		return value;
    	}
    	public static void dropdown(WebElement element, String value) { // create dropdown method
    		
    		Select sel = new Select(element);
    		sel.selectByVisibleText(value);

    	}
    	public static void Alertbox(WebElement element) { //alertbox method
    		driver.switchTo().alert().dismiss();
    		
    	}
    	
    	public static void Action(WebElement Element) {
    		
    		Actions act = new Actions(driver);
    		act.sendKeys(Keys.PAGE_DOWN).build().perform();
    		
    	}
    	
    	public static void TakeScreenshot()  { //create screenshots method
    		
    		try {
    			
    			String location = System.getProperty("user.dir") + "/Screenshots/picture2.png";
    		
    		TakesScreenshot ts = (TakesScreenshot)driver;
    		
    		File souce = ts.getScreenshotAs(OutputType.FILE);
    		
    	    File destination = new File(location);
    	
    		FileHandler.copy(souce, destination);
    		
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}}
    	
    		


    

	
	


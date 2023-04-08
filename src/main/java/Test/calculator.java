package Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calculator 
{

	WebDriver driver;
	
	 
		
	
		
	@Test
		public  void calculations() throws InterruptedException, IOException
		{
			
			   System.setProperty("webdriver.chrome.driver", "./Driverfile\\chromedriver.exe");
				
			     WebDriver driver = new ChromeDriver();
					driver.get(" https://www.calculator.net/");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					

		
	
	
	

		//1.Multiplication
		
		WebElement value4= driver.findElement(By.xpath("//span[text()='4']"));
		value4.click();
		
		
		WebElement value2= driver.findElement(By.xpath("//span[text()='2']"));
		value2.click();
		
		
		WebElement value3= driver.findElement(By.xpath("//span[text()='3']"));
		value3.click();
		
		
		WebElement multiply= driver.findElement(By.xpath("(//span[@class='sciop'])[5]"));
		multiply.click();
		
		
		WebElement value5= driver.findElement(By.xpath("//span[text()='5']"));
		value5.click();
		
		
		value2.click();
		
		
		value5.click();
		
		
		WebElement multiplyanswer= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		 String actualresult=multiplyanswer.getText();
		String expectedresult="222075";
		
		if(actualresult.equals(expectedresult));
		{
			System.out.println("Multiplication Test case pass");
		}
		
		Thread.sleep(3000);
		
		WebElement clear= driver.findElement(By.xpath("//span[text()='AC']"));
		clear.click();
		
		
		
		
		
		
		
		
		//2.Division
		value4.click();
		
		WebElement value0= driver.findElement(By.xpath("//span[text()='0']"));
		value0.click();
		value0.click();
		value0.click();
		
		WebElement Div= driver.findElement(By.xpath("(//span[@class='sciop'])[8]"));
		Div.click();
		value2.click();
		value0.click();
		value0.click();
		
		WebElement Div1= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		String actualresult2=Div1.getText();
		String expectedresult2="20";
		
		if(actualresult2.equals(expectedresult2));
		{
			System.out.println("division Test case pass");
		}
		
		 
		Thread.sleep(3000);
		
		WebElement clear2= driver.findElement(By.xpath("//span[text()='AC']"));
		clear2.click();
		
		
		
		
		
		
		
		//3.Addition
		
		WebElement Sub= driver.findElement(By.xpath("(//span[@class='sciop'])[3]"));
		WebElement Add= driver.findElement(By.xpath("(//span[@class='sciop'])[1]"));
		Sub.click();
		value2.click();
		value3.click();
		value4.click();
		value2.click();
		value3.click();
		value4.click();
		Add.click();
		value3.click();
		value4.click();
		value5.click();
		value3.click();
		value4.click();
		value5.click();
		
		WebElement Addition= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		String actualresult3=Addition.getText();
		String expectedresult3="111111";
		
		if(actualresult3.equals(expectedresult3));
		{
			System.out.println("Addition Test case pass");
	
		}
		
		Thread.sleep(3000);
		
		WebElement clear3= driver.findElement(By.xpath("//span[text()='AC']"));
		clear3.click();
		
		
		
		
		
		
		
		//4.Subtraction
		
		
		WebElement value8= driver.findElement(By.xpath("//span[text()='8']"));
		WebElement value9= driver.findElement(By.xpath("//span[text()='9']"));
		WebElement obrac= driver.findElement(By.xpath("//span[text()='(']"));
		WebElement cbrac= driver.findElement(By.xpath("//span[text()=')']"));
		value2.click();
		value3.click();
		value4.click();
		value8.click();
		value2.click();
		value3.click();
		Sub.click();
		obrac.click();
		Sub.click();
		value2.click();
		value3.click();
		value0.click();
		value9.click();
		value4.click();
		value8.click();
		value2.click();
		value3.click();
		cbrac.click();
		
		WebElement subtraction= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		String actualresult4=subtraction.getText();
		String expectedresult4="23329646";
		
		if(actualresult4.equals(expectedresult4));
		{
			System.out.println("Subtraction Test case passed");
		}
			
		Thread.sleep(3000);
		
		WebElement clear4= driver.findElement(By.xpath("//span[text()='AC']"));
		clear4.click();
		
					
				
					
					
		
						
					
			System.out.println("All calculations are done successfully");
			driver.quit();	
			
}	}			
					
				
					
					
		

		


		
		



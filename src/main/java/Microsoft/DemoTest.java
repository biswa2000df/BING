package Microsoft;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://rlosuat.csb.co.in/csfweb/");
		
		driver.findElement(By.id("username")).sendKeys("1111");
		
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("NEWnew@123");
		
		driver.findElement(By.id("submit")).click();
		
//		driver.switchTo().fr
		
		Thread.sleep(3000);
		
		

		Set<String> allWindowHandles = driver.getWindowHandles();
		
		
		ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
		System.out.println("No. of tabs: " + tabs.size());
		
		 String secondTab = tabs.get(1); 
		    driver.switchTo().window(secondTab);
		
		    
		    int size = driver.findElements(By.tagName("iframe")).size();
			
			System.out.println(size);
		
			
			driver.switchTo().frame(2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Operations\"]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//*[text()=\"Application Entry\"]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"locationcmbo\"]")));
		
			s.selectByIndex(3);
			
//			
			
			driver.findElement(By.id("i_QF__id_sd_desclayoutEvalDiv_comp_APPPF")).click();
			
			driver.findElement(By.xpath("//*[@id=\"i_QF__id_sd_desclayoutEvalDiv_comp_APPPF\"]/option[4]")).click();

			driver.findElement(By.xpath("//*[text()=\"OK\"]")).click();
			
//			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("(//*[@class=\"popsearch\"])[4]")).click();
			
//			driver.switchTo().parentFrame();
			
			driver.switchTo().defaultContent();
			
		WebElement ele=	driver.findElement(By.xpath("(//*[@id=\"code\"])[2]"));
		
		ele.click();
//		System.out.println(ele.getText());
			
		System.out.println("sgfa");
	
	}

}

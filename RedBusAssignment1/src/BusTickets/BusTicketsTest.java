package BusTickets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BusTicketsTest {
	
	public static void main(String[] args) {
		
		// Invoke the browser
		
		//System.setProperty("webdriver.chrome.driver", "D:\\KALYANI WORKPLACE\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("11111");
		
		//Local Elements BusTicket tab
	    //driver.findElement(By.linkText("BUS TICKETS ")).click();
		System.out.println("222222");
		
		//search ticket from Nagpur to Bangalore
		
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div[3]/div[1]/input[2]"))
		.sendKeys("Nagpur");
		
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/input"))
				.sendKeys("Bangalore");

		
		
		
		
		
		
	}

}

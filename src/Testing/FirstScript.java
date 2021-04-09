package Testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abidb\\Downloads\\Compressed\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.className("nav-item")).click();
	
	driver.findElement(By.linkText("About")).click();
	Thread.sleep(4000);
	
	String count = driver.findElement(By.cssSelector("div.header-description p")).getText();
	
	String testText = "Selenium is a suite of tools for automating web browsers.";
	System.out.println(count);
	
	if (count.equals(testText)) {
		
		System.out.println("Test Successful");
	}
	else {
		
		System.out.println("Test Failure");
	}
	
	Thread.sleep(4000);
	driver.navigate().to("https://www.selenium.dev/");
	Thread.sleep(4000);
	driver.close();
	Thread.sleep(4000);
}
}

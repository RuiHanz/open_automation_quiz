package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.baidu.com");
//		driver.findElement(By.id("kw")).sendKeys("ÕÅÈðêÏ");
//		driver.findElement(By.id("su")).click();
//		driver.findElement(By.linkText("2")).click();
//		driver.findElements(By.className("t")).forEach(x -> {
//			String name = x.getText();
//			String href = x.findElement(By.tagName("a")).getAttribute("href");
//			System.out.println(name + "->" + href);
//		});
//		driver.findElement(By.id("kw")).sendKeys("selenium");
//		driver.findElement(By.id("su")).click();	
//		driver.findElement(By.linkText("2")).click();
//		driver.findElements(By.className("t")).forEach(x -> {
//			String name = x.getText();
//			String href = x.findElement(By.tagName("a")).getAttribute("href");
//			System.out.println(name + "->" + href);
//		});
//		driver.get("https://templates.jinshuju.net/detail/Dv9JPD");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@value='ffwi']")).click();
//		Thread.sleep(2000);
//		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss"); 
//		String time = dateFormat.format(Calendar.getInstance().getTime()); 
//		try {
//			Files.copy(file, new File("E:", time + ".png"));
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
//		Thread.sleep(3000);
		//driver.findElement(By.className("ant-btn ant-btn-primary sc-jRQBWg elvOuI form-theme--submit-button")).click();
	}}

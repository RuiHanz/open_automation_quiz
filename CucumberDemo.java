package steps;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemo {
	
	static 	WebDriver driver = null;
	
	static {
		System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("open the web page of enterprise resumption application data submission")
	public void open() throws InterruptedException {
		driver.get("https://templates.jinshuju.net/detail/Dv9JPD");
		Thread.sleep(2000);
	}

	@When("user fills in the information")
	public void input() throws InterruptedException {
		//选中第二项
		driver.findElement(By.xpath("//input[@value='ffwi']")).click();
		Thread.sleep(2000);
		//第一页截图
		screenShot(driver);
		//点击下一页
		driver.findElement(By.className("ant-btn ant-btn-primary sc-jRQBWg elvOuI form-theme--submit-button")).click();
		Thread.sleep(2000);
		//填写信息
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = new Date();
		driver.findElement(By.xpath("//input[@placeholder='年-月-日' and @type='text']")).sendKeys(dateFormat2.format(date));
		driver.findElement(By.xpath("//input[@name='field_6' and @type='text']")).sendKeys("自动化");
		driver.findElement(By.xpath("//input[@name='field_7' and @type='text']")).sendKeys("13888888888");
		//第二页截图
		screenShot(driver);
		driver.findElement(By.className("ant-btn ant-btn-primary sc-jRQBWg elvOuI form-theme--submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='field_10' and @type='text']")).sendKeys("测试公司");
		driver.findElement(By.xpath("//input[@role='spinbutton' and @step='1']")).sendKeys("99");
		driver.findElement(By.xpath("//input[@placeholder='年-月-日' and @type='text']")).sendKeys(dateFormat2.format(date));
		driver.findElement(By.xpath("//input[@role='spinbutton' and @step='1']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='field_14' and @type='text']")).sendKeys("张瑞晗");
		driver.findElement(By.xpath("//input[@name='field_15' and @type='text']")).sendKeys("13888888888");
		//第三页截图
		screenShot(driver);
		Thread.sleep(2000);
		
	}

	@And("user submit results")
	public void user_submit_results() throws InterruptedException {
		driver.findElement(By.className("ant-btn ant-btn-primary sc-jRQBWg elvOuI published-form__submit form-theme--submit-button")).click();
		Thread.sleep(2000);
		//第四页截图
		screenShot(driver);
	}

	@Then("generate report")
	public void generate_report() {
		System.out.println("生成报告");
	}
	
	public void screenShot(WebDriver driver){
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss"); 
		String time = dateFormat.format(Calendar.getInstance().getTime()); 
		try {
			Files.copy(file, new File("E:", time + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			driver.quit();
		}
	}
}

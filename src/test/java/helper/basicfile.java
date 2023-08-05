package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.github.dockerjava.api.model.Driver;
import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basicfile {
	public static WebDriver driver;

	public static Properties prop;
	static {
		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/propertyfile/basicControlproperty.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
@Before
	public void setup1() {
		String browser=prop.getProperty("browsername");
if(browser.equals("chrome")) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origin=*");
	option.addArguments("--incognito");
	driver = new ChromeDriver(option);
}else if(browser.equals("edge")) {
	
	EdgeOptions option= new EdgeOptions();
	option.addArguments("--remote-allow-orgin=*");
	option.addArguments("--incognito");
	driver = new EdgeDriver(option);
}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}
	
	public void laststep() {
		driver.quit();
	}
	public void takesnap() throws IOException {
		
		TakesScreenshot t= (TakesScreenshot) driver;
		File src=	t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot/test1.png"));
		
	}
	@After
	public void teardown(Scenario s) throws IOException {
		
		if(s.isFailed()) {
			
			TakesScreenshot t= (TakesScreenshot) driver;
			File src=	t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screenshot/"+s.getName()+".png"));
		}
		driver.quit();
	}
	
		
			
	}		

	



package page;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.basicfile;

public class basicControlcoding extends basicfile {

	public void enter_the_first_and_last_name() {
		
		WebElement frstnme = driver.findElement(By.cssSelector("input#firstName"));
		frstnme.sendKeys(prop.getProperty("firstname"));
		WebElement lstnme = driver.findElement(By.cssSelector("input#lastName"));
		lstnme.sendKeys(prop.getProperty("Lastname"));
/////himanshu
	}

	public void select_the_gender() {

		String gndr = prop.getProperty("gender");
		if (gndr.equals("male")) {
			WebElement malebtn = driver.findElement(By.cssSelector("input#malerb"));
			malebtn.click();

		} else if (gndr.equals("female")) {
			WebElement femalebtn = driver.findElement(By.cssSelector("input#femalerb"));
			femalebtn.click();
		}

	}

	public void select_language() {

		String lng = prop.getProperty("langauge");
		if (lng.equals("english")) {
			WebElement engbtn = driver.findElement(By.cssSelector("input#englishchbx"));
			engbtn.click();

		} else if (lng.equals("hindi")) {
			WebElement hndbtn = driver.findElement(By.cssSelector("input#hindichbx"));
			hndbtn.click();

		} else if (lng.equals("chinese")) {

			WebElement chinbtn = driver.findElement(By.cssSelector("input#chinesechbx"));
			chinbtn.click();
		} else if (lng.equals("spanish")) {

			WebElement spnbtn = driver.findElement(By.cssSelector("input#spanishchbx"));
			spnbtn.click();
		} else if (lng.equals("latin")) {

			WebElement ltnbtn = driver.findElement(By.cssSelector("input#latinchbx"));
			ltnbtn.click();
		} else if (lng.equals("latin")) {

			WebElement frnchbtn = driver.findElement(By.cssSelector("input#frenchchbx"));
			frnchbtn.click();
		}

	}

	public void enter_email_and_password() {
		WebElement eml = driver.findElement(By.cssSelector("input#email"));
		eml.sendKeys(prop.getProperty("email"));

		WebElement pswrd = driver.findElement(By.cssSelector("input#password"));
		pswrd.sendKeys(prop.getProperty("password"));

	}

	public void click_register_button() {

		WebElement regbtn = driver.findElement(By.cssSelector("button#registerbtn"));
		regbtn.click();

	}

	public void validate_succesful_register() throws IOException {

		Assert.assertTrue(driver.findElement(By.cssSelector("label#msg")).isDisplayed());
		
		
	}

}

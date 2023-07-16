package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.ExcellLibrary;
import generic.Utility;

import generic.Autoconstant;
import generic.Basepage;

public class Actitime extends Basepage implements Autoconstant
{

public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernametextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@class=\"content users\"]")
	private WebElement user;
	
	@FindBy(xpath = "(//div[@class=\"components_button_label\"])[1]")
	private WebElement newuser;
	
	@FindBy(xpath = "(//input[@name=\"firstName\"])[2]")
	private WebElement firstname;
	
	@FindBy(xpath = "(//input[@name=\"lastName\"])[2]")
	private WebElement lastname;
	
	@FindBy(xpath = "(//input[@name=\"email\"])[2]")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class=\"dropdownContainer simpleListMenu \"]//div[.='Quality Control']")
    private WebElement dept;
	
	@FindBy(xpath = "//div[.='Save & Send Invitation']")
	private WebElement save;
	
	@FindBy(xpath = "(//span[.='Close'])[1]")
	private WebElement close;
	public Actitime(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginMethod()  throws IOException, InterruptedException
	{
		
		//visibilityofElement(driver,usernametextfield);
	     Utility.highlightElement(driver, usernametextfield);
		usernametextfield.sendKeys(ExcellLibrary.getcellvalue(Sheet_name_path,1,0));
		
		Utility.highlightElement(driver, passwordtextfield);
		//visibilityofElement(driver, passwordtextfield);
		passwordtextfield.sendKeys(ExcellLibrary.getcellvalue(Sheet_name_path, 1, 1));

		//visibilityofElement(driver, keepLoggedInCheckBox);
		javascriptClick(driver, keepLoggedInCheckBox);

		//visibilityofElement(driver, loginButton);
		javascriptClick(driver, loginButton);
		
		/*
		 * Thread.sleep(5000); javascriptClick(driver, user); Thread.sleep(5000);
		 * javascriptClick(driver, newuser);
		 * 
		 * Thread.sleep(5000); Utility.highlightElement(driver, firstname);
		 * firstname.sendKeys(ExcellLibrary.getcellvalue(Sheet_name_path, 1, 2));
		 * 
		 * Thread.sleep(5000); Utility.highlightElement(driver, lastname);
		 * lastname.sendKeys(ExcellLibrary.getcellvalue(Sheet_name_path, 1, 3));
		 * 
		 * 
		 * Thread.sleep(5000); Utility.highlightElement(driver, email);
		 * email.sendKeys(ExcellLibrary.getcellvalue(Sheet_name_path, 1, 4));
		 * 
		 * Thread.sleep(5000); javascriptClick(driver, dept); Thread.sleep(5000);
		 * javascriptClick(driver, save); Thread.sleep(5000); javascriptClick(driver,
		 * close);
		 */
	}
	
	public void titlevalidate()
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}
}
